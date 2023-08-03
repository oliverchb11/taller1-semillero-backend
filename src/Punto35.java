public class Punto35 {
    public void tableMultiplicationOneTen() {
        int[][] matriz = new int[10][10];
        for (int k = 0; k < 10; k++) {
            System.out.println(" ");
            System.out.println("Tabla de Multiplicar del: "+(k+1));
            for (int k2 = 0; k2 < 10; k2++) {
                matriz[k][k2] = (k+1) * (k2+1);  
                System.out.println((k+1) +" x "+ (k2+1) + " = "+ matriz[k][k2] );
            }
        }
    }
}
