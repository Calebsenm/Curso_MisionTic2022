package arl1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArL1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> listaSuper = new ArrayList<String>();
        String nuevodato;
       
        listaSuper.add("Perejil");
        listaSuper.add("Aguacate");
        listaSuper.add("Ñame");
        listaSuper.add("Papa");
        listaSuper.add("Cebolla");
        listaSuper.add("Ajo");
        
       
        int op;
    
        do{
        System.out.println("\nSelecciona una opcion:"
                + "\n1.Imprimir la lista del supermercado"
                + "\n2.Agregar un producto a la lista"
                + "\n3.Salir"
        );
        op=leer.nextInt(); 
        leer.nextLine();
            switch(op){
                    case 1:
                        //op 1
                        System.out.println(listaSuper);  
                        break;
                    case 2:
                       System.out.println("ingresa el nuevo producto");
                        nuevodato=leer.nextLine();
                        System.out.println(nuevodato);
                        listaSuper.add(nuevodato);
                        break;

                    case 3:
                         //salir
                    
            }
        } while(op!=3); //salir op 3     
    }

}