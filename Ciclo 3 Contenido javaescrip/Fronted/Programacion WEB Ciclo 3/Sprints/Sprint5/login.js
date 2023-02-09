const nombre =document.querySelector("#in_login_username");
const pasw =document.querySelector("#in_login_password");
const captcha = document.querySelector("#in_login_captcha");

const patron1 = "Bogotá";
const patron2 = "bogota";
const patron3 = "BOGOTA";
const patron4 = "BOGOTÁ";
const patron5 = "Bogota";

// const boton= document.querySelector("#btn_ingreso");
// boton.addEventListener('click',validar_captcha,iniciar_sesion); 

let registros = [];

function validar_captcha(rcaptcha){

    // const captcha1 = captcha.value;
    // console.log(captcha1);
    
    // if (captcha1 === patron1 || captcha1 === patron2 || captcha1 === patron3 || captcha1 === patron4 || captcha1 === patron5){
    //     console.log("EL catcha es  valido");
    //     return true;

    // }    else{
    //             console.log("Catcha no es valido");
    //             return false;
               
    //         }
    // captcha.value;
    if (rcaptcha == "5") {
        return true
    } else {
        return false
    }
    
}

function iniciar_sesion(usuario,contrasena,rcaptcha){
    
    if (validar_captcha(rcaptcha) == true) {
        if (registros[0].usuario == usuario && registros[0].contrasena == contrasena) {
            return true
        } else {
            return false
        }
    } else {
        return false
    }
}

module.exports.registros = registros;
module.exports.validar_captcha = validar_captcha;
module.exports.iniciar_sesion = iniciar_sesion;
