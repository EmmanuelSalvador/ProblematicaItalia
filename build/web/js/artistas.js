/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(
        function () {
            $('#tbArtistas').DataTable(
                    {
                        "ajax": "ConsultaArtistas",

                        "columns": [//Atributos que se pondrán en cada columna
                            {"data": "idArtista"},
                            {"data": "nombreArtista"},
                            {"data": "biografiaCorta"},
                            {"data": "biografiaLarga"},
                            {"data": "valoracion"},
                            {"data": "visitas"},

                            {"data":
                                        function (row) {
                                            var r = row['id_artista'] + "-" + row['nombre_artista'] + "-" + row['biografia_corta'] + "-" + row['biografia_larga'] + "-" + row['valoracion']
                                                    + "-" + row['visitas']; //Acceder
                                            console.log('valor de r' + r);
                                            var botones = "<button id='btnBorrar' class='btn btn-danger btn-xs' onClick='deleteArtista(" + row['idArtista'] + ")'>Borrar</button>";
                                            botones += "<button id='btnEditar' class='btn btn-xs btn-primary' onClick='showArtista(" + row['idArtista'] + ",\"" + row['nombreArtista']
                                                    + "\",\"" + row['biografiaCorta'] + "\",\"" + row['biografiaLarga'] + "\"," + row['valoracion'] + ", " + row['visitas']
                                                    + ")'>Editar</button>";
                                            return botones;
                                        }
                            }
                        ]
                    });

            $('#btnGuardarCambios').on('click', function () {
                updateArtista();
            });
            $('#btnNuevoArtista').on('click', function () {
                nuevoArtista();
            });


            //

            //

            //

        }); // que se ejecute ya que esté listo
//


function deleteArtista(id_artista) {

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
                url: "EliminaArtista", //Url del Servlet
                type: "POST", //Método HTTP por el que se hace la petición
                data: {//Es la información que mando al servlet
                    id_artista: id_artista
                }
            }).done(function (json) { //Se ejecuta cuando todo sale bien
                //alert(json.msj);
                Swal.fire(
                        'Borrado!',
                        json.msj,
                        'success'
                        );
                //Refrescando la tabla
                $('#tbArtistas').dataTable().api().ajax.reload();
            }).fail(function (json) { //Se ejecuta cuando algo sale mal
                alert(json.msj);

                //alert("error");
            });
        }
    });
}



//
function nuevoArtista() {
    $.ajax({
        url: 'NuevoArtista',
        type: 'POST',
        data: {
            nombre_artista: $("#nombre_artistaN").val(),
            biografia_corta: $("#biografia_cortaN").val(),
            biografia_larga: $("#Biografía_largaN").val(),
            valoracion: 0,
            visitas: 0

        }
    }).done(function (json) { //Se ejecuta cuando todo sale bien
        //alert(json.msj);
        Swal.fire(
                'Artista creado',
                json.msj,
                'success'
                );
        //Refrescando la tabla
        $('#tbArtistas').dataTable().api().ajax.reload();
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

function showArtista(id_artista, nombre_artista, biografia_corta, biografia_larga,valoracion, visitas) {
    $("#id_artistaE").val(id_artista);
    $("#nombre_artistaE").val(nombre_artista);
    $("#biografia_cortaE").val(biografia_corta);
    $("#biografia_largaE").val(biografia_larga);
    $("#valoracionE").val(valoracion);
    $("#visitasE").val(visitas);
    $("#modalArtistaEdit").modal("show");

}

function updateArtista() {
    $.ajax({
        url: 'ActualizaArtista',
        type: 'POST',
        data: {
            id_artista: $("#id_artistaE").val(),
            nombre_artista: $("#nombre_artistaE").val(),
            biografia_corta: $("#biografia_cortaE").val(),
            biografia_larga: $("#biografia_largaE").val(),
            valoracion: $("#valoracionE").val(),
            visitas: $("#visitasE").val()

        }
    }).done(function (json) { //Se ejecuta cuando todo sale bien
        //alert(json.msj);
        //Refrescando la tabla
        Swal.fire(
                'Artista actualizado',
                json.msj,
                'success'
                );
        $('#tbArtistas').dataTable().api().ajax.reload();

        //Cerrando el modal
        $("#modalArtistaEdit").modal("hide");
    }).fail(function (json) { //Se ejecuta cuando algo sale mal
        //alert(json.msj);
        Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: 'Hubo un error al actualizar'
        });
    });
}
