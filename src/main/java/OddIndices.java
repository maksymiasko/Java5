//Написать алгоритм OddIndices, который принимает массив целых чисел,
//и возвращает массив значений нечетных индексов

public class OddIndices {

    public int[] oddIndices(int[] inputIntArray) {
        if (inputIntArray.length > 1) {
            int returnOddArrayLength = inputIntArray.length % 2 == 0 ? inputIntArray.length / 2: (inputIntArray.length - 1) / 2;
            int[] returnOddArray = new int[returnOddArrayLength];
            for (int i = 1, j = 0; i < inputIntArray.length; i = i + 2 , j++) {
                    returnOddArray[j] = inputIntArray[i];
            }
            return returnOddArray;
        }
        return new int[0];
    }
}

