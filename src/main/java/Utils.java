public class Utils {

    public int[] bubbleSortArray(int[] inputArray) {
        if (inputArray.length != 0) {
            boolean sorted = false;
            int tmp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < inputArray.length - 1; i++) {
                    if (inputArray[i] > inputArray[i + 1]) {
                        tmp = inputArray[i];
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

    public int[] removeDuplicatesFromArray(int[] inputArray) {
        if (inputArray.length != 0) {
            int count = 1;
            int outputArrayLength = 1;
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] != inputArray[i - 1]) {
                    inputArray[count++] = inputArray[i];
                    outputArrayLength++;
                }
            }
            int[] outputArray = new int[outputArrayLength];
            for (int i = 0; i < outputArrayLength; i++) {
                outputArray[i] = inputArray[i];
            }

            return outputArray;
        }

        return inputArray;
    }

    public int[] buildIntersectionsOfTwoArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length != 0 && secondArray.length != 0) {
            int outLength = 0;
            int[] tmpArray = new int[firstArray.length + secondArray.length];
            for (int i : firstArray)
                for (int j : secondArray) {
                    if (j == i) {
                        tmpArray[outLength] = j;
                        outLength++;
                    }
                }
            int[] outputArray = new int[outLength];
            for (int i = 0; i < outLength; i++) {
                outputArray[i] = tmpArray[i];
            }

            return outputArray;
        }
        return new int[0];
    }
}
