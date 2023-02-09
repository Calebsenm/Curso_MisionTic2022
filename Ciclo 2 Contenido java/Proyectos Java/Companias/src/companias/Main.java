package companias;

public class Main {

    public static void main(String[] args) {
        gycporPagar[] listaporpagar = new gycporPagar[4];

        listaporpagar[0] = new Factura(121213, "Resma de Papel", 50, 3000);
        listaporpagar[1] = new Factura(544446, "Papel higienico", 2, 30);
        listaporpagar[2] = new EmpleadoAsalariado("Caleb", "Benitez", 23232323, 223);
        listaporpagar[3] = new EmpleadoAsalariado("Caleb", "Benitez", 34535334, 456);

        System.out.println("Lista de Facturas y Empleados a pagar");
        /*
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
         */
        for (gycporPagar objetopagar : listaporpagar) {
            System.out.println("-------------------------------");
            objetopagar.info();
            System.out.println(objetopagar.getMontoPago());            
        }
    }

}
