//Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
//        0, если числа равны
//        -1, если первое число меньше второго
//        1, если первое число больше второго

public class AreNumbersEqual {

    public int areNumbersEqual(int firstInt, int secondInt) {
        if (firstInt == secondInt) {

            return 0;
        }

        return firstInt < secondInt ? -1 : 1;
    }
}
