
package list3;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int indentification;
    

    public Persona(String nombre) {
        this.nombre=nombre;
    }

    public Persona(String nombre, String apellido, int indentification) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.indentification = indentification;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    
   
    
}
