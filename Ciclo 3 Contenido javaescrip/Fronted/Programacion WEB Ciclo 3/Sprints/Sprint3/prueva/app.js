// const titulo1 = document.querySelector("#idTitulo1");

const nombre =document.querySelector("#campoNombre");
const correo =document.querySelector("#campoEmail");
const boton = document.querySelector("#botonValidar");

const mensaje = document.querySelector(".mensaje");

const patron1 = /@/g;

const patron2 = /upb.edu.co$/g;


boton.addEventListener("click", callBackBoton);



function callBackBoton()
{
    const name = nombre.value;
    const email = correo.value;

    console.log(name);
    console.log(email);

    const valida1 = patron1.test(email);
    const valida2 = patron2.test(email);

    if (valida1 && valida2)
    {
        mensaje.style.color = "green"
        mensaje.innerHTML = `Bienvenido ${name} tu correo es válido`
        // console.log(`Bienvenido ${name} tu correo es válido`);

    }
    else
    {
        mensaje.style.color = "red"
        mensaje.innerHTML = `${name} tu correo NO es válido, vuelve a intentar`
        // console.log(`${name} tu correo NO es válido, vuelve a intentar`);
    }
    nombre.value=""
    correo.value=""
}