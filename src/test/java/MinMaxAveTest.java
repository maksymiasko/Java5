import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    //Test_1
    //inputIntArray = IrinaTestArray
    // @Ignore
    @Test
    public void testMinMaxAveIrinaArray_HappyPath() {
        //arrange
        int minIndex = 2;
        int maxIndex = 6;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {3, 7, 5};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_2
    //minIndex = maxIndex
    // @Ignore
    @Test
    public void testMinMaxAveSameNumberOfIndex_HappyPath() {
        //arrange
        int minIndex = 2;
        int maxIndex = 2;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {3, 3, 3};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_3
    //minIndex > maxIndex , upendIndex
    // @Ignore
    @Test
    public void testMinMaxAveUpendIndex_HappyPath() {
        //arrange
        int minIndex = 5;
        int maxIndex = 2;
        int[] inputArray = {8, 2, 3, 4, 5, 6, 7, 1};
        int[] expectedResult = {3, 6, 4};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_4
    //inputIntArray = negativePositiveValueArrayNumbers
    // @Ignore
    @Test
    public void testMinMaxAveNegativePositiveValueArrayNumbers_HappyPath() {
        //arrange
        int minIndex = 1;
        int maxIndex = 7;
        int[] inputArray = {1, -2, 3, -4, -5, 6, -7, 8};
        int[] expectedResult = {-7, 8, 0};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_5
    //outOfBoundsIndex maxIndex
    // @Ignore
    @Test
    public void testMinMaxAveOutOfBoundsMaxIndex() {
        //arrange
        int minIndex = 1;
        int maxIndex = 15;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {0, 1, 15};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_6
    //outOfBoundsIndex minIndex
    // @Ignore
    @Test
    public void testMinMaxAveOutOfBoundsMinIndex() {
        //arrange
        int minIndex = -2;
        int maxIndex = 8;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {0, -2, 8};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_7
    //minIndex+1 = maxIndex; IndexesToClose
    //@Ignore
    @Test
    public void testMinMaxAveMinIndexCloseToMaxIndex() {
        //arrange
        int minIndex = 6;
        int maxIndex = 7;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 6, 8};
        int[] expectedResult = {6, 8, 7};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_8
    //minIndex+1 = maxIndex; IndexesToCloseUpend
    //@Ignore
    @Test
    public void testMinMaxAveMinIndexCloseToMaxIndexUpend() {
        //arrange
        int minIndex = 1;
        int maxIndex = 0;
        int[] inputArray = {1, 3, 3, 4, 5, 6, 6, 8};
        int[] expectedResult = {3, 1, 2};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_9
    //AnEmptyInputArray
    //@Ignore
    @Test
    public void testMinMaxAveMinEmptyInputArray() {
        //arrange
        int minIndex = 6;
        int maxIndex = 8;
        int[] inputArray = null;
        int[] expectedResult = {-1, 6, 8};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_10
    //ToShortInputArray
    //@Ignore
    @Test
    public void testMinMaxAveToShortInputArray() {
        //arrange
        int minIndex = 6;
        int maxIndex = 8;
        int[] inputArray = {2};
        int[] expectedResult = {0, 6, 8};

        //act
        int[] actualResult = new MinMaxAve().minMaxAve(inputArray, minIndex, maxIndex);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
