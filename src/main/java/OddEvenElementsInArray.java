import java.util.Arrays;

public class OddEvenElementsInArray {

//    В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
//    который принимает на вход массив целых чисел и возвращает массив int[2],
//    который содержит количество четных и нечетных элементов входящего массива
    public int[]countOddEvenValuesInArray(int[]inputArray) {
        int even = new OddEvenValuesInArray().countEvenValuesInArray(inputArray);
        int odd = new OddEvenValuesInArray().countOddValuesInArray(inputArray);
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        int[] inputArray = {4, 7, -12, -5, 2, -9, -4};
        System.out.println(Arrays.toString(new OddEvenElementsInArray().countOddEvenValuesInArray(inputArray)));
    }
}
