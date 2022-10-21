//Написать алгоритм PeakElement, который принимает на вход массив целых чисел
//и возвращает значения пиковых элементов (элементы, которые больше своих соседей)
public class PeakElement {

    public int[] peakElement(int[] inputArray) {
        int length = inputArray.length;
        if (length != 0 && length % 2 == 0 ) {
            int lengthOutputArray = 0;
            int[] tmpArray = new int[length];
            for (int i = 0, j = 0; i < length; i = i + 2, j++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    tmpArray[j] = inputArray[i];
                    lengthOutputArray++;
                } else {
                    j--;
                }
            }
            int[] outputArray = new int[lengthOutputArray];
            for (int i = 0; i < lengthOutputArray; i++) {
                outputArray[i] = tmpArray[i];
            }

           return outputArray;
        }

    return new int[0];
    }
}