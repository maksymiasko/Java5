public class StringMethods {

    //    Написать метод removeSpaces(), который принимает на вход строку.
//    Если строка не пустая (проверить методом класса String),
//    то примените метод по удалению пробелов в начале и в конце строки.
//    Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
//    Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
//    Если пробелов не было, вернуть сообщение “Пробелов не было”.
//    Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
//
//    Test Data:
//            “    Red Rover School   “ → “Лишние пробелы удалены”
//            “Red Rover School“ → “Пробелов не было”
//            “” → “Строка пустая”
    public String removeSpaces(String inString) {
        if (!inString.isEmpty()) {
            if (inString.equals(inString.trim())) {

                return "Пробелов не было";
            } else {
                inString = inString.trim();

                return "Лишние пробелы удалены";
            }
        }

        return "Строка пустая";
    }

    //    Написать алгоритм removeAllAs().
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//    Метод возвращает обработанную строку.
//    Test Data:
//            “    Red Rover School   “ →  “Red Rover School“
//            “panda   “ → “pnd”
//            “taramasalata” → “trmslt”
    public String removeAllAs(String inString) {
        if (!inString.isEmpty()) {
            inString = inString.trim();
            inString = inString.replace("a", "");
            return inString;
        }

        return "Строка пустая";
    }

    //    Написать алгоритм removeAllZeros().
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
//    состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
//    если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
//    Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
//    Test Data:
//            “3504209706040000 “ →  “35429764“
//            “0000000111“ → “111”
    public String removeAllZeros(String inString) {
        if (!inString.isEmpty()) {
            inString = inString.replace(" ", "");
            if (inString.equals(inString.replace("0", ""))) {

                return "This is a valid string";
            } else {

                return inString.replace("0", "");
            }
        }
        return "Строка пустая";
    }

    //    Написать алгоритм removeAllSpaces.
//    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    Метод возвращает обработанную строку.
//    Test Data:
//            “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//            “p a     n   d a   “ → “panda”
    public String removeAllSpaces(String inString) {
        if (!inString.isEmpty()) {
            if (!inString.equals(inString.replace(" ", ""))) {

                return inString.replace(" ", "");
            }

            return inString;
        }

        return "Строка пустая";
    }


    public static void main(String[] args) {
        String teststring = "    R e d     Ro ve    r Sc   h ool   ";
        System.out.println(new StringMethods().removeAllSpaces(teststring));

        teststring = "p a     n   d a   ";
        System.out.println(new StringMethods().removeAllSpaces(teststring));

        teststring = "";
        System.out.println(new StringMethods().removeAllSpaces(teststring));

    }
}
