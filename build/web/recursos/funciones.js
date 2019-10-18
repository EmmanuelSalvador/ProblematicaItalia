/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarForma(forma){
    
    
    var usuario = forma.usuario; //Nombre del componente en HTML
    
    var password = forma.pass; //Password del componente en HTML
       
    if(usuario.value==="Emmanuel" && password.value==="123456789"){
        return true;
    }
    else {
        alert("Los datos proporcionados son incorrectos");
        password.focus();
        password.select();
        return false;
    }
    
} //Fin funcion

