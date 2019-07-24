package tp.MVC.com;


public class Demo {
    public static void main (String [] args) {
        
        Model model = new Model();
        
        View view = new View();
        
        Controllers controllers = new Controllers(model, view);
        
        controllers.updateView();
        
        controllers.updateView();

    }
}
