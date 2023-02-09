package menu2;

import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        int op;
        try{
            do{
                System.out.println("A continuacion las opciones del menu, selecciona una opcion"
                    + "\n1.opcion 1"
                    + "\n2.opcion 2"
                    + "\n3.opcion 3"
                    + "\n4.Salir"

            );
                op =leer.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Seleccionaste la opcion 1");
                        break;
                    case 2:
                         System.out.println("Seleccionaste la opcion 2");
                        break;

                    case 3:
                        System.out.println("Seleccionaste la opcion 3");
                        break;
                    case 4:
                        //salir
                }
            } while(op!=4); // opcion de salir es 4
        }
        catch (Exception e){
            System.out.println("La opcion que ingresaste no es valida");
        }
        
    }

}
