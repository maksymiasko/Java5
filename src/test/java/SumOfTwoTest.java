
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {

    //Test_1
    // @Ignore
    @Test
    public void test_HappyPath() {
        int[] inputArray = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {new int[]{3, 9}, new int[]{7, 5}};
        int[][] actualResult = new SumOfTwo().sumOfTwo(inputArray, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    // @Ignore
    @Test
    public void testRepeat_HappyPath() {
        int[] inputArray = {3, 3, 3, 3, 9, 9, 9, 9, 12};
        int n = 12;
        int[][] expectedResult = {new int[]{3, 9}};
        int[][] actualResult = new SumOfTwo().sumOfTwo(inputArray, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    // @Ignore
    @Test
    public void testRepeatNegative_HappyPath() {
        int[] inputArray = {3, 3, 3, -3, 9, -9, 9, 9, 12};
        int n = -12;
        int[][] expectedResult = {new int[]{-3, -9}};
        int[][] actualResult = new SumOfTwo().sumOfTwo(inputArray, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    // @Ignore
    @Test
    public void testNoMatches_HappyPath() {
        int[] inputArray = {3, 3, 3, 3, 9, 9, 9, 9, 12};
        int n = 125;
        int[][] expectedResult = {}; // Ноль элементов в массиве объектов
        int[][] actualResult = new SumOfTwo().sumOfTwo(inputArray, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_5
    // @Ignore
    @Test
    public void testArrOfOne_Negative() {
        int[] inputArray = {1}; //Нет пар элементов
        int n = 1;
        int[][] expectedResult = {}; // Ноль элементов в массиве объектов
        int[][] actualResult = new SumOfTwo().sumOfTwo(inputArray, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_6
    // @Ignore
    @Test
    public void testEmptyArr_Negative() {
        int[] inputArray = {};
        int n = 0;
        int[][] expectedResult = {}; // Ноль элементов в массиве объектов
        int[][] actualResult = new SumOfTwo().sumOfTwo(inputArray, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

}

