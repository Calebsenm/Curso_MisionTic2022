package main;

import controller.Controller;
import model.Model;
import view.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller ctrl = new Controller(view, model);
        ctrl.init();
        view.setVisible(true);
    }

}
