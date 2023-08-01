import javax.swing.JOptionPane;

public class Punto1 {

    String number1 = JOptionPane.showInputDialog("Ingresa un numero Entero");
    String number2 = JOptionPane.showInputDialog("Ingresa un numero Entero 2");
    
    public void sumNumber(int number1, int number2){
        int suma = number1 + number2;
        JOptionPane.showMessageDialog(null, "La suma de los numeros es: " +suma);
    }
    public void subtractionNumber(int number1, int number2){
        int subtraction = number1 - number2;
        JOptionPane.showMessageDialog(null, "La resta de los numeros es: " +subtraction);
    }
    public void multiplicationNumber(int number1, int number2){
        int multiplication = number1 * number2;
        JOptionPane.showMessageDialog(null, "La Multiplicacion de los numeros es: " +multiplication);
    }
    public void divisionNumber(int number1, int number2){
        float division = number1 / number2;
        JOptionPane.showMessageDialog(null, "La Division de los numeros es: " +division);
    }


    public void solution(){
        sumNumber(Integer.parseInt(number1), Integer.parseInt(number2));
        subtractionNumber(Integer.parseInt(number1), Integer.parseInt(number2));
        multiplicationNumber(Integer.parseInt(number1), Integer.parseInt(number2));
        divisionNumber(Integer.parseInt(number1), Integer.parseInt(number2));
    }
  

    
}
