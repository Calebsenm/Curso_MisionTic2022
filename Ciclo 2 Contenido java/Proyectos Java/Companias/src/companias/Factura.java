package companias;

public class Factura implements gycporPagar {

    private int idProducto;
    private String descripcionProducto;
    private int cantidad = 0;
    private double preciounitario;

    public Factura(int idProducto, String descripcionProducto, int cantidad, double preciounitario) {
        this.idProducto = idProducto;
        this.descripcionProducto = descripcionProducto;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
        if (preciounitario >= 0) {
            this.preciounitario = preciounitario;
        }
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        if (preciounitario >= 0) {
            this.preciounitario = preciounitario;
        }
    }

    public void info() {
        System.out.println("Factura-------");
        System.out.println("Id del producto" + getIdProducto());
        System.out.println("Descripcion del producto" + getDescripcionProducto());
        System.out.println("Cantidad:" + getCantidad());
        System.out.println("precio unitario:" + getPreciounitario());

    }

    public double getMontoPago() {
        double montoapagar = getCantidad()*getPreciounitario();
        return montoapagar;
    }

}
