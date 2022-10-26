import java.util.Arrays;

public class OddEvenElementsInArray {

    //    В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
//    который принимает на вход массив целых чисел и возвращает массив int[2],
//    который содержит количество четных и нечетных элементов входящего массива
    public int[] countOddEvenValuesInArray(int[] inputArray) {
        int even = new OddEvenValuesInArray().countEvenValuesInArray(inputArray);
        int odd = new OddEvenValuesInArray().countOddValuesInArray(inputArray);
        return new int[]{even, odd};
    }

    //    В классе OddEvenElementsInArray написать метод createOddEvenArray(),
//    который принимает массив целых случайных чисел, и возвращает двумерный
//    массив (массив четных и массив нечетных чисел)
    public int[][] createOddEvenArray(int[] inputArray) {
        int even = new OddEvenValuesInArray().countEvenValuesInArray(inputArray);
        int odd = new OddEvenValuesInArray().countOddValuesInArray(inputArray);
        int[][] outputArray = new int[2][Math.max(even, odd)];
        for (int i = 0, j = 0, k = 0; i <inputArray.length; i++)
//            for (int j = 0; j < even; )
//                for (int k = 0; k < odd; )
        {
            if (OddEven.oddEvenBol(inputArray[i])) {
                outputArray[0][j] = inputArray[i];// odd
                j++;
            } else {
                outputArray[1][k] = inputArray[i];// even
                k++;
            }

        }
        return outputArray;
    }


    public static void main(String[] args) {
        int[] inputArray = {4, 7, -12, -5, 2, -9, -4, 1, 5,0,0,0,0};
        int[][] oddEvenArray = new OddEvenElementsInArray().createOddEvenArray(inputArray);
        System.out.println((Arrays.deepToString(new OddEvenElementsInArray().createOddEvenArray(inputArray))));
    }
}