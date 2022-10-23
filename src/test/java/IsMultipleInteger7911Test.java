import org.testng.Assert;
import org.testng.annotations.Test;

public class IsMultipleInteger7911Test {

    //Test_1
    //inputIntM = 63 is divided by 7 and 9
    // @Ignore
    @Test
    public void testIsIsMultipleInteger7And9_HappyPath() {
        //arrange
        int inputIntM = 63;
        String expectedResult = "Good Number";

        //act
        String actualResult = new IsMultipleInteger7911().ismultipleinteger7911(inputIntM);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputIntM = 9 is divided by 9 and NOT by 7
    // @Ignore
    @Test
    public void testIsIsMultipleInteger9AndNot7_HappyPath() {
        //arrange
        int inputIntM = 9;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new IsMultipleInteger7911().ismultipleinteger7911(inputIntM);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputIntM = 110 is divided by 11 and NOT by 7 or 9
    // @Ignore
    @Test
    public void testIsIsMultipleInteger11_HappyPath() {
        //arrange
        int inputIntM = 110;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new IsMultipleInteger7911().ismultipleinteger7911(inputIntM);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputIntM = 1 is NOT divided by 11 and 7 and 9
    // @Ignore
    @Test
    public void testIsIsMultipleIntegerDefault_HappyPath() {
        //arrange
        int inputIntM = 1;
        String expectedResult = "-1";

        //act
        String actualResult = new IsMultipleInteger7911().ismultipleinteger7911(inputIntM);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
