package model;

public class Producto {
    private int codigoProducto;
    private String descripcionProducto;
    private double preciounitario;

    public Producto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Producto(int codigoProducto, String descripcionProducto) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
    }

    public Producto(int codigoProducto, String descripcionProducto, double preciounitario) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        if (preciounitario <0){
            throw new IllegalArgumentException("El pricio unitario debe ser >=0");
        }    
        
        this.preciounitario = preciounitario;
        
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
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
    public String info(){
        String info="Codigo del producto:"+getCodigoProducto()+
                "\nDescripcion del producto:"+getDescripcionProducto()+
                "\nPrecio unitario del producto:"+getPreciounitario();
        return info;
    }
}
