import java.util.Arrays;

public class Punto30 {
    public void removeDuplicateArrayElements() {
        int[] numbersArray = { 1, 2, 3, 20, 4, 1, 6, 10, 1, 50, 3, 20, 20 };
        int[] newArray = Arrays.stream(numbersArray).distinct().toArray();
        System.out.println(Arrays.toString(newArray));
    }
}
