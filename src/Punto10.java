public class Punto10 {
    public void serieFibonacci() {
        int serie = 20;
        int previo = 0, actual = 1, suma;
        for (int i = 0; i < serie; i++) {
            System.out.println(previo);
            suma = previo + actual;
            previo = actual;
            actual = suma;
        }
    }
}
