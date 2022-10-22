//Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
//и возвращает “перевернутый” массив
public class ReverseArray {

    public int[] reverseArray(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0, j = inputArray.length - 1; i < inputArray.length; i++, j--) {
            outputArray[j] = inputArray[i];
        }

        return outputArray;
    }
}
//    public int[] reverseArray(int[] array) {
//
//        int turnOver = array.length;
//        for (int i = 0; i < turnOver / 2; i++) {
//            int temp = array[i];
//            array[i] = array[turnOver - 1 - i];
//            array[turnOver - 1 - i] = temp;
//        }
//        return array;
//    }
