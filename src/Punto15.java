import javax.swing.JOptionPane;

public class Punto15 {
    public void determineCapicuaNumber() {
        String number = JOptionPane.showInputDialog("Ingresa un numero positivo para validar si es un numero CAPICUA");
        String cadena = "";
        String cadenaReverse = "";
        for (int i = 0; i < number.length(); i++) {
            cadena += number.charAt(i);
        }
        for (int i = number.length() - 1; i >= 0; i--) {
            cadenaReverse += number.charAt(i);
        }
        String message = (Integer.parseInt(cadena) == Integer.parseInt(cadenaReverse)) ? "El numero: " +number+ " es un numero CAPICUA" : "El numero: " +number+ " No es un numero CAPICUA";
        JOptionPane.showConfirmDialog(null, message);
    }
}
