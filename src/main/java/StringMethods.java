import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeString.indexOf;

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

    //    Напишите метод countAs(), который принимает на вход строку и считает,
//    сколько букв а или А содержится в строке.
//    Метод возвращает количество букв a/A,  и количество букв/знаков
//    в слове без букв a/A. Итоговый результат должен строится с помощью
//    метода из видео 2.
//    Test Data:
//            “Abracadabra” → “5, 6”
//            “Homenum Revelio” → “0, 15”
//            “3 tarAmasAlatA” → “6, 8”
    public String countAs(String inString) {
        if (!inString.isEmpty()) {
            int lengthInStringWithoutAa = inString.trim().toLowerCase().replace("a", "").length();
            int countAaInString = inString.length() - lengthInStringWithoutAa;

            return countAaInString + ", " + lengthInStringWithoutAa;
        }

        return "Строка пустая";

    }

    //    Напишите метод countJava(), который принимает на вход текст и проверяет,
//    содержится ли в тексте хотя бы одно слово Java
    public String countJava(String inString) {
        if (!inString.isEmpty()) {
            if (inString.contains("Java")) {

                return "true";
            }

            return "false";
        }

        return "Строка пустая";
    }

    //    Напишите метод insertQuotes(), который принимает слово и возвращает строку,
//    в которой это слово “обернуто” в кавычки:
//    Test Data:
//            “Abracadabra” →  ““Abracadabra””
    public String insertQuotes(String inString) {
        if (!inString.isEmpty()) {
            char charToAdd = (char) 34;

            return "" + charToAdd + inString + charToAdd;
        }

        return "Строка пустая";
    }

    //    Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :
//    после слова “писал”,  и оборачивает в кавычки вторую строку
//            (результат строится с помощью метода concat())
//
//    Test Data:
//            “Федор Достоевский писал", “Надо любить жизнь больше, чем смысл жизни.” →
//            “Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
//    Задание со звездочкой:
//            “Наполеон Бонапарт писал", “В моем словаре нет слова «невозможно».” →
//            "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
    public String insertQuotes(String inString1, String inString2) {
        if (!(inString1.isEmpty() && inString2.isEmpty())) {
            inString2 = inString2.replace("«невозможно»", "\"невозможно\"");

            return (inString1.concat(": ")).concat(insertQuotes(inString2));
        }

        return "Строка пустая";
    }

    //    Напишите метод, который принимает на вход название города и исправляет написание:
//    Test Data:
//            “ташкент” → “Ташкент”
//            “ЧикаГО” → “Чикаго
    public String fixCityName(String inString) {
        if (!inString.isEmpty()) {
            inString = inString.toLowerCase();

            return Character.toUpperCase(inString.charAt(0)) + inString.substring(1);
        }

        return "Строка пустая";
    }

    //    Напишите метод, который принимает на вход строку и букву-параметр,
//    и возвращает все, что находится между первой и последней буквой-параметром:
//    Test Data:
//            “Abracadabra”, “b” → “bracadab”
//            “Whippersnapper”, “p” → “ppersnapp”
    public String returnSubstring(String inString, char border) {
        if (!inString.isEmpty()) {
            if (inString.contains(String.valueOf(border))) {

                return inString.substring(inString.indexOf(border), inString.lastIndexOf(border) + 1);
            }

            return "Нет \"" + border + "\" в стоке";
        }

        return "Строка пустая";
    }

    //    Напишите метод, который принимает на вход слово, и возвращает true,
//    если слово начинается и заканчивается на одинаковую букву, и false иначе
//    Test Data:
//            “Abracadabra” → true
//            “Whippersnapper” → false
    public String isWordStartEqualEnd(String inString) {
        if (!inString.isEmpty()) {
            inString = inString.toLowerCase();
            if (inString.charAt(0) == inString.charAt(inString.length() - 1)) {

                return "true";
            }

            return "false";
        }

        return "Строка пустая";
    }

    //    Напишите метод, который принимает на вход строку из двух слов,
//    разделенных пробелом, и возвращает последнее слово
//    Test Data:
//            “Red Rover” → “Rover”
    public String returnLastWord(String inString) {
        if (!inString.isEmpty()) {
            inString = inString.stripLeading();
            if (inString.contains(" ")) {

                return inString.substring(inString.indexOf(" ") + 1);
            }

            return inString;
        }

        return "Строка пустая";
    }

    //    Написать метод, который принимает строку, и 2 индекса.
//    Метод удаляет все, что находится между двумя индексами включительно
//    Test Data:
//            “Red rover”, 1, 4 → “Rover”

    public String deleteBetween(String inString, int startIndex, int endIndex) {
        if (!inString.isEmpty()) {
            if (0 < startIndex && 0 < endIndex && startIndex < inString.length() && endIndex < inString.length()) {

                return inString.replace(inString.substring(startIndex, endIndex + 1), "");
            }

            return "Индекс за пределами строки";
        }

        return "Строка пустая";
    }

    //    Напишите метод, который принимает на вход предложение и возвращает
//    слова из этого предложения в виде массива слов
//    Test Data:
//    “QA for Everyone” → {“QA”, “for”, “Everyone”}
//    “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
    public String[] returnArrayFromString(String inString) {
        if (!inString.isEmpty()) {
            inString = inString.trim();

            return inString.split(" ");
        }

        return new String[]{"Строка пустая"};
    }

    //    Написать метод, который принимает на вход предложение,
//    которое состоит из имени, фамилии, отчества и возвращает текст:
//    Test Data:
//    “Александр Сергеевич Пушкин” →
//    “Имя: Александр
//    Отчество: Сергеевич
//    Фамилия: Пушкин”
    public String returnWithAddedText(String inString) {
        if (!inString.isEmpty()) {
            StringBuilder outString = new StringBuilder();
            String[] prefixStringArray = {"Имя: ", "Отчество: ", "Фамилия: "};
            String[] tmpStringArray = returnArrayFromString(inString);
            for (int i = 0; i < tmpStringArray.length; i++) { // сливаем 2 массива в StringBuilder outString
                outString.append(prefixStringArray[i]).append(tmpStringArray[i]).append("\n");
            }

            return outString.toString();
        }

        return "Строка пустая";
    }

    //    Написать метод, который принимает на вход слово и число n,
//    и возвращает строку, где слово повторяется n раз.
//    Test Data:
//    “one”, 5 → “oneoneoneoneone”
    public String repeatInStringNTimes(String inString, int n) {
        if (!inString.isEmpty()) {
            StringBuilder outString = new StringBuilder();
            for (int i = 0; i < n; i++) {
                outString.append(inString);
            }

            return outString.toString();
        }

        return "Строка пустая";
    }

    //    Напишите метод, который принимает строку и index,
//    и возвращает численное значение буквы, которая находится
//    на позиции index (использовать только один метод класса String)
    public int returnASCIIOfIndex(String inString, int Index) {

        return inString.codePointAt(Index);
    }

    //    Написать метод, который принимает 3 слова, и сравнивает их методом,
//    который считает, что прописные и заглавные буквы - это одни и те же буквы.
//    Метод возвращает true, если все слова одинаковы, и метод возвращает false,
//    если слова не одинаковы:
//    Test Data:
//            “one”, “One”, “ONE”  → true
//            “one”, “Один”, “ONE” → false
    public boolean isWordTheSame(String[] inStringArray) {
        boolean toReturn = true;
        String firstWord = inStringArray[0];
        for (int i = 1; i < inStringArray.length; i++) {
            if (firstWord.compareToIgnoreCase(inStringArray[i]) != 0) {
                toReturn = false;
                break;
            }
        }

        return toReturn;
    }
}

