//Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение

public class BiggerValue {

    public int biggerValue(int firstValue, int secondValue) {
        //return Math.max(firstValue, secondValue);
        return firstValue >= secondValue ? firstValue : secondValue;
    }

}
