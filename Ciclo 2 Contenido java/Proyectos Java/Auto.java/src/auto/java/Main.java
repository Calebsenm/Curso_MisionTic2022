package auto.java;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        
        Cliente Cliente1 = new Cliente("11111",20,"Caleb");
        Cliente Cliente2 = new Cliente("134341",24,"Carlos");
        Cliente Cliente3 = new Cliente("23231",22,"Cal222eb");
        Cliente Cliente4 = new Cliente("323211",24,"Cale334b");
        
        Auto auto = new Auto("DBZ645",2,true);
        Auto auto1 = new Auto("DBZ645",2,false);
        
        
        Alquiler alquileres[]= new Alquiler[5]; 
        alquileres[0]= new Alquiler (Cliente1, auto,LocalDate.parse("2021-06-12"),48);
        alquileres[1]= new Alquiler (Cliente2, auto,LocalDate.parse("2021-07-12"), 30);
        alquileres[2]= new Alquiler (Cliente1, auto,LocalDate.parse("2021-07-14"), 25);
        alquileres[3]= new Alquiler (Cliente3, auto,LocalDate.parse("2021-07-14"), 12);
        alquileres[4]= new Alquiler (Cliente1, auto,LocalDate.parse("2021-07-16"), 8);
       
        Cliente historial [] = new Cliente[7]; 
        
        historial[0] = new Cliente ("1015143634",23,"juan");
        historial[1] = new Cliente ("1364726437",33,"mateo");
        historial[2] = new Cliente ("9685432432",43,"Ana");
        historial[3] = new Cliente ("1015143634",34,"juan");
        historial[4] = new Cliente ("4567987652",34,"alfredo");
        historial[5] = new Cliente ("5468978655",34,"Gloria");
        historial[6] = new Cliente ("1015143634",34,"juan");
        
        
        
        String mensaje;
        mensaje = NecesitaMantenimiento(auto.NecesitaMantenimiento());
        System.out.println("la el auto  1 "+ mensaje);
       
        mensaje = SePuedeRentar(auto.SePuedeRentar());
        System.out.println("la el auto  2 "+ mensaje); 
       
        System.out.println("descuento n1");
        System.out.println("descuento n2");
        System.out.println("descuento n3");
        System.out.println("descuento n4");
         
        System.out.println();
        
        
        
    }
    private static String NecesitaMantenimiento (boolean NecesitaMantenimiento){
        return (NecesitaMantenimiento)? "nesecita mantenimiento " : "no nesecita mantenimiento ";
    }
    private static String SePuedeRentar (boolean SepuedeRentar){
        return (SepuedeRentar)? "SI se puede rentar ": "No se puede rentar";
    }

               
}
