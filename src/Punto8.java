import javax.swing.JOptionPane;

public class Punto8 {
    public void guessNumber() {
        int i = 1;
        String number;
        int guessnumber = (int) ((Math.random() * 100 + 1));
        do {
             number = JOptionPane
                    .showInputDialog("Ingrese un numero para adivinarlo con otro numero entre 1 y 100");
            if (Integer.parseInt(number) > guessnumber) {
                i++;
                JOptionPane.showMessageDialog(null, "El numero oculto es menor que el suyo");
            } else if (Integer.parseInt(number) < guessnumber) {
                JOptionPane.showMessageDialog(null, "El numero oculto es mayor que el suyo");
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "!Adivinaste el numero!");
                i = 0;
            }
        } while (guessnumber != Integer.parseInt(number));
    }
}
