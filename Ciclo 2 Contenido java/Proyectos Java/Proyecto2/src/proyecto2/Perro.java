package proyecto2;

public class Perro {
    public String nombre;
    public String color;
    public String rasa;
    public String tamaño;
    public int edadMeses;
    public boolean peligrosidad;
    public char sexo; //H o M
    public Perro (String nombre,String color,String rasa,String tamaño,
            int edadMeses,boolean peligrosidad, char sexo){
        this.nombre=nombre;
        this . color = color;
        this. rasa= rasa;
        this. tamaño= tamaño;
        this .edadMeses=edadMeses;
        this. peligrosidad = peligrosidad;
        this. sexo = sexo; 
    }
    public String getInfo(){
        return "El perro es de color "+ color + "de raza " + rasa + "es de tamaño" + tamaño + "tiene "+ edadMeses +"meses de edad "+ "y es"+sexo;
    }
        
}
