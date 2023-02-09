import java.util.Scanner;
public class Mini_calcu {
    public static void main(String args[]) {
        int option ;
        int iterador=6;
        int num1;
        int num2;
        int resul;
        while (iterador == 6){
            
            System.out.println("Elija la opcion 1 para sumar");
            System.out.println("Elige la opcion 2 para restar");
            System.out.println("Elige la opcion 3 para multiplicar");               
            System.out.println("Elige la opcion 4 para dividir");
            System.out.println("Elige la opcion 5 para sacar el residuo");    
            System.out.println("Elige la opcion 6 para salir del programa");           

            Scanner in = new Scanner(System.in);
            System.out.println("Ingresa una opcion");
            option = in.nextInt();
            if ((option==1) || (option==2)|| (option==3)|| (option==4)|| (option==5)) {
                System.out.println("Ingresa el primer numero");
                num1=in.nextInt();
                System.out.println("Ingresa el sengundo numero");
                num2= in.nextInt();
    
                if (option == 1){
                    resul = num1 + num2;
                    System.out.println("El resultado de la suma es: "+resul);
                }
                else if (option == 2 ){
                    resul = num1-num2;
                    System.out.println("El resultado de tu resta es: "+ resul);
    
                }
                else if (option == 3 ){
                    resul = num1-num2;
                    System.out.println("El resultado de tu Multiplicasion es: "+ resul);
                }
                else if (option ==4 ){
                    resul = num1 / num2;
                    System.out.println("El resultado de tu division es: "+resul);
                }
                else if (option ==5){
                    resul= num1 % num2;
                    System.out.println("El resudo de tu operacion es: "+ resul);
                }  
            }
            else{
                iterador=2;
            }
            
        }
        
    }
}
