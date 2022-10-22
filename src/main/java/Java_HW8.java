import java.util.Arrays;

public class Java_HW8 {
    public static void main(String[] args) {


        int[] firstArray = {100, 2, -1, 4, 5, 6, 7, 8, 45};
        int[] secondArray = {100, 200, 45, 3, -1, 5, 3, 7, 5, 9};
//
//
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(new Utils().buildIntersectionsOfTwoArrays(firstArray, secondArray)));
        System.out.println(Arrays.toString(new Utils().bubbleSortArray(new Utils().buildIntersectionsOfTwoArrays(firstArray, secondArray))));
        System.out.println(Arrays.toString(new Utils().removeDuplicatesFromArray(new Utils().bubbleSortArray(new Utils().buildIntersectionsOfTwoArrays(firstArray, secondArray)))));

//        int[] inputArray = {4, -3, 7, -12, -5, 2, -9, -4};
//        System.out.println(Arrays.toString(new Utils().bubbleSortArray(inputArray)));
//
        //int[] inputArray = {3, 2, 7, 5, 1, 9, 23, 1, 2};
        //System.out.println(Arrays.toString(new ReverseArray().reverseArray(inputArray)));
        //System.out.println(Arrays.toString(new PeakElement().peakElement(inputArray)));
        //int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        //System.out.println(Arrays.toString(new NegativeOnTheRight().negativeOnTheRight(inputArray)));


//     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
//        int[] inputArray = {4, 3, 7, 12, 5, 2, 9, 4, 12};
//        int n = 12;
//        System.out.println(Arrays.toString(new SumOfTwo().sumOfTwo(inputArray,n)));
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        int f = 5;
//        System.out.println(Arrays.toString(new CreateArray().createIntArray(a, b, c, d, f)));

//        Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
//        String inputString = "It was an apple pie";
//        System.out.println(Arrays.toString(new CreateArray().createArrayFromText(inputString)));

//        System.out.println(new OddEvenValuesInArray().countEvenValuesInArray(inputArray));
//        int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};
//        int number = -13;
//        System.out.println(new ManipulationsWithArrays().areValuesGreaterThanNumber(inputArray, number));
    }
}

