package Main;
/*
view,model,controller
*/
import view.View;
import model.Model;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
         Model model = new Model();
         View view = new View();
         
         Controller ctrl = new Controller(view, model);
         ctrl.init();
    }
}
