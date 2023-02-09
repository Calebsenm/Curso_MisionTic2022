import java.util.Scanner;
public class SumaIngresandodatos{
 public static void main(String args[]){
   
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int numero1 = 0,numero2 = 0, resultado = 0; 
   
   System.out.println("Cual es tu nombre?: ");
   nombre = in.nextLine();
   System.out.println("Ingresa el primer numero para sumar: ");
   numero1 = in.nextInt();
   System.out.println("Ingresa el segundo numero para sumar: ");
   numero2 = in.nextInt();
   
   resultado=numero1 + numero2;
   System.out.println("Hola "+ nombre + "el resultado de tu suma es: "+ resultado);
 }
}