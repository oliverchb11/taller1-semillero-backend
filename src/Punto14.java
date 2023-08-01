import javax.swing.JOptionPane;

public class Punto14 {
    public void verifyPerfectNumber() {
        String number = JOptionPane.showInputDialog("Ingresa un numero positivo para validar si es perfecto");
        int suma = 0;
        for (int i = 1; i < Integer.parseInt(number); i++) {
            if ((Integer.parseInt(number) % i) == 0) {
                suma += i;
            }
        }

        String message = (suma == Integer.parseInt(number)) ? "El numero: " + Integer.parseInt(number) + " es perfecto"
                : "El numero: " + Integer.parseInt(number) + " No es perfecto";
        JOptionPane.showConfirmDialog(null, message);

    }
}
