import javax.swing.JOptionPane;

public class Punto2 {

    public void evenOrOdd() {
        String number = JOptionPane.showInputDialog("Ingresa un numero entero para ver si es par o impar");
        String message = (Integer.parseInt(number) % 2 == 0) ? "El numero es par" : "El numero es impar";
        JOptionPane.showConfirmDialog(null, message);
    }

}
