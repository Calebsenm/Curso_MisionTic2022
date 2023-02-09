package controller;

import model.Model;
import view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;
    private View view;

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
        /* Action Listener*/
        this.view.btMostrarvalor.addActionListener(this);
        //System.out.println(this.model.esto());
    }
    
    public void init(){
        view.setTitle("Imprima el valor");
        view.setLocationRelativeTo(null);
    }
    /* Action event */
    public void actionPerformed(ActionEvent e){
        String valor = view.txtValor.getText();
        model.setValor(Integer.parseInt(valor));
        
        System.out.println(model.getValor());
    }
    
    
}
