import javax.swing.JOptionPane;

public class Punto5 {

    public void majorNumber() {
        String number1 = JOptionPane.showInputDialog("Ingresa un numero entero");
        String number2 = JOptionPane.showInputDialog("Ingresa otro numero entero");
        if (Integer.parseInt(number1) > Integer.parseInt(number2)) {
            JOptionPane.showMessageDialog(null, "El numero1: " + number1 + " es mayor que el numero2: " + number2);
        } else if (Integer.parseInt(number1) < Integer.parseInt(number2)) {
            JOptionPane.showMessageDialog(null, "El numero2: " + number2 + " es mayor que el numero1: " + number1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero1: " + number1 + " es igual al numero2: " + number2);
        }
    }

}
