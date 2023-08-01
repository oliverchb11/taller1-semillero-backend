import javax.swing.JOptionPane;

public class Punto25 {
    public void separateWord() {
        String phrase = JOptionPane.showInputDialog("Ingrese una frase");
        String[] stringArray = phrase.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
           JOptionPane.showMessageDialog(null, stringArray[i]);
        }
    }
}
