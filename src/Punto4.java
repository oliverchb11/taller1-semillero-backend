import javax.swing.JOptionPane;

public class Punto4 {
    public void validAge() {
        String age = JOptionPane.showInputDialog("Ingrese su edad para validar si es mayor o menor de edad");
        String message = (Integer.parseInt(age) >= 18) ? "Es mayor de edad" : "Es menor de edad";
        JOptionPane.showMessageDialog(null, message);
    }
}
