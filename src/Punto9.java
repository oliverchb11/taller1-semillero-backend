import javax.swing.JOptionPane;

public class Punto9 {
    public void computeFactorial() {
        String number = JOptionPane.showInputDialog("Ingresa un numero entero positivo y se le calculara el factorial");
        int factorial = 1;
        for (int i = 1; i <= Integer.parseInt(number); i++) {
            factorial = factorial * i ;
        }
       JOptionPane.showMessageDialog(null, "El factorial de: "+ number + " es: " +factorial);
    }
}
