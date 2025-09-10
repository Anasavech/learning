package level_14.lecture_7;

/**
 * В классе Solution есть метод getMonthByIndex(int), который возвращает название месяца по его номеру,
 * начиная с 1. Твоя задача — переписать метод, используя только оператор switch и ключевые слова case, break и default.
 *
 * Требования:
 * Метод getMonthByIndex(int) должен возвращать имя месяца по его номеру.
 * В методе getMonthByIndex(int) должен использоваться только оператор множественного выбора switch.
 */
public class Solution_4_1 {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString = "-";
        switch (monthIndex) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        return monthString;
    }
}
