import javax.swing.JOptionPane;

public class Punto24 {
    public void replaceLetterChain() {
        String chain = JOptionPane.showInputDialog("Ingrese una cadena");
        String replaceLetter = JOptionPane
                .showInputDialog("Ingrese una letra que quiera remplazar de la cadena anterior -> " + chain);
        String newLetter = JOptionPane.showInputDialog("Ingrese la letra nueva");
        String convertChain = chain.replace(replaceLetter, newLetter);
        JOptionPane.showMessageDialog(null,
                "En la cadena: " + chain + " Se remplazo la letra: " + replaceLetter + " por la letra "
                        + newLetter + " y la cadena final es " + convertChain);
    }
}
