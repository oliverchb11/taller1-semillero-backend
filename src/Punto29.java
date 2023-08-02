public class Punto29 {
    public void largestNumberInAnArray(){
        int[] numbersArray = {1,2,3,20,50,60,80,120,158,5,62};
        int index = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if(numbersArray[i] > numbersArray[index]){
                index = i;
            }
        }
        System.out.println("El numero mayor de arreglo anterior es: " + numbersArray[index]);
    }
}
