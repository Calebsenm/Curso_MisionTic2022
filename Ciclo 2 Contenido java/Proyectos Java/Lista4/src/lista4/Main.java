
package lista4;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona carolina = new Persona("Carolina");
        Persona leonardo = new Persona("Leonardo");
        
        
        Perro cobarde = new Perro("cobarde");
        Perro rufus = new Perro("cobarde");
        Perro solitario = new Perro("cobarde");
        
        carolina.adoptar(rufus);
        System.out.println("carolina adopto a "+ carolina.getMascotas().size()+ "perros");
        //System.out.println(carolina.getMascotas());
        System.out.println("Adopto a estos perros");
        for (int i=0 ;i <carolina.getMascotas().size();i++){
            System.out.println(carolina.getMascotas().get(i).getNombre());
        }
        leonardo.adoptar(cobarde,"valiente");
        leonardo.adoptar(solitario,"compañia");
        
        System.out.println("Leonardo adopto"+leonardo.getMascotas().size()+"Perros");
        for (int i=0 ;i <leonardo.getMascotas().size();i++){
            System.out.println(leonardo.getMascotas().get(i).getNombre());
        }
    }
    
}
