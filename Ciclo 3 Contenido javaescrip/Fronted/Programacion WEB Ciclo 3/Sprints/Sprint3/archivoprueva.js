
// var usuario1 = document.querySelector("#in_nombre_usuario");
// var contrasena1 = document.querySelector("#in_contrasena");
// var confirmar_contrasena1 = document.querySelector("#in_confirmar_contrasena");

// let registros = [];
// // const boton= document.querySelector("#btn_registrar_usuario");
// // boton.addEventListener('click',agregarRegistro); 


// function agregarRegistro(){

//     const usuario = usuario1.value;
//     const contrasena = contrasena1.value;
//     const confirmar_contrasena = confirmar_contrasena1.value; 

//     const usuarios = new Registros (usuario,contrasena,confirmar_contrasena);
//     registros.push(usuarios);
//     console.log(usuarios);
//     console.log(registros);
//     registros = OrdenarArreglo(registros);

// }
// class Registros{
//     constructor(usuario,contrasena,confirmar_contrasena){
//         this.usuario = usuario; 
//         this.contrasena = contrasena;
//         this.confirmar_contrasena = confirmar_contrasena;
//     }
// }

// function OrdenarArreglo(arreglo){
//     arreglo.sort((a,b) => {
//     if (a.usuario.toLowerCase() < b.usuario.toLowerCase()){
//         return -1;
//     }
//     else if (a.usuario.toLowerCase() >b.usuario.toLowerCase()){
//         return 1;
//     }
//     else {
//         return 0;
//     }
            
//     });
//     console.log(arreglo);
//     return arreglo;
            

// }

// module.exports.registros = registros;
// module.exports.OrdenarArreglo = OrdenarArreglo;
// module.exports.agregarRegistro = agregarRegistro;



// //Sprint funcional 2
// function validar_nombre_usuario(string){
//   var name = (document.getElementById('in_nombre_usuario').value);
//   var expresionNombre = /^[A-Za-zñÑ]+$/;
//   if(expresionNombre.test(name))
//   {
//       if (name.length >= 6 && name.length <= 30)
//       {
//           return true;
//       }
//       else{
//           return false;
//       }
//   }        
//   else{
//       return false;
//   }
// }
// function validar_contrasena (string){
//   let input = document.getElementById("in_contrasena"); 
//   let regxp = /^([a-zA-Z0-9_-]){6,30}$/;  
//   if (input !=regxp){
//     alert ("Contraseña:"+regxp.test(input.value));
//     return true; 
//   }  
//   else{
//       return false;
//   }
// }
// const stringA = document.getElementById("in_contrasena");  
// const stringB = document.getElementById("in_confirmar_contrasena");
// let input =document.getElementById("in_contrasena");
// let regxp = /^([a-zA-Z0-9_-]){6,30}$/;  

// function confirmar_contrasena(stringA, stringB){

//   if (stringA && stringB){
//       return true;
//   }
//   else   {
//       return false;    
//   }
  
// }

// module.exports.validar_nombre_usuario = validar_nombre_usuario;
// module.exports.validar_contrasena = validar_contrasena;
// module.exports.confirmar_contrasena = confirmar_contrasena; 


// //Sprint numero 3

// const nombre = document.querySelector("#in_nombre_usuario");
// const contrasena1 = document.querySelector("#in_contrasena");
// const contrasena2 = document.querySelector("#in_confirmar_contrasena");

// const boton= document.querySelector("#btn_registrar_usuario");
// //boton.addEventListener('click',agregarRegistro);

// let registros = [];

// const usuario = nombre.value;
// const contrasena = contrasena1.value;
// const confirmar_contrasena = contrasena2.value;

// function agregarRegistro(){
  
//     const usuario1 = new Registros (usuario,contrasena,confirmar_contrasena);
//     registros.push(usuario1);
    
//     // console.log(usuario);
//     // console.log(registros);
//     // registros = OrdenarArreglo(registros);

// }
// class Registros{
//   constructor(nombre,contrasena1,contrasena2){
//     this.nombre = nombre; 
//     this.contrasena1 = contrasena1;
//     this.contrasena2 = contrasena2;
//   }
// }
// function OrdenarArreglo(arreglo){
//     arreglo.sort((a,b) => {
//     if (a.nombre.toLowerCase() < b.nombre.toLowerCase()){
//       return -1;
//     }
//     else if (a.nombre.toLowerCase() >b.nombre.toLowerCase()){
//     return 1;
//     }
//     else {
//       return 0;
//     }
    
