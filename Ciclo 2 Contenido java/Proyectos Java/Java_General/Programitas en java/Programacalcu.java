public class Programacalcu{
 public static void main(String args[]){
 
   int operacion = 1;
   int numero1 = 8;
   int numero2 = 4;
   int resultado = 0;
   
   if(operacion == 1){
     resultado = numero1 + numero2;
     System.out.println("El resultado de la suma es: " + resultado);
   }else if(operacion ==2){
     resultado = numero1 - numero2;
     System.out.println("El resultado de la resta es: " + resultado);
   }else if (operacion == 3){
     resultado = numero1 * numero2;
     System.out.println("El resultado de la multiplicacion es: " + resultado);
   }else if (operacion ==4){
     resultado = numero1/numero2;
     System.out.println("El resultado de tu division es: "+ resultado);
   }else{
     System.out.println("la opcion que elegiste no existe");
   }
 }
}
