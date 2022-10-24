public class Utils {

    public int[] bubbleSortArray(int[] inputArray) {
        if (inputArray.length != 0) {
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < inputArray.length - 1; i++) {
                    if (inputArray[i] > inputArray[i + 1]) {
                        int tmp = inputArray[i];
                        inputArray[i] = inputArray[i + 1];
                        inputArray[i + 1] = tmp;
                        sorted = false;
                    }
                }
            }

            return inputArray;
        }
        return inputArray;
    }

    public int[] removeDuplicatesFromSortedArray(int[] inputArray) {
        if (inputArray.length != 0) {
            int outlength = 1;
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] != inputArray[i - 1]) {
                    inputArray[outlength] = inputArray[i];
                    outlength++;
                }
            }

            return outputArray(inputArray, outlength);
        }

        return inputArray;
    }

    public int[] buildIntersectionsOfTwoArrays(int[] firstArray, int[] secondArray) {
        int outlength = 0;
        int[] outputArray = new int[firstArray.length + secondArray.length];
        for (int i : firstArray)
            for (int j : secondArray) {
                if (j == i) {
                    outputArray[outlength] = j;
                    outlength++;
                }
            }

        return outputArray(outputArray, outlength);
    }

    public int[] outputArray(int[] inputArray, int outlength) {
        int[] outputArray = new int[outlength];
        for (int i = 0; i < outlength; i++) {
            outputArray[i] = inputArray[i];
        }

        return outputArray;
    }

    // метод из Utils для чужой SumOfTwo
    public static boolean isExistInArr(int[] arr, int a) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i : arr) {
            if (i == a) {
                return true;
            }
        }
        return false;
    }

    // формируем массив искомых пар
    public int[][] SummOfTwo(int[] inputArray, int n) {
        int length = new Utils().lengthOutputArray(inputArray, n);
        int[][] outputArray = new int[length][2];
        for (int i = 0,k = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == n && inputArray[i] !=n && inputArray[j] != n) {
                    outputArray[k][0] = inputArray[i];
                    outputArray[k][1] = inputArray[j];
                    k++;

                }
            }
        }
        return outputArray;
    }
    // находим длину массива вывода = количество искомых пар
    public int lengthOutputArray(int[] inputArray, int n) {
        int length = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == n && inputArray[i] != n && inputArray[j] != n) {
                    length++;

                }
            }
        }
        return length;
    }
}
