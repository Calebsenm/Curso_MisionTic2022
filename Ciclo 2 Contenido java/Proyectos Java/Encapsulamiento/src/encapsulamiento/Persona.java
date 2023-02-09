
package encapsulamiento;

public class Persona {
    
    private String primernombre;
    private String segundoapellido;
    private int edad;
    private char genero;
    private int cedula;
    private String Profesion; 
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public Persona(String primernombre, String segundoapellido, char genero, int cedula, String Profesion) {
        this.primernombre = primernombre;
        this.segundoapellido = segundoapellido;
        this.genero = genero;
        this.cedula = cedula;
        this.Profesion = Profesion;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    
    
    // constructor
    public Persona(String primernombre,String segungoapellido,int edad,char genero, int cedula, String Profesion){
        this.primernombre=primernombre;
        this.segundoapellido= segundoapellido;
        this.edad=edad;
        this.genero=genero;
        this.cedula=cedula;
        this.Profesion= Profesion;  
    }
    public boolean esmayordeedad(){
        return (edad>18);
    }
    
}
