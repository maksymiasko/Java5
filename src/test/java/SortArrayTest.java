import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    //Test_1
    //inputIntArray = PositiveTestArray
    // @Ignore
    @Test
    public void testSortPositiveArray_HappyPath() {
        //arrange
        int[] inputArray = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = new Utils().bubbleSortArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputIntArray = NegativeTestArray
    // @Ignore
    @Test
    public void testSortNegativeArray_HappyPath() {
        //arrange
        int[] inputArray = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-12, -12, -9, -7, -5, -4, -4, -3, -2};

        //act
        int[] actualResult = new Utils().bubbleSortArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputIntArray = TestEmptyArray
    // @Ignore
    @Test
    public void testSortEmptyArray_HappyPath() {
        //arrange
        int[] inputArray = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new Utils().bubbleSortArray(inputArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
