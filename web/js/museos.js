/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(
        function () {
            $('#tbMuseos').DataTable(
                    {
                        "ajax": "ConsultaMuseo",

                        "columns": [//Atributos que se pondrán en cada columna
                            {"data": "idMuseo"},
                            {"data": "nombreMuseo"},
                            {"data": "ciudadMuseo"},
                            {"data": "direccionMuseo"},
                            {"data": "descripcionCorta"},
                            {"data": "descripcionLarga"},
                            {"data": "cantidadVisitas"},
                            {"data": "fkIdSeccion"},

                            {"data":
                                        function (row) {
                                            var r = row['id_museo'] + "-" + row['nombre_museo'] + "-" + row['ciudad_museo'] + "-" + row['direccion_museo'] + "-" + row['descripcion_corta']
                                                    + "-" + row['descripcion_larga'] + row['cantidad_visitas'] + "-" + row['fk_id_seccion']; //Acceder
                                            console.log('valor de r' + r);
                                            var botones = "<button id='btnBorrar' class='btn btn-danger btn-xs' onClick='deleteMuseo(" + row['idMuseo'] + ")'>Borrar</button>";
                                            botones += "<button id='btnEditar' class='btn btn-xs btn-primary' onClick='showMuseo(" + row['idMuseo'] + ",\"" + row['nombreMuseo']
                                                    + "\",\"" + row['ciudadMuseo'] + ",\",\"" + row['direccionMuseo'] + "\",\"" + row['descripcionCorta'] + "\",\"" + row['descripcionLarga']
                                                    + "\", " + row['cantidadVisitas'] + ", " + row['fkIdSeccion']
                                                    + ")'>Editar</button>";
                                            return botones;
                                        }
                            }
                        ]
                    });

            $('#btnGuardarCambios').on('click', function () {
                updateMuseo();
            });
            $('#btnNuevoMuseo').on('click', function () {
                nuevoMuseo();
            });


            //

            //

            //

        }); // que se ejecute ya que esté listo
//


function deleteMuseo(id_museo) {

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
                url: "EliminaMuseo", //Url del Servlet
                type: "POST", //Método HTTP por el que se hace la petición
                data: {//Es la información que mando al servlet
                    id_museo: id_museo
                }
            }).done(function (json) { //Se ejecuta cuando todo sale bien
                //alert(json.msj);
                Swal.fire(
                        'Borrado!',
                        json.msj,
                        'success'
                        );
                //Refrescando la tabla
                $('#tbMuseos').dataTable().api().ajax.reload();
            }).fail(function (json) { //Se ejecuta cuando algo sale mal
                alert(json.msj);

                //alert("error");
            });
        }
    });
}



//
function nuevoMuseo() {
    $.ajax({
        url: 'NuevoMuseo',
        type: 'POST',
        data: {
            nombre_museo: $("#nombre_museoN").val(),
            ciudad_museo: $("#ciudad_museoN").val(),
            direccion_museo: $("#direccion_museoN").val(),
            descripcion_corta: $("#descripcion_cortaN").val(),
            descripcion_larga: $("#descripcion_largaN").val(),
            cantidad_visitas: 0,
            fk_id_seccion: $("#fk_id_seccionN").val()

        }
    }).done(function (json) { //Se ejecuta cuando todo sale bien
        //alert(json.msj);
        Swal.fire(
                'Museo creado',
                json.msj,
                'success'
                );
        //Refrescando la tabla
        $('#tbMuseos').dataTable().api().ajax.reload();
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

function showMuseo(id_museo, nombre_museo, ciudad_museo, direccion_museo, descripcion_corta, descripcion_larga, cantidad_visitas, fk_id_seccion) {
    $("#id_museoE").val(id_museo);
    $("#nombre_museoE").val(nombre_museo);
    $("#ciudad_museoE").val(ciudad_museo);
    $("#direccion_museoE").val(direccion_museo);
    $("#descripcion_cortaE").val(descripcion_corta);
    $("#descripcion_largaE").val(descripcion_larga);
    $("#cantidad_visitasE").val(cantidad_visitas);
    $("#fk_id_seccionE").val(fk_id_seccion);
    $("#modalMuseoEdit").modal("show");

}

function updateMuseo() {
    $.ajax({
        url: 'ActualizaMuseo',
        type: 'POST',
        data: {
            id_museo: $("#id_museoE").val(),
            nombre_museo: $("#nombre_museoE").val(),
            ciudad_museo: $("#ciudad_museoE").val(),
            direccion_museo: $("#direccion_museoE").val(),
            descripcion_corta: $("#descripcion_cortaE").val(),
            descripcion_larga: $("#descripcion_largaE").val(),
            cantidad_visitas: $("#cantidad_visitasE").val(),
            fk_id_seccion: $("#fk_id_seccionE").val()

        }
    }).done(function (json) { //Se ejecuta cuando todo sale bien
        //alert(json.msj);
        //Refrescando la tabla
        Swal.fire(
                'Datos actualizados',
                json.msj,
                'success'
                );
        $('#tbMuseos').dataTable().api().ajax.reload();

        //Cerrando el modal
        $("#modalMuseoEdit").modal("hide");
    }).fail(function (json) { //Se ejecuta cuando algo sale mal
        //alert(json.msj);
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Hubo un error al actualizar'
        });
    });
}
