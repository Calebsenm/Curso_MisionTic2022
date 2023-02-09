
package proyecto1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int result;
        int op;
        Scanner in =new Scanner(System.in);
        System.out.println("ingresa un numero");
        num1=in.nextInt();
        System.out.println("ingresa un numero");
        num2=in.nextInt();
        
        try{
        do {
            System.out.println("porfavor ingresa una de las siguientes opciones ");
            System.out.println("n1 sumar");
            System.out.println("n2 multiplicar");
            System.out.println("n3 dividir");
            System.out.println("n4 minimo de un numero");
            System.out.println("n5 salir ");
            
            op=in.nextInt();
            switch(op){
                case 1:
                    Operaciones.imprimir_suma(num1, num2);
                break;

                case 2:
                    Operaciones.imprimir_producto(num1,num2);
                break;

                case 3:
                    Operaciones.imprimir_division(num1,num2);
                break;

                case 4:
                    Operaciones.minimo_numeros(num1,num2);
                break;
                
                case 5:
                break;
            }
        }
        while(op!=5);
        }
        catch (Exception e){
            System.out.println("ingrese una opcion valida");
        }
    }   
    
}
