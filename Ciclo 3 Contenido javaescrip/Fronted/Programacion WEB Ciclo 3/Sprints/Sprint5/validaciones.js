let registros = [];
// const boton= document.querySelector("#btn_registrar_usuario");
// boton.addEventListener('click',agregarRegistro); 


function agregarRegistro(){
   
    var usuario = (document.getElementById('in_nombre_usuario').value);
    var contrasena = (document.getElementById("in_contrasena").value);
    var confirmar_contrasena = (document.getElementById("in_confirmar_contrasena").value);
     

  const usuarios = new Registros (usuario,contrasena,confirmar_contrasena);
  registros.push(usuarios);
  
  console.log(usuarios);
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

function OrdenarArreglo(arreglo){
    arreglo.sort((a,b) => {
    if (a.usuario.toLowerCase() < b.usuario.toLowerCase()){
        return -1;
    }
    else if (a.usuario.toLowerCase() >b.usuario.toLowerCase()){
        return 1;
    }
    else {
        return 0;
    }
            
    });
    console.log(arreglo);
    return arreglo;
            

}

module.exports.registros = registros;
module.exports.OrdenarArreglo = OrdenarArreglo;
module.exports.agregarRegistro = agregarRegistro;