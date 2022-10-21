import java.util.Arrays;

public class OddEvenValuesInArray {

    //    Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
//    и возвращает количество четных чисел в этом массиве
    public int countEvenValuesInArray(int[] inputArray) {
        if (inputArray.length != 0) {
            int count = 0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % 2 == 0) {
                    count++;
                }
            }

            return count;
        }

        return -1;
    }

    //    Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,
//    и возвращает количество нечетных чисел в этом массиве
    public int countOddValuesInArray(int[] inputArray) {
        if (inputArray.length != 0) {
            int count = 0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % 2 != 0) {
                    count++;
                }
            }

            return count;
        }

        return -1;
    }
}