//     });
//     console.log(arreglo);
//     return arreglo; 
//     // arreglo = arreglo.sort(function (a, b) {
//     // if (a > b) {
//     //     return 1;
//     // }
//     // if (a< b) {
//     //     return -1;
//     //   }
//     //     return 0;
//     // });
//     //     return arreglo;



// }
// module.exports.registros = registros;
// module.exports.OrdenarArreglo = OrdenarArreglo;
// module.exports.agregarRegistro = agregarRegistro; 


////sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss
// prueva((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))+

let registros = [];

function agregarRegistro() {
  let nombre = document.getElementById("in_nombre_usuario").value
  let psw = document.getElementById("in_contrasena").value
  let psw2 = document.getElementById("in_confirmar_contrasena").value
  let persona = { 
    usuario : nombre,
    contrasena : psw,
    confirmar_contrasena: psw2
  };
  registros.push(persona);

  // if (persona.usuario !== "") {
  //   // OrdenarArreglo(registros);
  // }
  // else {
  //   console.log("Fallo al almacenar datos del usuario.");
  // }

  //validar_nombre_usuario(nombre) ? alert("El nombre es correcto") : alert("El nombre es incorrecto")
  //confirmar_contrasena(psw, psw2) ? alert("Contraseña correcta") : alert("Contraseña incorrecta")
}

function OrdenarArreglo(arreglo) {
  arreglo.sort ((a , b) => {
    if (a.usuario < b.usuario) {
        return -1;
    }else if (a.usuario > b.usuario) {
      return 1;
    } else {
      return 0;
    }
  });
  console.log(arreglo)
  return arreglo;
}

function showRegistros() {
  for (let i = 0; i < registros.length; i++) {
    console.log("Usuario #" + i);
    console.log(registros[i]);
  }
}

function validar_nombre_usuario(params) {
    let isValid;
    // El tamaño maximo para nuestro input
    const max = 30;
    const min = 6;

    // El pattern que vamos a comprobar
    const pattern = new RegExp('^[A-Z]+$', 'i');

    // Primera validacion, si input esta vacio entonces no es valido
    if(!params) {
      isValid = false;
    } else {
      // Segunda validacion, si input es mayor que 30
      if(params.length > max || params.length < min) {
        isValid = false;
      } else {
        // Tercera validacion, si input contiene caracteres diferentes a los permitidos
        if(!pattern.test(params)){ 
        // Si queremos agregar letras acentuadas y/o letra ñ debemos usar
        // codigos de Unicode (ejemplo: Ñ: \u00D1  ñ: \u00F1)
          isValid = false;
        } else {
          // Si pasamos todas la validaciones anteriores, entonces el input es valido
          isValid = true;
        }
      }
    }
    return isValid;
}

function validar_contrasena(params) {
    let isValid;
    // El tamaño maximo para nuestro input
    const min = 6;

    // El pattern que vamos a comprobar
    const pattern = new RegExp('^[a-zA-Z0-9]+$', 'i');

    // Primera validacion, si input esta vacio entonces no es valido
    if(!params) {
      isValid = false;
    } else {
      // Segunda validacion, si input es mayor que 30
      if(params.length < min) {
        isValid = false;
      } else {
        // Tercera validacion, si input contiene caracteres diferentes a los permitidos
        if(!pattern.test(params)){ 
        // Si queremos agregar letras acentuadas y/o letra ñ debemos usar
        // codigos de Unicode (ejemplo: Ñ: \u00D1  ñ: \u00F1)
          isValid = false;
        } else {
          // Si pasamos todas la validaciones anteriores, entonces el input es valido
          isValid = true;
        }
      }
    }
    return isValid;
}

function confirmar_contrasena(param1, param2) {
    let isValid;
    validar_contrasena(param1) && validar_contrasena(param2) && param1 == param2 ? isValid = true : isValid = false;
    return isValid
}

module.exports.registros = registros;
module.exports.OrdenarArreglo = OrdenarArreglo;
module.exports.agregarRegistro = agregarRegistro;


// module.exports.validar_nombre_usuario = validar_nombre_usuario;
// module.exports.validar_contrasena = validar_contrasena;
// module.exports.confirmar_contrasena = confirmar_contrasena;

// confirmar_contrasena("abcde123", "bcde123") ? console.log("Yes") : console.log("Nop");