

//import java.util.Scanner;
//import javax.swing.JOptionPane;
public class ProgramarJava {
    public static void main(String[] args) {
        //TODO code application logic here
        /*
        System.out.println("hola mundo");
        System.out.println("ya soy un programador en java");
        */
        // la variable tipo byte solo almacena desde el = - 128  a 127
        /*
        byte entero;
        entero = 12;
        System.out.println("NUmero entero "+ entero);
        // short solo ocupa 16 bytes
        short numero= 12456;
        System.out.println("este es tu segundo numero"+ numero);
        int num =1245612;
        System.out.print(num);
        // long es para numeros grandes
        */
        /*
        //float y double para decimales
        float decimal=23.2f;     // se nesecita poner una f para asignar un float
        System.out.println("Este es tu  valor decimal "+ decimal );
        // para caracteres
        char caracter ='a'; //solo comillas simples en un caracter
        // boleanos  
        boolean decision = true;
        System.out.println(decision);
        */
        
        /*
        // datos no primitivos 
        Integer numero = null;
        System.out.println(numero);
        
        //cadenas 
        String palabra = "hola señores";
        System.out.println(palabra);
        */
        
        // constantes  no cambian
        //final int numa = 23;
        //System.out.println(numa);
        //__________________________________
        // entrada de datos 
        /*
        Scanner entrada = new Scanner(System.in);
        int numero;
        float dos;
        
        System.out.println("Digite un numero: ");
        numero= entrada.nextInt();
        
        Scanner dosm = new Scanner(System.in);
        System.out.println("Ingresa un numero flotante: ");
        dos = dosm.nextFloat();
        System.out.println("El numero ingresado es: " + numero +" "+ dos);
        */
        //Scanner len = new Scanner(System.in);
        //String letras;
        //System.out.println("Ingre se su nombre y apellidos ");
        //letras  = len.next();  // guarda la cadenas hasta el valor que se encuentra un espacio
        //letras = len.nextLine(); // guarda todo la cadena
        //System.out.println("SU nombre es " + letras) ;
        //__________________________________________________________________________________________
        
        //char df ;
        //System.out.println("Ingrese una letra");
        //df=len.next().charAt(0);  // como next solo guarda la palabra hasta un espacio;para charat es para el valor en la posicion0
        //System.out.println("la letra es: "+ df);
        //-----------------------------------------------------------------------------------------------------------
        
        
        
        //*******************************************************************************************************
        /*
        //pequeño programa 
        Scanner agua = new Scanner(System.in);
        
        String names ;
        System.out.println("Porfavor ingrese su nombre");
        names=agua.nextLine();
        
        int num1;
        int num2;
        int resultado;
        System.out.println("ingrese el primer numero");
        num1=agua.nextInt();
        System.out.println("Ingresa El segundo numero");
        num2=agua.nextInt();
        resultado= num1+num2;
        System.out.println(names+" El resultado de su suma es "+resultado);
        
        
        
        //*********************************************************************************************************
        */
        //entrada y sallida de datos con JOPTION
        /*
        String cadena;
        int entero;
        char letra; 
        double decimal;
        
        cadena = JOptionPane.showInputDialog("digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite una letra o carácter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un decimal: "));
        
        JOptionPane.showMessageDialog(null,"La cadena es "+ cadena);
        JOptionPane.showMessageDialog(null,"EL numero entero es "+ entero);
        JOptionPane.showMessageDialog(null,"La letra es "+ letra);
        JOptionPane.showMessageDialog(null,"el decimal es"+ decimal);
        */
        //#############################################################################################
        //operdadores 
        /*######################################################################################
        Scanner entrada =new Scanner(System.in);
        float numero1,numero2,suma,resta,mult,div,resto;
        System.out.println("Digita dos numeros : ");
        numero1= entrada.nextFloat();
        numero2= entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1-numero2;
        mult = numero1* numero2;
        div = numero1/ numero2;
        resto = numero1 % numero2;
        
        System.out.println("el resultado de sus operaciones es");
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(div);
        System.out.println(mult);
        System.out.println(resto);
        */
        //####################################################################################################
        // operadoeres logicoa conviandos
        /*############################################################################################################
        int numero =10;
        numero+=5;
        System.out.println(numero);
        */
        //##################################################################################
        //operadores incremento y decremento
        /*##################################################################################
        int x =5,y;
        //x++; // 5 le aumenta en 1
        y=++x;
        //x--; // 5 le quita 1
        System.out.println(y);
        System.out.println(x);
        */
        //##############################################################################
        //operadores math
        //##############################################################################
        double raiz = Math.sqrt(9);   //raiz cuadrada
        System.out.println(raiz);
        //elevacion de la potencia
        double base= 5,Exponente=2;
        double resultado = Math.pow(base, Exponente);
        System.out.println(resultado);
        
        //redondear el numero
        double numero = 4.56;
        double result=Math.round(numero);
        System.out.println(result);
        
        double numero1 = Math.random();
        System.out.println(numero1);
    
    
    
    
    }
    
}
