
package lista4;

import java.util.ArrayList;

public class Persona {
    private String primerNombre;
    private String primerApellido;
    private int cedula;
    private ArrayList<Perro> mascotas;

    public Persona(String primerNombre) {
        this.primerNombre = primerNombre;
        mascotas = new ArrayList<>();
    }

    
    public Persona(String primerNombre, String primerApellido, int cedula) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.cedula = cedula;
        mascotas = new ArrayList<>();
    }
    
    public void adoptar(Perro perro){
        String nombre = perro.getNombre();
        perro.setNombre(nombre);
        perro.setDueño(this);
        mascotas.add(perro);
        
    }
    public void adoptar(Perro perro,String nuevonombre){
        
        perro.setNombre(nuevonombre);
        perro.setDueño(this);
        mascotas.add(perro);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }

    
    
    
    
     
     
}
