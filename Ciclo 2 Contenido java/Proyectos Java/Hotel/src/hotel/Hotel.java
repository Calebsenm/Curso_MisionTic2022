
package hotel;

public class Hotel {
    public static void main(String[] args) {
        //Hbitacion numero1
        Habitacion hab1;
        hab1 = new Habitacion(2121);
        System.out.println("Nueva habitacion "+ hab1.getNumeroHabitacion());
        
        // Habitacion numero2
        
        Habitacion hab2;
        hab2 = new Habitacion(2322,3);
        
        System.out.println("Nueva habitacion n° "+hab2.getNumeroHabitacion()+ "ccon "+hab2.getNumeroCamas()+"camas");
        
        //habitacion numero3
        
        Habitacion hab3 = new Habitacion(2222,2);
        System.out.println("Nueva habitacion n° "+hab3.getNumeroHabitacion()+ "ccon "+hab3.getNumeroCamas()+"camas");
    }
    
}
