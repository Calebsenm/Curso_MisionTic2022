package proyecto2;

public class Persona {
    String primernombre;
    String segundoapellido;
    int edad;
    char genero;
    int cedula;
    String Profesion; 
    
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
