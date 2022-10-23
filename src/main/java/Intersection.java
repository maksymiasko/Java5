//Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
//        и возвращает массив общих элементов
public class Intersection {

    public int[]intersection(int[] firstArray,int[] secondArray) {

        return  new Utils().removeDuplicatesFromArray(new Utils().bubbleSortArray
                (new Utils().buildIntersectionsOfTwoArrays(firstArray, secondArray)));
    }
}





