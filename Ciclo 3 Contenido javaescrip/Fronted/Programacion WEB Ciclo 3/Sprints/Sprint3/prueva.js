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
            return false;
        }
    }        
    else{
        return false;
    }
}
function validar_contrasena (string){
    let input = document.getElementById("in_contrasena"); 
    let regxp = /^([a-zA-Z0-9_-]){6,30}$/;  
    if (input !=regxp){
      alert ("Contraseña:"+regxp.test(input.value));
      return true; 
    }  
    else{
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
    else   {
        return false;    
    }
    
}
module.exports.validar_nombre_usuario = validar_nombre_usuario;
module.exports.validar_contrasena = validar_contrasena;
module.exports.confirmar_contrasena = confirmar_contrasena;


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


// function agregarRegistro(){
  
//   const nameValor = nombre.value;
//   const contrasenaValor1 = contrasena1.value;
//   const contrasenaValor2 = contrasena2.value;

//   const usuario = new Registros (nameValor,contrasenaValor1,contrasenaValor2);
//   registros.push(usuario);
  
//   console.log(usuario);
//   console.log(registros);
//   registros = OrdenarArreglo(registros);

// }
// class Registros{
//   constructor(nombre,contrasena1,contrasena2){
//     this.nombre = nombre; 
//     this.contrasena1 = contrasena1;
//     this.contrasena2 = contrasena2;
//   }
// }
// function OrdenarArreglo(arreglo){
//  /*  arreglo.sort((a,b) => {
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
//     return arreglo; */
//     arreglo = arreglo.sort(function (a, b) {
//       if (a > b) {
//           return 1;
//       }
//       if (a< b) {
//           return -1;
//       }
//       return 0;
//   });
//    return arreglo;



// }
// module.exports.registros = registros;
// module.exports.OrdenarArreglo = OrdenarArreglo;
// module.exports.agregarRegistro = agregarRegistro; 


