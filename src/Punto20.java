import javax.swing.JOptionPane;

public class Punto20 {
    public void chainText(){
            String chain = JOptionPane.showInputDialog("Ingrese una cadena de texto");
            StringBuilder stringInverted = new StringBuilder(chain).reverse();
            JOptionPane.showMessageDialog(null, "Su cadena de texto: " +chain+ " invertida es: "+stringInverted);
    }
}
