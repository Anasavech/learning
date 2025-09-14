package level_14.lecture_7;

/**
 * В классе Solution есть метод getTranslationForDayOfWeek(String),
 * который возвращает перевод дня недели с русского на английский.
 * Твоя задача — переписать метод, используя только оператор if-else.
 *
 * Требования:
 * Метод getTranslationForDayOfWeek(String) должен возвращать перевод дня недели с русского на английский.
 * В методе getTranslationForDayOfWeek(String) должен использоваться только оператор if-else.
 */
public class Solution_4_2 {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en = "Недействительное значение";
        if (ru.equalsIgnoreCase("Понедельник")) return "Monday";
        else if (ru.equalsIgnoreCase("Вторник")) return "Tuesday";
        else if (ru.equalsIgnoreCase("Среда")) return "Wednesday";
        else if (ru.equalsIgnoreCase("Четверг")) return "Thersday";
        else if (ru.equalsIgnoreCase("Пятница")) return "Friday";
        else if (ru.equalsIgnoreCase("Суббота")) return "Saturday";
        else if (ru.equalsIgnoreCase("Воскресенье")) return "Sanday";
        return en;
    }
}
