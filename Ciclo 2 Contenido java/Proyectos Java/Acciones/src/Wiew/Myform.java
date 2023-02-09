
package Wiew;

import java.awt.*;
import javax.swing.*;

public class Myform extends JFrame {
    private Container panel;
    private JButton boton;

    public Myform() {
        super("My Fumulario :)");
        init();
        
        
    }
    private  void init(){
    panel = getContentPane();
        boton = new JButton("Boton 1");
        boton = new JButton("Boton 2");
        
        
       
        panel.add(boton);
        
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args){
        Myform aplicacion = new Myform();
    
    }
    
    
}
