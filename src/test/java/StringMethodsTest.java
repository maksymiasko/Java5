import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //Test_1 inString with " "
    // @Ignore
    @Test
    public void testStringMethodsRemoveSpacesSpacesInString_HappyPath() {
        String teststring = " Red Rover School ";

        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_2 inString without " "
    // @Ignore
    @Test
    public void testStringMethodsRemoveSpacesSpacesNotInString_HappyPath() {
        String teststring = "Red Rover School";

        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_3 inString -> emptyString
    // @Ignore
    @Test
    public void testStringMethodsRemoveSpacesEmptyString_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_4 inString -> inString with " "
    // @Ignore
    @Test
    public void testStringMethodsremoveAllAsEmptyStringSpacesInString_HappyPath() {
        String teststring = " Red Rover School ";

        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_5 inString -> inString with "a" and " " at the end
    // @Ignore
    @Test
    public void testStringMethodsremoveAllAsEmptyStringSpacesInEndOfStringAndPresentA_HappyPath() {
        String teststring = "panda  ";

        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_6 inString -> inString with "a"
    // @Ignore
    @Test
    public void testStringMethodsremoveAllAIfPresent_HappyPath() {
        String teststring = "taramasalata";

        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_7 inString -> emptyString
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllAsEmptyString_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_8 inString -> inString with "0"
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllZerosAndSpacesIfPresent_HappyPath() {
        String teststring = "3504209706040000  ";

        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_9 inString -> inString with "0"
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllZerosIfPresent_HappyPath() {
        String teststring = "0000000111";

        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_10 inString -> emptyString
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllZerosEmptyString_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllZeros(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_11 inString -> inString with " "
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllSpacesSpacesIfPresent_HappyPath() {
        String teststring = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_12 inString -> inString with " "
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllSpacesSpacesIfPresent1_HappyPath() {
        String teststring = "p a     n   d a   ";

        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_13 inString -> emptyString
    // @Ignore
    @Test
    public void testStringMethodsRemoveAllSpacesEmptyString_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
