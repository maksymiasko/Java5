import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    //Test_1
    //inputIntArray = ArrayPositiveNumbers
    // @Ignore
    @Test
    public void testSumArrayPositiveNumbers_HappyPath() {
        //arrange
        int[] inputIntArray = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(inputIntArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_2
    //inputIntArray = ArrayNegativeNumbers
    // @Ignore
    @Test
    public void testSumArrayNegativeNumbers_HappyPath() {
        //arrange
        int[] inputIntArray = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(inputIntArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_3
    //inputIntArray = ArrayZeroLength
    // @Ignore
    @Test
    public void testSumArrayZeroLength_HappyPath() {
        //arrange
        int[] inputIntArray = {};
        int expectedResult = 0;

        //act
        int actualResult = new SumArray().sumArray(inputIntArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
