package view;

import javax.swing.JOptionPane;

public class View {

    public int menu() {
        int op = 0;
        op = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones Lista de productos"
                + "\n1. Mostrar la lista de productos"
                + "\n2. Crear un producto(C) y agregar a la lista de productos "
                + "\n3. Mostrar un producto(R) con su id"
                + "\n4. Actualizar un producto(U) con su id"
                + "\n5. Borrar o Remover un producto(D) con su id"
        ));
        return op;
    }

    public void mostrarlistadeproductos(String listaproductos) {
        JOptionPane.showMessageDialog(null, listaproductos);
    }

    public int crearproducto() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese el codigo del producto a crear"));
        return codigo;

    }

    public void agregarproducto() {
        JOptionPane.showMessageDialog(null, "Nuevo producto agregado");
    }

    public int idproducto() {
        int idproducto = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese el id del producto"));
        return idproducto;
    }

    public void mostrarproducto(String infoproducto) {
        JOptionPane.showMessageDialog(null, infoproducto);
    }
/* Editar producto*/
    public int actualizarcodigoproducto() {
        int codigo= Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese el nuevo codigo del producto"));
        return codigo;
    }

    public String actualizardescripcionproducto() {
        String descripcion=JOptionPane.showInputDialog("Favor ingrese la descripcion del producto");
        return descripcion;
    }

    public Double actualizarpreciounitarioproducto() {
        double preciounitario= Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio unitario"));
        return preciounitario;
    }
}
