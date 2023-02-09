/* const usuario = document.querySelector("#in_nombre_usuario");
const contrasena = document.querySelector("#in_contrasena");
const confirmar_contrasena= document.querySelector("#in_confirmar_contrasena");

const bottom = document.querySelector("#btn_registrar_usuario");

let registros = [];

//bottom.addEventListener("click",agregarRegistro);


function agregarRegistro(){
  ValorUsuario = usuario;
  ValorContrasena = contrasena;
  ValorConfirmar_Contrasena = confirmar_contrasena;
  usuarioCreado = new Registros (ValorUsuario,ValorContrasena,ValorConfirmar_Contrasena);
  registros.push(usuarioCreado);
  console.log(usuarioCreado);
  console.log(registros);


}
function OrdenarArreglo (arreglo){
  arreglo.sort((a,b)=> {
    if (a.usuario.toLowerCase() < b.usuario.toLowerCase()){
      return -1;
    }
    else if (a.usuario.toLowerCase() > b.usuario.toLowerCase() ){
      return 1;
    }
    else{
      return 0;
    }
  });
  console.log(arreglo);
  return arreglo;

}
class Registros{
  constructor (usuario,contrasena,confirmar_contrasena){
    this.usuario=usuario;
    this.contrasena=contrasena;
    this.confirmar_contrasena=confirmar_contrasena;
  }
}

module.exports.registros = registros;
module.exports.OrdenarArreglo = OrdenarArreglo;
module.exports.agregarRegistro = agregarRegistro; 

*/



const usuario =document.querySelector("#in_nombre_usuario");
const contrasena = document.querySelector("#in_contrasena");
const confirmar_contrasena = document.querySelector("#in_confirmar_contrasena");

const boton= document.querySelector("#btn_registrar_usuario");
boton.addEventListener('click',agregarRegistro); 
let registros = [];

function agregarRegistro(){

    const usuario1 = new Registros (usuario,contrasena,confirmar_contrasena);
    registros.push(usuario1);
    console.log(usuario1);
    console.log(registros);
    registros = OrdenarArreglo(registros);
  
  }

class Registros{
    constructor(usuario,contrasena,confirmar_contrasena){
      this.usuario = usuario; 
      this.contrasena = contrasena;
      this.confirmar_contrasena = confirmar_contrasena;
    }
  }

function OrdenarArreglo(arreglo) {
  arreglo.sort((a, b) => {
    const usuarioA = a.usuario.toLowerCase();
    const usuarioB = b.usuario.toLowerCase();
    if (usuarioA < usuarioB) {
      return -1;
    }

    if (usuarioA > usuarioB) {
      return 1;
    }

    return 0;
  });
  console.log(arreglo);
  return arreglo;

}

// module.exports.registros = registros;
// module.exports.OrdenarArreglo = OrdenarArreglo;
// module.exports.agregarRegistro = agregarRegistro;