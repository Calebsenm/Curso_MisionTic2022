
package lista4;

public class Perro {
    private String nombre;
    private String color;
    private String raza;
    private Persona dueño;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }
    
    
}
