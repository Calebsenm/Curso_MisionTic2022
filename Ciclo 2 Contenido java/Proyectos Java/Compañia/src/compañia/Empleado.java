
package compañia;

public class Empleado implements gycporpagar{
    private String primernombre;
    private String primerapellido;
    private int identificacion;
    private double salario;

    public Empleado(String primernombre, String primerapellido, int identificacion,double salario) {
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.identificacion = identificacion;
        this.salario = salario;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public void info(){
        System.out.println("Empleado-----------");
        System.out.println("Nombre "+getPrimernombre()+""+getPrimerapellido());
        
        System.out.println("Identifiacion N° "+getIdentificacion());
    }

   
    public double getMontoPago() {
        return (getSalario());
    }

    
   
    
}
