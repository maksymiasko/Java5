public class ManipulationsWithArrays {

    // Написать метод multipleArrayByNumber(), который принимает на вход массив целых чисел и число int number.
//  Метод возвращает массив тех же чисел, умноженных на number
    public int[] multipleArrayByNumber(int[] inputArray, int number) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i] * number;
        }

        return outputArray;
    }

    // Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
//  и возвращает массив типа double[] из тех же чисел
    public double[] toDoubleArray(int[] inputArray) {
        double[] outputArray = new double[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = inputArray[i];
        }

        return outputArray;
    }

    // Написать метод toIntArray(), который принимает на вход массив типа double[],
//     и возвращает массив типа int[] из тех же чисел
    public int[] toIntArray(double[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = (int) inputArray[i];
        }

        return outputArray;
    }

    //    Написать метод toStringArray(), который принимает на вход массив целых чисел,
//    и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
//    нужно переводить вручную)
    public String[] toStringArray(int[] inputArray) {
        String[] outputArray = new String[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = String.valueOf(inputArray[i]);
        }

        return outputArray;
    }

    //    Перегрузить метод toStringArray() параметром double[].
//    Этот метод должен возвращать массив типа String[] (желательно
//    не использовать метод .toString(), нужно переводить вручную)
    public String[] toStringArray(double[] inputArray) {
        String[] outputArray = new String[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = String.valueOf(inputArray[i]);
        }

        return outputArray;
    }
}
