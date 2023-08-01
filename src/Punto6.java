import javax.swing.JOptionPane;

public class Punto6 {
    public void validNumberPositiveAndNegativeOrZero() {
        String number = JOptionPane.showInputDialog("Ingrese un numero para validar si es positivo, negativo o cero");
        if (Integer.parseInt(number) > 0) {
            JOptionPane.showMessageDialog(null, "El numero " + number + " es positivo");
        } else if (Integer.parseInt(number) < 0) {
            JOptionPane.showMessageDialog(null, "El numero " + number + " es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + number + " es cero");
        }
    }
}
