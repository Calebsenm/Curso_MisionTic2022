
package proyectoa;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int edad =12;
        bloque2();
        System.out.println("----");
        System.out.println("aqui esta el numero de la clase c1: "+ c1.b_numero(2));
        bloque1();
        c1.b1();
        c1.b2();
        c1.b3();
        boolean resultado=c1.resultado(edad);
        System.out.println("si es mayor de edad true,si es menor de edad false "+resultado);
    }
    public static void bloque1(){
        System.out.println("soy el bloque numero 1");
    }
    public static void bloque2(){
        System.out.println("soy el bloque numero 2 ");
    }
}
