import java.util.HashMap;
import java.util.Map;

public class Punto33 {
    public void countFrequencyElementArray() {
        int[] arreglo = { 1, 2, 3, 4, 5, 1, 2, 1, 3, 4, 6, 7, 8, 9, 2 };
        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("El elemento " + entry.getKey() + " aparece " + entry.getValue() + " veces.");
        }
    }
    public static Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }
        return frecuencia;
    }

}
