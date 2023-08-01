import javax.swing.JOptionPane;

public class Punto22 {
    public void palindrome() {
        String phrase = JOptionPane.showInputDialog("Ingrese una frase para validar si es un palindromo");
        String textNomral = "";
        String textReverse = "";
        for (int i = 0; i < phrase.length(); i++) {
            textNomral += phrase.charAt(i);
        }
        for (int i = phrase.length() - 1; i >= 0; i--) {
            textReverse += phrase.charAt(i);
        }
        String message = textNomral.equals(textReverse) ? "La frase: " + phrase + " es un palindromo"
                : "La frase: " + phrase + " No es un palindromo";

        JOptionPane.showMessageDialog(null, message);

    }
}
