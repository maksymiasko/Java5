import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    //Test_1
    //inputValue = IntArray
    // @Ignore
    @Test
    public void testMultipleArrayByNumber_HappyPath() {
        //arrange
        int number = 3;
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {3, 6, 9, 12, 15};

        //act
        int[] actualResult = new ManipulationsWithArrays().multipleArrayByNumber(inputArray, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputValue = IntArray
    // @Ignore
    @Test
    public void testToDoubleArray_HappyPath() {
        //arrange
        int[] inputArray = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputValue = IntArray
    // @Ignore
    @Test
    public void testToIntArray_HappyPath() {
        //arrange
        double[] inputArray = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputValue = IntArray
    // @Ignore
    @Test
    public void testToStringArrayInt_HappyPath() {
        //arrange
        int[] inputArray = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        //act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_5
    //inputValue = doubleArray
    // @Ignore
    @Test
    public void testToStringArrayDouble_HappyPath() {
        //arrange
        double[] inputArray = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        //act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_6
    //inputValue = IntArrayGreaterThanNumber
    // @Ignore
    @Test
    public void testValuesGreaterThanNumber_HappyPath() {
        //arrange
        int number = -13;
        int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        boolean expectedResult = true;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(inputArray, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_7
    //inputValue = IntArrayLessThanNumber
    // @Ignore
    @Test
    public void testValuesLessThanNumber_HappyPath() {
        //arrange
        int number = 13;
        int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(inputArray, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_7
    //inputValue = IntNumberInsideIntArray
    // @Ignore
    @Test
    public void testIntNumberInsideIntArray_HappyPath() {
        //arrange
        int number = 0;
        int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(inputArray, number);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
