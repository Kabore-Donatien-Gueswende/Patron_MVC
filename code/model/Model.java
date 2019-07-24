package tp.MVC.com;

public class Model {
    
    private float celsius ;
    
    private float fahrenheit;

    public float getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }
    
    public float CelciusTOFarenheit(float celcius) {
        float farenheit = (celcius * 9/5) + 32;
        return farenheit;
    }
    
    public float FarenheitTOCelcius(float Farenheit) {
        float celcius = (Farenheit - 32) * 5/9;
        return celcius;
    }
    
}
