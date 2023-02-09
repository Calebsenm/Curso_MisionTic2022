package model;

/*
controlador
 */
import controller.Controller;
import java.util.ArrayList;

public class Model {

    private ArrayList<model.Producto> productos = new ArrayList<>();

    public String listadeproductos() {

        String listadeproductos = "Lista de productos:\n";
        if (productos.size() > 0) {
            for (int i = 0; i < productos.size(); i++) {
                listadeproductos = listadeproductos + "producto " + i + ": " + productos.get(i).getCodigoProducto() + "\n";
            }
        } else {
            listadeproductos = "No hay productos para mostrar.";
        }
        return listadeproductos;
    }

    public void agregarproducto(Producto producto) {
        productos.add(producto);
    }
    public String infoporid(int id){
        String infoporid = productos.get(id).info();
                return infoporid;
    }
    public void actualizarproductoporid(int idactualizar,int codigoProducto,String  descripcionProducto,double  preciounitario) {
        
        productos.get(idactualizar).setCodigoProducto(codigoProducto);
        productos.get(idactualizar).setDescripcionProducto(descripcionProducto);
        productos.get(idactualizar).setPreciounitario(preciounitario);
        infoporid(idactualizar);
    }
    public void removerproductoporid(int id){
        productos.remove(id);
    }
}
