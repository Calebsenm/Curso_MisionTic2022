
package jooppane;

import javax.swing.JOptionPane;

import java.lang.Math;

public class JoOPpane {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int esentero;
        int esentero2;
        String estring;
        double esdouble;
        char escar;
        double suma;
        double raiz_suma;
        
        esentero= Integer.parseInt(JOptionPane.showInputDialog("ingresa un valor entero: "));
        esentero2= Integer.parseInt(JOptionPane.showInputDialog("ingresa un valor entero: "));
        estring= JOptionPane.showInputDialog("INgresa un mensaje: ");
        esdouble= Double.parseDouble(JOptionPane.showInputDialog("ingrese el costo del producto: "));
        escar=JOptionPane.showInputDialog("ingresa un caracter: ").charAt(0);

        suma =esentero + esentero2;
        raiz_suma=Math.sqrt(suma);
        JOptionPane.showMessageDialog(null, "los valores son: " 
            +"\nPara el entero1: "+ esentero
            +"\nPara el entero2: "+ esentero2
            +"\nPara el mensaje: "+ estring
            +"\nPara el caracter: "+ escar
            +"\nPara el costo: "+  esdouble
            +"\nla suma de valores es: "+ suma
            +"\nla rais cuadrada del resultado de la suma es : "+ raiz_suma
        );   
        
    }
    
}
