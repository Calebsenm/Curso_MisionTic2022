
package operador_ternario;

public class Operador_ternario {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean condicion = true;
        String respuesta;
        /*
        if (condicion){
            respuesta = "Es verdadera";
        }
        else{
        respuesta = "es falsa";
        }
        System.out.println(respuesta);
        */
        respuesta = (condicion)? "Es verdadero": "ES falsa ";
        System.out.println(respuesta);
        
        String mensaje;
        int calificasion=4;
        
        mensaje = (calificasion>=3)? "pasaste la materia" : "no pasaste la materia ";
        System.out.println(mensaje);
        
        char genero = 'f';
        
        mensaje = (genero == 'F')? "es femenino": "Es masculino";
        System.out.println(mensaje);        
        
        int edad =12;
        condicion = (edad >=18);
        mensaje = (condicion)? "es mayor de edad": "Es menor de edad";
        System.out.println(mensaje);
        
        int numero = 23;
        mensaje=(numero==3)? "Es igual a 3" : "no es igual a 3";
        System.out.println(mensaje);
        
        condicion = (4<5 && true);
        mensaje = (condicion)? "Es verdadera" : "es falsa";
        System.out.println(mensaje);
        
    }
    
}
