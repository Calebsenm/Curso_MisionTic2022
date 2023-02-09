package view;

import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame{
    private Container panel;
    private JButton boton;

    public MyForm() {
        super("My Formulario");
        init();
      
    }
    
    private void init(){
        panel = getContentPane();
        boton = new JButton("Hola, soy un boton");
        
        panel.add(boton);
        
        setSize(300,300);//darle un tamaño
        setLocationRelativeTo(null);//situar en el centro de la pantalla
        setVisible(true);//Visualizar
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyForm aplicacion = new MyForm();
    }
    
    
    

}
