import javax.swing.JOptionPane;

public class Punto19 {
    public void textLowecaseAndUppercase() {
        String name = JOptionPane.showInputDialog("Ingresa su nombre por favor");
        JOptionPane.showMessageDialog(null, "Su nomber en Minuscula es: " +name.toLowerCase());
        JOptionPane.showMessageDialog(null, "Su nomber en Mayuscula es: " +name.toUpperCase());
    }
}
