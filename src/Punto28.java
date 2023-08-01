public class Punto28 {
    public void sumOfElementsOfAnArray(){
        int[] numbersArray = {1,2,3,20,50,60,80,120,158,5,62};
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i];
        }
        System.out.println("La suma total de los numeros del arreglo recorrido es de: " +sum);
    }
}
