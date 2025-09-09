package level_14.lecture_6.Solution_2_1;

/**
 * Нужно создать набор значений (enum) для времен года.
 * Для этого нужно в отдельном файле создать enum Season и объявить в нем 4 значения.
 * В методе Solution выведи все перечисления с новой строки.
 * <p>
 * Требования:
 * В отдельном файле создай публичный enum Season и добавь значения: WINTER, SPRING, SUMMER, AUTUMN.
 * В классе Solution выведи в консоли каждый сезон с новой строки. Используй перечисления напрямую: например, Season.WINTER.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }
}
