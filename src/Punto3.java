import javax.swing.JOptionPane;

public class Punto3 {
   public void areaAndPerimeterOfACircle(){
           double pi = 3.14;
           int numberTwo = 2;
           String radio = JOptionPane.showInputDialog("Ingrese el radio 'entero' del cirulo, para calcular el area y perimetro del mismo");
           double perimeter = (numberTwo * pi * Integer.parseInt(radio));
           double area = (pi * Math.pow(Integer.parseInt(radio), numberTwo));
           JOptionPane.showConfirmDialog(null, "El area del Circulo es: " +area+ " y el perimetro es: " +perimeter);
   }
}
