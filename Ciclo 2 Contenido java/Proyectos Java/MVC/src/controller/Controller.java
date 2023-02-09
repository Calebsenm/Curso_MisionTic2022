package controller;

/*
Views
 */
import view.View;
/*
models
 */
import model.Model;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void init() {
        /*do while sw*/
        int op = 0;
        do {
            op = view.menu();
            switch (op) {
                case 1:
                    /* Mostrar la lista de productos*/
                    //modelo
                    String listaproductos = model.listadeproductos();
                    //view
                    view.mostrarlistadeproductos(listaproductos);
                    break;
                case 2:
                    //Crear un producto(C) 
                    int codigo = view.crearproducto();
                    model.Producto producto = new model.Producto(codigo);
                    //agregar a la lista de productos 
                    model.agregarproducto(producto);
                    view.agregarproducto();
                    break;
                case 3:
                    //mostrar un producto con el id
                    int idmostrar=view.idproducto();
                    String infoproducto = model.infoporid(idmostrar);
                    view.mostrarproducto(infoproducto);
                    break;
                case 4:
                    //actualizar un producto con el id
                    int idactualizar=view.idproducto();
                    
                    int codigoProducto=view.actualizarcodigoproducto();
                    String descripcionProducto =view.actualizardescripcionproducto();
                    double preciounitario=view.actualizarpreciounitarioproducto();
                    
                    model.actualizarproductoporid(idactualizar, codigoProducto,  descripcionProducto,  preciounitario);
                    break;
                case 5:
                    int idremover=view.idproducto();
                    model.removerproductoporid(idremover);
                    //remover un producto con el id
                    break;
                case 6:
                    //Finalizar
                    break;
            }

        } while (op != 6);// opcion 6 a finalizar

    }

}
