package level_14.lecture_7;

import java.util.Arrays;

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
        getMonthByIndex();
    }

    enum MonthOfYear {
        JUNARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }

    public static void getMonthByIndex() {
        MonthOfYear[] allMonths = new MonthOfYear[] {MonthOfYear.values()[2]};
        MonthOfYear[] all = new MonthOfYear[] {MonthOfYear.values()[7]};
        System.out.println(Arrays.toString(allMonths));
        System.out.println(Arrays.toString(all));
    }
}