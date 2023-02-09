
package list3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Persona>clientes = new ArrayList<Persona>();
        
        Persona Persona1 = new Persona("Luz ","gomes",222);
        Persona Persona2 = new Persona("Caleb","Seña",5655);
        Persona Persona3 = new Persona("Juan","sequea",45465);
        Persona Persona4 = new Persona("Adolfo");
        
        clientes.add(Persona1);
        clientes.add(Persona3);
        clientes.add(Persona4);
        
        System.out.println("son "+clientes.size()+"clientes");
        
       
        for (int i=0; i<clientes.size();i++){
            System.out.println(clientes.get(1).getNombre());
        }
        
  
        Carro carro1 = new Carro("rojo","Css333","renould");
        Carro carro2 = new Carro("verde","Rsd33","mothtar");
        Carro carro3 = new Carro("amarillo","Msd333","chebrolet");
        Carro carro4 = new Carro("azul","MDDFF32","must");
        Carro carro5 = new Carro("naranja","RRH3h3","ferrary");
        
        ArrayList<Carro>carros = new ArrayList<Carro>();
        System.out.println("Tengo "+ carros.size()+"carros");
        
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        
        System.out.println("Ingresaste"+ carros.size()+"carros");
        System.out.println("con las placas");
        
        for (int i=0; i<carros.size();i++){
            System.out.println(carros.get(i).getPlaca()); 
        }
        
        
         
    }
    
}
