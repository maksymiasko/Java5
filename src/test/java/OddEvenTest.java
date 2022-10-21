import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddEvenTest {

    //Test_1
    //inputInt = negative Odd
    @Test
    public void testOddEvenNegativeOddInput_HappyPath() {
        //arrange
        int inputInt = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = OddEven.oddEven(inputInt);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_2
    //inputInt = Zero
    @Test
    public void testOddEvenZeroInputT_HappyPath() {
        //arrange
        int inputInt = 0;
        String expectedResult = "Even";

        //act
        String actualResult = OddEven.oddEven(inputInt);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_3
    //inputInt = PositiveEven
    //@Ignore
    @Test
    public void testOddEvenPositiveEven_HappyPath() {
        //arrange
        int inputInt = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = OddEven.oddEven(inputInt);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
