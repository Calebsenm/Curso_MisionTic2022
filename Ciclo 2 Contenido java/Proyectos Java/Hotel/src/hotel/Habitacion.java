
package hotel;
public class Habitacion {
    private int numeroHabitacion;
    private int numeroCamas;

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Habitacion(int numeroHabitacion, int numeroCamas) {
        this.numeroHabitacion = numeroHabitacion;
        this.numeroCamas = numeroCamas;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    
    
}
