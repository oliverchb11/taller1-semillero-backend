import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Punto13 {
    public void roundNumericValue(){
         String decimalNumber = JOptionPane.showInputDialog("Ingresa un numero decimal");
         DecimalFormat formato = new DecimalFormat("#.00000");
         String number = formato.format(Double.parseDouble(decimalNumber));
         JOptionPane.showMessageDialog(null, "El numero decimal: " +decimalNumber+ "con 5 decimales es igual a: "+number);
    }
}
