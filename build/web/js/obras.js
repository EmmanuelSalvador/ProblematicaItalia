/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(
        function () {
            $('#tbObras').DataTable(
                    {
                        "ajax": "ConsultaObra",

                        "columns": [//Atributos que se pondrán en cada columna
                            {"data": "idObras"},
                            {"data": "nombreObra"},
                            {"data": "anioCreacion"},
                            {"data": "fkIdArtista"},
                            {"data": "descripcionCorta"},
                            {"data": "descripcionLarga"},
                            {"data": "valoracion"},
                            {"data": "cantidadVisitas"},
                            {"data": "fkIdSeccion"},

                            {"data":
                                        function (row) {
                                            var r = row['id_obra'] + "-" + row['nombre_obra'] + "-" + row['anio_creacion'] + "-" + row['fk_id_artista'] + "-" + row['descripcion_corta']
                                                    + "-" + row['descripcion_larga'] + "-" + row['valoracion'] + "-" + row['cantidad_visitas'] + "-" + row['fk_id_seccion']; //Acceder
                                            console.log('valor de r' + r);
                                            var botones = "<button id='btnBorrar' class='btn btn-danger btn-xs' onClick='deleteObra(" + row['idObras'] + ")'>Borrar</button>";
                                            botones += "<button id='btnEditar' class='btn btn-xs btn-primary' onClick='showObra(" + row['idObras'] + ",\"" + row['nombreObra']
                                                    + "\"," + row['anioCreacion'] + "," + row['fkIdArtista'] + ",\"" + row['descripcionCorta'] + "\",\"" + row['descripcionLarga']
                                                    + "\"," + row['valoracion'] + ", " + row['cantidadVisitas'] + ", " + row['fkIdSeccion']
                                                    + ")'>Editar</button>";
                                            return botones;
                                        }
                            }
                        ]
                    });

            $('#btnGuardarCambios').on('click', function () {
                updateObra();
            });
            $('#btnNuevaObra').on('click', function () {
                nuevaObra();
            });


            //

            //

            //

        }); // que se ejecute ya que esté listo
//


function deleteObra(id_obra) {

    //Utilizando Ajax para realizar una petición al servlet que elimina personas

    Swal.fire({
        title: '¿Estas seguro de que deseas eliminarlo?',
        text: "El borrado no se puede revertir",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Eliminarlo!',
        cancelButtonText: 'Cancelar'
    }).then((result) => {
        if (result.value) {
            $.ajax({
                url: "EliminaObra", //Url del Servlet
                type: "POST", //Método HTTP por el que se hace la petición
                data: {//Es la información que mando al servlet
                    id_obra: id_obra
                }
            }).done(function (json) { //Se ejecuta cuando todo sale bien
                //alert(json.msj);
                Swal.fire(
                        'Borrado!',
                        json.msj,
                        'success'
                        );
                //Refrescando la tabla
                $('#tbObras').dataTable().api().ajax.reload();
            }).fail(function (json) { //Se ejecuta cuando algo sale mal
                alert(json.msj);

                //alert("error");
            });
        }
    });
}



//
function nuevaObra() {
    $.ajax({
        url: 'NuevaObra',
        type: 'POST',
        data: {
            nombre_obra: $("#nombre_obraN").val(),
            anio_creacion: $("#anio_creacionN").val(),
            fk_id_artista: $("#fk_id_artistaN").val(),
            descripcion_corta: $("#descripcion_cortaN").val(),
            descripcion_larga: $("#descripcion_largaN").val(),
            valoracion: 0,
            cantidad_visitas: 0,
            fk_id_seccion: $("#fk_id_seccionN").val()

        }
    }).done(function (json) { //Se ejecuta cuando todo sale bien
        //alert(json.msj);
        Swal.fire(
                'Obra creada',
                json.msj,
                'success'
                );
        //Refrescando la tabla
        $('#tbObras').dataTable().api().ajax.reload();
    }).fail(function (json) { //Se ejecuta cuando algo sale mal
        alert(json.msj);
        console.log("Entré aqui", );
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Hubo un error al crear'
        });
    });


}

function showObra(id_obra, nombre_obra, anio_creacion, fk_id_artista, descripcion_corta, descripcion_larga, valoracion, cantidad_visitas, fk_id_seccion) {
    $("#id_obraE").val(id_obra);
    $("#nombre_obraE").val(nombre_obra);
    $("#anio_creacionE").val(anio_creacion);
    $("#fk_id_artistaE").val(fk_id_artista);
    $("#descripcion_cortaE").val(descripcion_corta);
    $("#descripcion_largaE").val(descripcion_larga);
    $("#valoracionE").val(valoracion);
    $("#cantidad_visitasE").val(cantidad_visitas);
    $("#fk_id_seccionE").val(fk_id_seccion);
    $("#modalObraEdit").modal("show");

}

function updateObra() {
    $.ajax({
        url: 'ActualizaObra',
        type: 'POST',
        data: {
            id_obra: $("#id_obraE").val(),
            nombre_obra: $("#nombre_obraE").val(),
            anio_creacion: $("#anio_creacionE").val(),
            fk_id_artista: $("#fk_id_artistaE").val(),
            descripcion_corta: $("#descripcion_cortaE").val(),
            descripcion_larga: $("#descripcion_largaE").val(),
            valoracion: $("#valoracionE").val(),
            cantidad_visitas: $("#cantidad_visitasE").val(),
            fk_id_seccion: $("#fk_id_seccionE").val()

        }
    }).done(function (json) { //Se ejecuta cuando todo sale bien
        //alert(json.msj);
        //Refrescando la tabla
        Swal.fire(
                'Obra actualizada',
                json.msj,
                'success'
                );
        $('#tbObras').dataTable().api().ajax.reload();

        //Cerrando el modal
        $("#modalObraEdit").modal("hide");
    }).fail(function (json) { //Se ejecuta cuando algo sale mal
        //alert(json.msj);
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Hubo un error al actualizar'
        });
    });
}
