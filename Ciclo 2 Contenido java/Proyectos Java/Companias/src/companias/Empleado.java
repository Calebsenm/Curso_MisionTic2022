package companias;

public class Empleado implements gycporPagar {
    private String primerNombre;
    private String primerApellido;
    private int identificacion;

    public Empleado(String primerNombre, String primerApellido, int identificacion) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.identificacion = identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    public void info(){
        System.out.println("Empleado-------");
        System.out.println("Nombre:"+getPrimerNombre()+" "+getPrimerApellido());
        System.out.println("Identificacion N°"+getIdentificacion());
    }

    @Override
    public double getMontoPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
