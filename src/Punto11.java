import javax.swing.JOptionPane;

public class Punto11 {
    public void calculateAreaOfATriangleHeron() {
        String length = JOptionPane.showInputDialog("Ingresa la primera longitud del triangulo");
        String length1 = JOptionPane.showInputDialog("Ingresa la segunda longitud del triangulo");
        String length2 = JOptionPane.showInputDialog("Ingresa la tercera longitud del triangulo");
        int semiperimeter = (Integer.parseInt(length) + Integer.parseInt(length1) + Integer.parseInt(length2))/2;
        double area = Math.sqrt(semiperimeter * (semiperimeter - Integer.parseInt(length)) * (semiperimeter - Integer.parseInt(length1)) * (semiperimeter - Integer.parseInt(length2)));
        if(Double.isNaN(area)) {
            JOptionPane.showMessageDialog(null, "\u00A1El tri\u00E1ngulo no existe!");
            return;
        }
        JOptionPane.showMessageDialog(null, "El area del triangulo con la formula de HERON es: "+area);
    }
}

//pagina web de calculadora de heron para probar https://es.onlinemschool.com/math/assistance/figures_area/triangle1/