import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    //Test_1
    //inputValue = IntNumbers
    // @Ignore
    @Test
    public void testCountEvenValuesInArray_HappyPath() {
        //arrange
        int[] inputArray = {4, -3, 7, -12, -5, 2, -9, -4};
        int expectedResult = 4;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputValue = EmptyArray
    // @Ignore
    @Test
    public void testEvenCountValuesInEmptyArray_HappyPath() {
        //arrange
        int[] inputArray = {};
        int expectedResult = -1;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputValue = NoEvenNumbersArray
    // @Ignore
    @Test
    public void testCountEvenValuesNoEvenArray_HappyPath() {
        //arrange
        int[] inputArray = {1, 3, 5};
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputValue = IntNumbers
    // @Ignore
    @Test
    public void testCountOddValuesInArray_HappyPath() {
        //arrange
        int[] inputArray = {4, 7, -12, -5, 2, -9, -4};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_5
    //inputValue = EmptyArray
    // @Ignore
    @Test
    public void testCountOddValuesInEmptyArray_HappyPath() {
        //arrange
        int[] inputArray = {};
        int expectedResult = -1;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_6
    //inputValue = NoOddNumbersArray
    // @Ignore
    @Test
    public void testOddEvenValuesNoEvenArray_HappyPath() {
        //arrange
        int[] inputArray = {2, 4, -6};
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
