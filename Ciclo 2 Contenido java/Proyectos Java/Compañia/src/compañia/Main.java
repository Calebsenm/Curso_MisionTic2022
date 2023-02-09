
package compañia;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        gycporpagar[] listaporpagar = new gycporpagar[4] ;
        
        listaporpagar[0] = new Factura(223232,"resma de papel",50,3000);
        listaporpagar[1] = new Factura(43545," papel higinico ",4,30);
        listaporpagar[2] = new Epleadoasalariado("caleb","seña",323234,334);
        listaporpagar[3] = new Epleadoasalariado("carlos ","benites",3434434,234);
        
        System.out.println("Lista de facturas y empleados a pagar");
        
        
        for (gycporpagar objetosapagar : listaporpagar){
            System.out.println("----------");
            objetosapagar.info();
            System.out.println(objetosapagar.getMontoPago());
        
        }
    }
    
}
