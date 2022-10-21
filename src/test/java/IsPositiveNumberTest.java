import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    //Test_1
    //inputInt = PositiveNumber
    // @Ignore
    @Test
    public void testIsPositiveNumberPositiveInput_HappyPath() {
        //arrange
        int inputInt = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(inputInt);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputInt = Zero
    // @Ignore
    @Test
    public void testIsPositiveNumberZeroInput_HappyPath() {
        //arrange
        int inputInt = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(inputInt);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputInt = NegativeNumber
    // @Ignore
    @Test
    public void testIsPositiveNumberNegativeInput_HappyPath() {
        //arrange
        int inputInt = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(inputInt);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
