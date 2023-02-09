
const boton= document.querySelector("#btn_registrar_usuario");
boton.addEventListener('click',validar_nombre_usuario,validar_contrasena,confirmar_contrasena); 

function validar_nombre_usuario(string){
    var name = (document.getElementById('in_nombre_usuario').value);
    var expresionNombre = /^[A-Za-zñÑ]+$/;
    if(expresionNombre.test(name))
    {
        if (name.length >= 6 && name.length <= 30)
        {
            return true;
        }
        else{
            alert("El usuario es muy corto");
            return false;
        }
    }        
    else{
        alert("Hubo un Error");
        return false;
        
    }
}

function validar_contrasena (string){
    var input = (document.getElementById('in_nombre_usuario').value);
    //let input = document.getElementById("in_contrasena"); 
    let regxp = /^([a-zA-Z0-9_-]){6,30}$/;  
    if (input !=regxp){
      alert ("Contraseña:"+regxp.test(input.value));
      return true; 
    }  
    else{

        alert("Contraseña muy corta");
        return false;
        
    }
}

const stringA = document.getElementById("in_contrasena");  
const stringB = document.getElementById("in_confirmar_contrasena");
let input =document.getElementById("in_contrasena");
let regxp = /^([a-zA-Z0-9_-]){6,30}$/;  

function confirmar_contrasena(stringA, stringB){

    if (stringA && stringB){
        return true;
    }
    else {

         alert("Contraseñas no coinciden");   
        return false; 
       
    }
    
}

module.exports.validar_nombre_usuario = validar_nombre_usuario;
module.exports.validar_contrasena = validar_contrasena;
module.exports.confirmar_contrasena = confirmar_contrasena;