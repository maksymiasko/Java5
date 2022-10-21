//В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
//возвращает “Odd”, если число нечетное, и “Even”, если число четное.

public class OddEven {
    public static String oddEven(int inputInt) {
        return inputInt % 2 != 0 ? "Odd": "Even";
    }
}
