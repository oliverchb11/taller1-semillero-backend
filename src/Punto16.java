import javax.swing.JOptionPane;

public class Punto16 {
    public void fibonaciInput() {
        String number = JOptionPane.showInputDialog("Ingresa un numero entero");
        int serie = Integer.parseInt(number);
        int previo = 0, actual = 1, suma;
        for (int i = 0; i < serie; i++) {
            System.out.println(previo);
            suma = previo + actual;
            previo = actual;
            actual = suma;
        }

    }
}
