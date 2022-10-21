//Написать алгоритм SumArray, который возвращает сумму всех чисел массива

import java.sql.Array;

public class SumArray {

    public int sumArray(int[] inputIntArray) {
       int summToReturn = 0;
            for (int j : inputIntArray) {
                summToReturn = summToReturn + j;
            }

       return summToReturn;
    }
}
