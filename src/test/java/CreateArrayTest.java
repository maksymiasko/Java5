import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    //Test_1
    //inputValue = IntNumbers
    // @Ignore
    @Test
    public void testCreateIntArray_HappyPath() {
        //arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int f = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, f);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2
    //inputValue = DoubleNumbers
    // @Ignore
    @Test
    public void testCreateDoubleArray_HappyPath() {
        //arrange
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double f = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //act
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, f);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3
    //inputValue = String
    // @Ignore
    @Test
    public void testCreateStringArray_HappyPath() {
        //arrange
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String f = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, f);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4
    //inputValue = String
    // @Ignore
    @Test
    public void testCreateArrayFromText_HappyPath() {
        //arrange
        String inputString = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createArrayFromText(inputString);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
