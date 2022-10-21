import java.util.Arrays;

//Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
//        Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//        и среднее среди всех значений между 2-мя индексами.
public class MinMaxAve {

    public int[] minMaxAve(int[] inputArray, int minIndex, int maxIndex) {
        if (0 <= minIndex && maxIndex < inputArray.length) {
            if (0 == new AreNumbersEqual().areNumbersEqual(minIndex, maxIndex)) {

                return new int[]{inputArray[minIndex], inputArray[maxIndex], inputArray[minIndex]};
            }
            if (-1 == new AreNumbersEqual().areNumbersEqual(minIndex, maxIndex)) {

                return minMaxAveOfSubArray(inputArray, minIndex, maxIndex);
            }
            if (1 == new AreNumbersEqual().areNumbersEqual(minIndex, maxIndex)) {

                return minMaxAveOfSubArray(inputArray, maxIndex, minIndex);
            }

            return new int[]{};
        }

        return new int[]{};
    }

    public int[] minMaxAveOfSubArray(int[] inputArray, int minIndex, int maxIndex) {
        int tmpArrayMaxValue = Integer.MIN_VALUE;
        int tmpArrayMinValue = Integer.MAX_VALUE;
        int countValueOfTmpArray = 0;
        int[] tmpArray = new int[maxIndex - minIndex + 1];
        for (int i = minIndex, j = 0; i <= maxIndex; i++, j++) {
            tmpArray[j] = inputArray[i];
            if (tmpArrayMaxValue < tmpArray[j]) {
                tmpArrayMaxValue = tmpArray[j];
            }
            if (tmpArrayMinValue > tmpArray[j]) {
                tmpArrayMinValue = tmpArray[j];
            }
            countValueOfTmpArray = countValueOfTmpArray + tmpArray[j];
        }

      return new int[]{tmpArrayMinValue, tmpArrayMaxValue, countValueOfTmpArray / tmpArray.length};
    }
}