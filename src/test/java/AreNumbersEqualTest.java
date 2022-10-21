import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

        //Test_1
        //inputInt = SamePositiveNumbers
        // @Ignore
        @Test
        public void testAreNumbersEqualSamePositiveNumbersInput_HappyPath() {
            //arrange
            int firstInt = 89;
            int secondInt = 89;
            int expectedResult = 0;

            //act
            int actualResult = new AreNumbersEqual().areNumbersEqual(firstInt, secondInt);

            //assert
            Assert.assertEquals(actualResult,expectedResult);
        }

    //Test_2
    //inputInt = firstIntNegative secondIntPositive
    // @Ignore
    @Test
    public void testAreNumbersEqualFirstIntNegativeSecondIntPositiveInput_HappyPath() {
        //arrange
        int firstInt = -89;
        int secondInt = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(firstInt, secondInt);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Test_3
    //inputInt = firstIntPositive secondIntNegative
    // @Ignore
    @Test
    public void testAreNumbersEqualFirstIntPositiveSecondIntNegativeInput_HappyPath() {
        //arrange
        int firstInt = 89;
        int secondInt = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(firstInt, secondInt);

        //assert
        Assert.assertEquals(actualResult,expectedResult);
    }
}
