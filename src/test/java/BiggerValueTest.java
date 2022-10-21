import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    //Test_1
    //inputIntValue = PositiveNumbers
    // @Ignore
    @Test
    public void testBiggerValuePositiveNumbers_HappyPath() {
        //arrange
        int firstValue = 3333;
        int secondValue = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(firstValue,secondValue);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
