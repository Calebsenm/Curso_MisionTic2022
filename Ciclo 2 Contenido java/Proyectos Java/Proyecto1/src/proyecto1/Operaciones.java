package proyecto1;
import java.lang.Math;
public class Operaciones {
    public static int sumar (int n1,int n2){
            int suma = n1 + n2;
            return suma;
    }
    public static int multiplicar (int n1,int n2){
            int multiplicar = n1 * n2;
            return multiplicar;
    }
    public static double dividir (int n1,int n2){
            double dividir = n1 + n2;
            return dividir;
    }
    public static double sacarprom (int n1,int n2){
            double sacarprom = n1 + n2;
            return sacarprom;
    }
    public static void imprimir_suma(int n1,int n2){
        System.out.println("la suma de los numeros es " +(n1+n2));
    } 
    public static void imprimir_producto(int n1,int n2){
        int multiplicar = n1 * n2;
        System.out.println("la multiplicasion de los numeros es "+ multiplicar );
    } 
    public static void imprimir_division(int n1,int n2){
        int division = n1 / n2;
        System.out.println("la division de los numeros es "+ division );
    } 
    public static void minimo_numeros(int n1,int n2){
    int min = Math.min(n1, n2);
        System.out.println("el minimo de los dos numeros es "+ min);
    }
}
