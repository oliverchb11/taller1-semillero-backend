import javax.swing.JOptionPane;

public class Punto18 {
    public void passwordRandom(){
        int password =(int) ((Math.random() * 12345 + 9999));
        int number =(int) ((Math.random() * 24 + 1));
        String bancoStringLower = "abcdefghijklmnopqrstuvwxyz";
        String bancoStringUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String bancoStringSymbol = "@#$%^&*().!=_-+?,<>{}[]':;`";
        String text = String.valueOf(bancoStringLower.charAt(number)) +  String.valueOf(bancoStringUpper.charAt(number)) + String.valueOf(bancoStringSymbol.charAt(number));
        String passwordString  = String.valueOf(password);
        String newPasswordGenerate = text.concat(passwordString);
        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: "+ newPasswordGenerate);
    }
}
