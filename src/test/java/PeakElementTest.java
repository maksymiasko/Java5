import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    //Test_1
    //inputIntArray = PositiveEvenTestArray
    // @Ignore
    @Test
    public void testPositiveEvenArray_HappyPath() {
        //arrange
        int[] inputArray = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        //act
        int[] actualResult = new PeakElement().peakElement(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputIntArray = PositiveOddTestArray
    // @Ignore
    @Test
    public void testPositiveOddArray_HappyPath() {
        //arrange
        int[] inputArray = {3, 2, 7, 5, 1, 9, 23, 1, 4};
        int[] expectedResult = {};

        //act
        int[] actualResult = new PeakElement().peakElement(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputIntArray = EmptyTestArray
    // @Ignore
    @Test
    public void testEmptyArray_HappyPath() {
        //arrange
        int[] inputArray = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new PeakElement().peakElement(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
