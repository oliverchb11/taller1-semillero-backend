import javax.swing.JOptionPane;

public class Punto7 {
    public void numberTableMultiplicationTen() {
        String number = JOptionPane.showInputDialog("Ingrese un numero entero positivo para multiplicarlo por la tabla del 10");
        int maxNumber = 10;
        for (int i = 1; i <= maxNumber; i++) {
            JOptionPane.showMessageDialog(null, "La tabla de multiplicar hasta el 10 para el numero: "+number+" es: "+ Integer.parseInt(number) + "x" + i + "=" + Integer.parseInt(number) * i);
        }
    }
}
