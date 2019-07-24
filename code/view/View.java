package tp.MVC.com;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.text.DecimalFormat;


public class View extends JFrame {

    private JLabel label1, label2;
    private JTextField fahrenheitTemp, centigradeTemp;
    private JPanel fpanel, cpanel, sliderPanel, slider2Panel; 
    private JSlider slider, slider2;
    private Container contentPane;
    
    
    
    public View() {
        
        setTitle("Temperature UT");
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1 = new JLabel("Fahrenheit: ");
        label2 = new JLabel("Celsius: ");
        
        fahrenheitTemp = new JTextField("0.0", 10);
        fahrenheitTemp.setEditable(false);
        centigradeTemp = new JTextField("0.0", 10);
        centigradeTemp.setEditable(false);
        
        slider = new JSlider(JSlider.VERTICAL,0,100,0);
        slider2 = new JSlider(JSlider.VERTICAL,0,100,0);
        
        
       
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListener());
        
        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        slider2.addChangeListener(new SliderListener2());
        
        fpanel = new JPanel();
        fpanel.add(label1);
        fpanel.add(fahrenheitTemp);
        cpanel = new JPanel();
        cpanel.add(label2);
        cpanel.add(centigradeTemp);
        sliderPanel = new JPanel();
        sliderPanel.add(slider);
        slider2Panel = new JPanel();
        slider2Panel.add(slider2);

        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2,1));

        
        contentPane.add(sliderPanel);
        contentPane.add(slider2Panel);
        contentPane.add(fpanel);
        contentPane.add(cpanel);

        pack();
        setVisible(true);
       
    } 
    
    private class SliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
                
            double fahrenheit, centigrade;
            DecimalFormat fmt = new DecimalFormat("0.0");
            
            fahrenheit = slider.getValue();
            centigrade = FarenheitTOCelcius(fahrenheit);
        
            
           

        
            centigradeTemp.setText(fmt.format(centigrade));
        
            fahrenheitTemp.setText(fmt.format(fahrenheit));
        }
    }
    
    private class SliderListener2 implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
                
            double fahrenheit, centigrade;
            DecimalFormat fmt = new DecimalFormat("0.0");
        
            centigrade = slider2.getValue();
        
            fahrenheit = CelciusTOFarenheit(centigrade);
           

        
            centigradeTemp.setText(fmt.format(centigrade));
        
            fahrenheitTemp.setText(fmt.format(fahrenheit));
        }
    }
    
}
