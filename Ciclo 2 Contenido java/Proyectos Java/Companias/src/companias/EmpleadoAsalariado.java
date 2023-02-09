package companias;

public class EmpleadoAsalariado extends Empleado {

    private double salario;

    public EmpleadoAsalariado(String primerNombre, String primerApellido, int identificacion, double salario) {
        super(primerNombre, primerApellido, identificacion);
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public double getMontoPago() {
        return getSalario();
    }

    public void info() {
        super.info();
        System.out.println("Asalariado-------");
        System.out.println("El salario a pagar es de "+getSalario()+" pesos");

    }

}
