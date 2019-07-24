package tp.MVC.com;

public class Controllers {
    private Model model;
    private View view;
    
    public Controllers(Model model, View view) {
        super();
        this.model = model;
        this.view = view;
    }
    
    public Controllers() {
        super();
    }
    
    public void setCelciusC(float celsius) {
        model.setCelsius(celsius);
    }
    
    public void setFahrenheitC(float fahrenheit) {
        model.setFahrenheit(fahrenheit);
    }
    
    public float getCelsius() {
        return model.getCelsius();
    }
    
    public float getFahrenheit() {
        return model.getFahrenheit();
    }
}
