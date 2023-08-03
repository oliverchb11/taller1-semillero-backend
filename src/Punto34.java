public class Punto34 {
    public void rotationElements() {
        int numerico[] = { 1, 2, 4, 9, 12, 45, 2, 3 };
        int aux;

        System.out.println("Este es el array original");
        for (int i = 0; i < numerico.length; i++) {
            System.out.println(numerico[i]);
        }

        int cn = numerico.length - 1;

        for (int i = 0; i <= cn; i++) {
            aux = numerico[i];
            numerico[i] = numerico[cn];
            numerico[cn] = aux;
            cn--;
            if (i == cn)
                break;
        }

        System.out.println("Este es el array dado la vuelta");
        for (int i = 0; i < numerico.length; i++) {
            System.out.println(numerico[i]);
        }
    }
}
