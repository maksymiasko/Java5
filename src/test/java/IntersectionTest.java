import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    //Test_1
    //inputIntArray = PositiveTestArray
    // @Ignore
    @Test
    public void testIntersectionPositiveValue_HappyPath() {
        //arrange
        int[] firstArray = {1, 2, 4, 5, 89, 2};
        int[] secondArray = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        //act
        int[] actualResult = new Intersection().intersection(firstArray, secondArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputIntArray = MixValueTestArray
    // @Ignore
    @Test
    public void testIntersectionMixValue_HappyPath() {
        //arrange
        int[] firstArray = {1, 2, 4, 5, 8, 9};
        int[] secondArray = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        //act
        int[] actualResult = new Intersection().intersection(firstArray, secondArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputIntArray = NothingToCompareValueTestArray
    // @Ignore
    @Test
    public void testNothingToCompareValue_HappyPath() {
        //arrange
        int[] firstArray = {1, 2, 4, 5, 89};
        int[] secondArray = {8, 9, 45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new Intersection().intersection(firstArray, secondArray);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputIntArray = EmptyArraysToCompare
    // @Ignore
    @Test
    public void testEmptyArraysToCompare() {
        //arrange
        int[] firstArray = {};
        int[] secondArray = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new Intersection().intersection(firstArray, secondArray);;

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
