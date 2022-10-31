import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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
    public void testStringMethodsRemoveSpacesInStringEmpty_HappyPath() {
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
    public void testStringMethodsRemoveAllAsInStringEmpty_HappyPath() {
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
    public void testStringMethodsRemoveAllZerosInStringEmpty_HappyPath() {
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
    public void testStringMethodsRemoveAllSpacesInStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllSpaces(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_14 inString -> inString with "Aa"
    // @Ignore
    @Test
    public void testStringMethodsCountAsInStringWithAa_HappyPath() {
        String teststring = "Abracadabra";

        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_15 inString -> inString with " " and without "Aa"
    //@Ignore
    @Test
    public void testStringMethodsCountAsInStringWithSpaceNoAa_HappyPath() {
        String teststring = "Homenum Revelio";

        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_16 inString -> inString with " " and without "Aa"
    //@Ignore
    @Test
    public void testStringMethodsCountAsInStringWithSpaceAndAa_HappyPath() {
        String teststring = "3 tarAmasAlatA";

        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_17 inString -> emptyString
    //@Ignore
    @Test
    public void testStringMethodsCountAsInStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().countAs(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_18 inString -> inString with "Java"
    //@Ignore
    @Test
    public void testStringMethodsCountJavaInStringWithJava_HappyPath() {
        String teststring = "As of March 2022, Java 18 is the latest version, " +
                "while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial use, " +
                "although it will otherwise still support Java 8 with public " +
                "updates for personal use indefinitely. Other vendors have begun " +
                "to offer zero-cost builds of OpenJDK 8 and 11 that are " +
                "still receiving security and other upgrade";

        String expectedResult = "true";
        String actualResult = new StringMethods().countJava(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_19 inString -> inString without "Java"
    //@Ignore
    @Test
    public void testStringMethodsCountJavaInStringWithoutJava_HappyPath() {
        String teststring = "99 little bugs in a code. " +
                "99 little bugs in a code." +
                "Take one down, and patch it around." +
                "235 critical bugs in the code.";

        String expectedResult = "false";
        String actualResult = new StringMethods().countJava(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_20 inString -> emptyString
    //@Ignore
    @Test
    public void testStringMethodsCountJavaInStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().countJava(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_21 inString -> inString anyString
    //@Ignore
    @Test
    public void testStringMethodsInsertQuotes_HappyPath() {
        String teststring = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_22 inString -> emptyString
    //@Ignore
    @Test
    public void testStringMethodsInsertQuotesStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().insertQuotes(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_23 inStrings -> inStrings anyStrings
    //@Ignore
    @Test
    public void testStringMethodsInsertQuotesTwoStrings_HappyPath() {
        String teststring1 = "Федор Достоевский писал";
        String teststring2 = "Надо любить жизнь больше, чем смысл жизни.";

        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";
        String actualResult = new StringMethods().insertQuotes(teststring1, teststring2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_24 inStrings -> inStrings anyStrings
    //@Ignore
    @Test
    public void testStringMethodsInsertQuotesTwoStringsQuotesChange_HappyPath() {
        String teststring1 = "Наполеон Бонапарт писал";
        String teststring2 = "В моем словаре нет слова «невозможно».";

        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";
        String actualResult = new StringMethods().insertQuotes(teststring1, teststring2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_25 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsInsertQuotesTwoStringsEmpty_HappyPath() {
        String teststring1 = "";
        String teststring2 = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().insertQuotes(teststring1, teststring2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_26 inString -> inString
    //@Ignore
    @Test
    public void testStringMethodsFixCityName_HappyPath() {
        String teststring = "ташкЕнт";

        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().fixCityName(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_24 inString -> inString
    //@Ignore
    @Test
    public void testStringMethodsFixCityName1_HappyPath() {
        String teststring = "ЧикаГО";

        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().fixCityName(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_25 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsFixCityNameStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().fixCityName(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_26 inString -> anyString
    // @Ignore
    @Test
    public void testStringMethodsReturnSubstring_HappyPath() {
        String teststring = "Abracadabra";
        char border = 'b';

        String expectedResult = "bracadab";
        String actualResult = new StringMethods().returnSubstring(teststring, border);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_27 inString -> anyString
    // @Ignore
    @Test
    public void testStringMethodsReturnSubstring1_HappyPath() {
        String teststring = "Whippersnapper";
        char border = 'p';

        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().returnSubstring(teststring, border);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_28 inString -> anyString without border char
    // @Ignore
    @Test
    public void testStringMethodsReturnSubstringNoFound_HappyPath() {
        String teststring = "Whippersnapper";
        char border = 'k';

        String expectedResult = "Нет \"k\" в стоке";
        String actualResult = new StringMethods().returnSubstring(teststring, border);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_29 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsReturnSubstringStringEmpty_HappyPath() {
        String teststring = "";
        char border = 'k';

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().returnSubstring(teststring, border);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_30 inString -> StringStart==StringEnd
    // @Ignore
    @Test
    public void testStringMethodsIsWordStartEqualEndYes_HappyPath() {
        String teststring = "Abracadabra";

        String expectedResult = "true";
        String actualResult = new StringMethods().isWordStartEqualEnd(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_31 inString -> StringStart!=StringEnd
    // @Ignore
    @Test
    public void testStringMethodsIsWordStartEqualEndNo_HappyPath() {
        String teststring = "Whippersnapper";

        String expectedResult = "false";
        String actualResult = new StringMethods().isWordStartEqualEnd(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_32 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsIsWordStartEqualEndStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().isWordStartEqualEnd(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_33 inString -> TwoWordString
    // @Ignore
    @Test
    public void testStringMethodsReturnLastWordTwoWordString_HappyPath() {
        String teststring = "Red Rover";

        String expectedResult = "Rover";
        String actualResult = new StringMethods().returnLastWord(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_34 inString -> OneWordString
    // @Ignore
    @Test
    public void testStringMethodsReturnLastWordOneWordString_HappyPath() {
        String teststring = " Rover";

        String expectedResult = "Rover";
        String actualResult = new StringMethods().returnLastWord(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_35 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsReturnLastWordStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().returnLastWord(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_36 inString -> testString
    // @Ignore
    @Test
    public void testStringMethodsDeleteBetween_HappyPath() {
        String teststring = "Red rover";
        int startindex = 1;
        int endindex = 4;

        String expectedResult = "Rover";
        String actualResult = new StringMethods().deleteBetween(teststring, startindex, endindex);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_37 inString -> testString, IndexOutOfBound
    // @Ignore
    @Test
    public void testStringMethodsDeleteBetweenIndexOutOfBound_HappyPath() {
        String teststring = "Red rover";
        int startindex = 1;
        int endindex = 10;

        String expectedResult = "Индекс за пределами строки";
        String actualResult = new StringMethods().deleteBetween(teststring, startindex, endindex);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_38 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsDeleteBetweenStringEmpty_HappyPath() {
        String teststring = "";
        int startindex = 1;
        int endindex = 1;

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().deleteBetween(teststring, startindex, endindex);
        Assert.assertEquals(actualResult, expectedResult);
    }


    //Test_39 inString -> testString
    // @Ignore
    @Test
    public void testStringMethodsReturnArrayFromString_HappyPath() {
        String teststring = "QA for Everyone";

        String[] expectedResult = {"QA", "for", "Everyone"};
        String[] actualResult = new StringMethods().returnArrayFromString(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_40 inString -> testString
    // @Ignore
    @Test
    public void testStringMethodsReturnArrayFromString1_HappyPath() {
        String teststring = "Александр Сергеевич Пушкин";

        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
        String[] actualResult = (new StringMethods().returnArrayFromString(teststring));
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_41 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsReturnArrayFromStringStringEmpty_HappyPath() {
        String teststring = "";

        String[] expectedResult = {"Строка пустая"};
        String[] actualResult = (new StringMethods().returnArrayFromString(teststring));
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_42 inString -> testString
    // @Ignore
    @Test
    public void testStringMethodsReturnWithAddedText_HappyPath() {
        String teststring = "Александр Сергеевич Пушкин";

        String expectedResult ="Имя: Александр\n" +
                                "Отчество: Сергеевич\n" +
                                "Фамилия: Пушкин\n";
        String actualResult = new StringMethods().returnWithAddedText(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_43 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsReturnWithAddedTextStringEmpty_HappyPath() {
        String teststring = "";

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().returnWithAddedText(teststring);
        Assert.assertEquals(actualResult, expectedResult);
    }


    //Test_44 inString -> testString
    // @Ignore
    @Test
    public void testStringMethodsRepeatInStringNTimes_HappyPath() {
        String teststring = "one";
        int timesToRepeat = 5;

        String expectedResult ="oneoneoneoneone";
        String actualResult = new StringMethods().repeatInStringNTimes(teststring, timesToRepeat);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_45 inStrings -> emptyStrings
    //@Ignore
    @Test
    public void testStringMethodsRepeatInStringNTimesStringEmpty_HappyPath() {
        String teststring = "";
        int timesToRepeat = 5;

        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().repeatInStringNTimes(teststring, timesToRepeat);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Test_46 inStrings -> testString
    //@Ignore
    @Test
    public void testStringMethodsReturnASCIIOfIndex_HappyPath() {
        String teststring = "one";
        int index = 0;

        int expectedResult = 111;
        int actualResult = new StringMethods().returnASCIIOfIndex(teststring, index);
        Assert.assertEquals (actualResult, expectedResult);
    }

    //Test_47 inStrings -> testString
    //@Ignore
    @Test
    public void testStringMethodsIsWordTheSame_HappyPath() {
        String[] testArrayOfStrings = {"one", "One", "ONE"};

        boolean expectedResult = true;
        boolean actualResult = new StringMethods().isWordTheSame(testArrayOfStrings);
        Assert.assertEquals (actualResult, expectedResult);
    }

    //Test_48 inStrings -> testString
    //@Ignore
    @Test
    public void testStringMethodsIsWordTheSame1_HappyPath() {
        String[] testArrayOfStrings = {"one", "Один", "ONE"};

        boolean expectedResult = false;
        boolean actualResult = new StringMethods().isWordTheSame(testArrayOfStrings);
        Assert.assertEquals (actualResult, expectedResult);
    }

}
