import javax.swing.JOptionPane;

public class Punto21 {
    public void howManyTimesIsALetter() {
        String chain = JOptionPane.showInputDialog("Ingrese una cadena de texto");
        String letter = JOptionPane.showInputDialog("Ingrese la letra que quiera validar cuantas veces esta en la cadena previamete asignada");
        int counter = 0;
        for (int i = 0; i < chain.length(); i++) {
            if(chain.charAt(i) == letter.charAt(0)){
                counter += 1;
            }
        }
        String message = (counter > 1) ? " tiene " +counter+ " veces": " tiene " +counter+ " vez";
        JOptionPane.showMessageDialog(null, "La palabra: " +chain + message + " la letra: "+letter);
    }
}
