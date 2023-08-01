import javax.swing.JOptionPane;

public class Punto12 {
    public void validNumberPrimeOrNot() {
        int counterPrime = 0;
        String number = JOptionPane.showInputDialog("Ingresa un numero entero para validar si es primo o no");
        if(Integer.parseInt(number) == 1){
            JOptionPane.showMessageDialog(null, "El numero: " + Integer.parseInt(number) + " No es primo");
             return;
        }
        for (int i = 1; i <= Integer.parseInt(number); i++) {
            if((Integer.parseInt(number) % i) == 0){
                counterPrime += 1;
            }
        }
        if(counterPrime <= 2){
            JOptionPane.showMessageDialog(null, "El numero: " + Integer.parseInt(number) + " es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero: " + Integer.parseInt(number) + " No es primo");
        }
    }

}
