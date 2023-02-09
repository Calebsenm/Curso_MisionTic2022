
package compañia;

public class Factura implements gycporpagar {

    private int ideProducto;
    private String descripciondelproducto;
    private int cantidad;
    private double preciounitario; 

    public Factura(int ideProducto, String descripciondelproducto, int cantidad, double preciounitario) {
        this.ideProducto = ideProducto;
        this.descripciondelproducto = descripciondelproducto;
        if (cantidad >0){
        this.cantidad = cantidad;
        }
        if (preciounitario>0){
        this.preciounitario = preciounitario;
        }
    }

    public int getIdeProducto() {
        return ideProducto;
    }

    public void setIdeProducto(int ideProducto) {
        this.ideProducto = ideProducto;
    }

    public String getDescripciondelproducto() {
        return descripciondelproducto;
    }

    public void setDescripciondelproducto(String descripciondelproducto) {
        this.descripciondelproducto = descripciondelproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >0){
        this.cantidad = cantidad;
        }
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
         if (preciounitario>0){
        this.preciounitario = preciounitario;
        }
    }
    public void info(){
        System.out.println("Factura---------------");
        System.out.println("id del producto: "+getIdeProducto());
        System.out.println("Descripcion del producto: "+getDescripciondelproducto());
        System.out.println("Cantidad: "+getCantidad());
        System.out.println("Precio unitario: "+getPreciounitario());
        
    }    
   
    public double getMontoPago() {
        double montoapagar = getCantidad()*getPreciounitario();
        return montoapagar;
    }
    
}
