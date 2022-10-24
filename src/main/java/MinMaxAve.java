import java.util.Arrays;

//Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
//        Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//        и среднее среди всех значений между 2-мя индексами.
public class MinMaxAve {

    public int[] minMaxAve(int[] inputArray, int minIndex, int maxIndex) {
        if (inputArray == null) { // not null, not empty

            return new int[]{-1, minIndex, maxIndex};
        } else if (minIndex < 0 || maxIndex > inputArray.length) { // out of bound

            return new int[]{0, minIndex, maxIndex};
        }
        if (inputArray.length == 1) { // too short array

            return new int[]{1, minIndex, maxIndex};
        }

        if (minIndex == maxIndex) { // same indexes

            return new int[]{inputArray[minIndex], inputArray[minIndex], inputArray[minIndex]};
        }
        if (minIndex < maxIndex) {
            if (Math.abs(maxIndex - minIndex) == 1) { // indexes too close

                return new int[]{inputArray[minIndex], inputArray[maxIndex], (inputArray[minIndex] + inputArray[maxIndex]) / 2};
            }

            return minMaxAveOfSubArray(inputArray, minIndex, maxIndex);
        } else if (Math.abs(maxIndex - minIndex) == 1) {                               // (minIndex > maxIndex)


                return new int[]{inputArray[maxIndex], inputArray[minIndex], (inputArray[minIndex] + inputArray[maxIndex]) / 2};
            }

            return minMaxAveOfSubArray(inputArray, maxIndex, minIndex);
        }



    public int[] minMaxAveOfSubArray(int[] inputArray, int minIndex, int maxIndex) {
        int maxArrayValue = Integer.MIN_VALUE;
        int minArrayValue = Integer.MAX_VALUE;
        int sumArrayValue = 0;
        int[] outArray = new int[maxIndex - minIndex + 1];
        for (int i = minIndex, j = 0; i <= maxIndex; i++, j++) {
            outArray[j] = inputArray[i];
            if (maxArrayValue < outArray[j]) {
                maxArrayValue = outArray[j];
            }
            if (minArrayValue > outArray[j]) {
                minArrayValue = outArray[j];
            }
            sumArrayValue = sumArrayValue + outArray[j];
        }

        return new int[]{minArrayValue, maxArrayValue, sumArrayValue / outArray.length};
    }
}