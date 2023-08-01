import javax.swing.JOptionPane;

public class Punto23 {
    
    public void lengthPrayer(){
        String prayer = JOptionPane.showInputDialog("Ingrese una oración");
        JOptionPane.showMessageDialog(null, "La oración: " +prayer+ " tiene: " +prayer.split(" ").length+ " palabras");
    }
    
}
