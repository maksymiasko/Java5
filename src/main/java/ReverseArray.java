//Написать алгоритм ReverseArray, который принимает на вход массив целых чисел,
//и возвращает “перевернутый” массив
public class ReverseArray {

    public int[] reverseArray(int[] inputArray) {
        int length = inputArray.length;
        int[] outputArray = new int[length];
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            outputArray[j] = inputArray[i];
        }

        return outputArray;
    }
}
