
package encapsulamiento;

public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
       Persona persona1 = new Persona ("pablo","emilio ",30,'M',3333,"ingeniero en redes");
       Persona persona2= new Persona ("andres"," ramon",32,'h',222,"ingeniero en industrial");
       
       System.out.println("obtenemos la edad");
       System.out.println(persona2.getEdad());
       
        System.out.println("cambiamos edad");
        persona2.setEdad(15);
        System.out.println(persona2.getEdad());
    }
    
}

