import java.util.Arrays;

import javax.swing.JOptionPane;

public class Punto27 {
    public void wordsArrangedAlphabetically() {
        String phrase = JOptionPane.showInputDialog("Ingrese una frase");
        String[] phraseArray = phrase.split(" ");
        Arrays.sort(phraseArray);
        for (int i = 0; i < phraseArray.length; i++) {
           JOptionPane.showConfirmDialog(null, "Las palabras ordenadas de la frase " + phrase + " es " +phraseArray[i]);
           //se deja tambien el mensaje por consola ya que se ve mejor
           System.out.println("Las palabras ordenadas de la frase " + phrase + " es " +phraseArray[i]);
        }
    }
}
