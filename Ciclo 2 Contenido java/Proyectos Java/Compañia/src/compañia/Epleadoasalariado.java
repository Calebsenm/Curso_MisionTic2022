
package compañia;

public class Epleadoasalariado extends Empleado{
    private double salario;

    public Epleadoasalariado( String primernombre ,String primerapellido,double salario,  int identificacion) {
        super(primernombre, primerapellido, identificacion,salario);
        if (salario >=0){
        this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario>=0){
        this.salario = salario;
        }
    }

    public double getmontopago(){
        return getSalario();
    }
    
    public void info(){
        System.out.println("asalariado--------------");
        super.info();
        System.out.println("El salario  a pagar es de "+ getSalario()+"Pesos");
        
    }
}
