import java.util.Arrays;
import javax.swing.JOptionPane;

public class Punto32 {
    public void searchElementToArray(){
        Integer[] numbersArray = {1,2,3,20,50,60,80,120,158,5,62,9,7};
        String number = JOptionPane.showInputDialog("Ingresa un numero de esta Lista" +Arrays.toString(numbersArray));
        String message = (Arrays.asList(numbersArray).indexOf(Integer.parseInt(number)) != -1) ? "El numero: "+number+ " si esta en la lista, y el indice es: " +Arrays.asList(numbersArray).indexOf(Integer.parseInt(number)) : "El numero: "+number+ " no esta en la lista";
        JOptionPane.showMessageDialog(null, message);
     
           
   
    }
}
