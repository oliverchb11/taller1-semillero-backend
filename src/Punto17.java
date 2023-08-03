import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Punto17 {
    public void allNumbersCousinsRange() {
        String number = JOptionPane.showInputDialog("Ingresa un numero entero");
        String number2 = JOptionPane.showInputDialog("Ingresa otro numero entero");
        int counterPrime = 0;
        ArrayList<Integer> primosArray = new ArrayList<Integer>();
        for (int i = Integer.parseInt(number); i <= Integer.parseInt(number2); i++) {
            counterPrime = 0;
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    counterPrime += 1;
                }
            }
            if (counterPrime <= 2) {
                primosArray.add(i);
            }
        }
        String message = (primosArray.size() > 0) ? "El rango entre: " + number + " y " + number2 + " los numeros primos son: " +primosArray : "El rango entre: " + number + " y " + number2 + " No tiene numeros primos";
        JOptionPane.showMessageDialog(null,  message);
    
    }
}
