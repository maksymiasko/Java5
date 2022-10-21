import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class OddIndicesTest {

    //Test_1
    //inputIntArray = validInputNumbersArrayEvenLength
   // @Ignore
    @Test
    public void testOddIndicesTestValidArrayEvenLength_HappyPath() {
        //arrange
        int[] inputIntArray = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(inputIntArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_2
    //inputIntArray = validInputNumbersArrayOddLength
   // @Ignore
    @Test
    public void testOddIndicesTestValidArrayOddLength_HappyPath() {
        //arrange
        int[] inputIntArray = {-45, 590, 234, 985, 12, 68, 75};
        int[] expectedResult = new int[]{590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(inputIntArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_3
    //inputIntArray = validInputNumbersArrayZeroLength
    //inputIntArray.length !> 1
    //@Ignore
    @Test
    public void validInputNumbersArrayZeroLength_HappyPath() {
        //arrange
        int[] inputIntArray = {2};
        int[] expectedResult = new int[]{};

        //act
        int[] actualResult = new OddIndices().oddIndices(inputIntArray);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
