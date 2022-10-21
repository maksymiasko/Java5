import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    //Test_1
    //inputArray = IrinasArray
    @Test
    public void testNegativeOnTheRightIrinasArray_HappyPath() {
        //arrange
        int[] inputArray = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputArray = EmptyArray
    @Test
    public void testNegativeOnTheRightEmptyArray_HappyPath() {
        //arrange
        int[] inputArray = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputArray = ToShortArray
    @Test
    public void testNegativeOnTheRightToShortArray_HappyPath() {
        //arrange
        int[] inputArray = {1};
        int[] expectedResult = {1};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputArray = PositiveArray
    @Test
    public void testNegativeOnTheRightPositiveArray_HappyPath() {
        //arrange
        int[] inputArray = {3, 2, 7, 5, 1, 9, 23, 1, 2};
        int[] expectedResult = {3, 2, 7, 5, 1, 9, 23, 1, 2};

        //act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
