import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenElementsInArrayTest {

    //Test_1
    //inputValue = IntNumbers
    //@Ignore
    @Test
    public void testOddEvenElementsInArray_HappyPath() {
        //arrange
        int[] inputArray = {4, 7, -12, -5, 2, -9, -4};
        int[] expectedResult = {4, 3};

        //act
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputValue = IntNumbers
    //@Ignore
    @Test
    public void testOddEvenElementsInArrayNoOdd_HappyPath() {
        //arrange
        int[] inputArray = {4, -12, 2, -4};
        int[] expectedResult = {4, 0};

        //act
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputValue = IntNumbers
    //@Ignore
    @Test
    public void testOddEvenElementsInArrayNoEven_HappyPath() {
        //arrange
        int[] inputArray = {1, -11, 121, -405,1};
        int[] expectedResult = {0, 5};

        //act
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputValue = IntNumbers
    //@Ignore
    @Test
    public void testOddEvenElementsInArrayEmpty_HappyPath() {
        //arrange
        int[] inputArray = {};
        int[] expectedResult = {-1, -1};

        //act
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
