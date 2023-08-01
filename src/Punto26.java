import javax.swing.JOptionPane;

public class Punto26 {
    public void chartersCount() {
        String chain = JOptionPane.showInputDialog("Ingrese una cadena");
        String[] lengthChain = chain.split(" ");
        String union = "";
        for (int i = 0; i < lengthChain.length; i++) {
            union += lengthChain[i];
        }

        JOptionPane.showMessageDialog(null, "La cadena: "+chain+ " tiene: " +union.length()+ " caracteres sin contar espacios");
    }
}
