
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