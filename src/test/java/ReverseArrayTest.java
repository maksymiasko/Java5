import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    //Test_1
    //inputArray = PositiveNumberArray
    @Test
    public void testPositiveNumberArray_HappyPath() {
        //arrange
        int[] inputArray = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        //act
        int[] actualResult = new ReverseArray().reverseArray(inputArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_2
    //inputArray = EmptyArray
    @Test
    public void testEmptyArray_HappyPath() {
        //arrange
        int[] inputArray = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new ReverseArray().reverseArray(inputArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
