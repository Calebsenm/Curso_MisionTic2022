
package adstracta;


public class Triangulo extends Figura {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    
    
    public void area(){
        double area =(altura * base)/2;
        System.out.println("El area de un triangulo es: "+ area);
    }
}
