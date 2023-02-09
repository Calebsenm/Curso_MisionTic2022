package proyecto2;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1=new Perro("pulgas","negro","pincher","peuqueño",2,false,'H');
        Perro p2=new Perro("pul","blanco ","sdr","mediano",3,false,'M');
        veiculo v1 = new veiculo(" Renaul","Rojo","2018","dDD");
        System.out.println("___________________________________");
        System.out.println("El perro "+p1.nombre);
        System.out.println(p1.getInfo());
        System.out.println("___________________________________");
        System.out.println("El perro "+p2.nombre);
        System.out.println(p2.getInfo());
        System.out.println("___________________________________");
        
        System.out.println(v1.getInfo());
        Persona persona1 = new Persona ("pablo","emilio ",30,'M',3333,"ingeniero");
        Persona persona2 = new Persona ("pa","emili90¿o ",15,'H',1234,"estudiante");
        
        String mensaje;
        
        mensaje = mensajedemayordeedad(persona1.esmayordeedad());
        System.out.println("la persona 1 "+ mensaje);
        
        mensaje =mensajedemayordeedad(persona1.esmayordeedad());
        System.out.println("la persona 2 "+ mensaje);
    }  
    private static String mensajedemayordeedad (boolean esmayordeedad){
        return (esmayordeedad)? "es mayor de edad " : "Es menor de edad ";
        
    }
    
}
