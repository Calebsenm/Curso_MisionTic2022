
package Model;


public class Producto {
    private int idproducto;
    private String descripcionProducto;
    
    private double preciounitario;

    public Producto(int idproducto, String descripcionProducto, double preciounitario) {
        this.idproducto = idproducto;
        this.descripcionProducto = descripcionProducto;
        if (preciounitario <0){
            throw new IllegalArgumentException("El precio unitario debe ser mayor o igual a cero");
        }
        this.preciounitario = preciounitario;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

   

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }
    
    
}
