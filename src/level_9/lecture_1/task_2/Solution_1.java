package level_9.lecture_1.task_2;

/**
 * Исправь методы класса Solution, используя класс Math:
 *
 * sqrt(double) — должен возвращать квадратный корень переданного аргумента.
 * cbrt(double) — должен возвращать кубический корень переданного аргумента.
 * pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
 * Требования:
 * Реализуй метод sqrt(double) согласно условию.
 * Реализуй метод cbrt(double) согласно условию.
 * Реализуй метод pow(int, int) согласно условию.
 */
public class Solution_1 {
    public static double sqrt = 6;
    public static double cbrt = 50;
    public static int pow1 = 2;
    public static int pow2 = 3;

    public static double sqrt() {
        return Math.sqrt(sqrt);
    }

    public static double cbrt() {
        return Math.cbrt(cbrt);
    }

    public static double pow() {
        return Math.pow(pow1, pow2);
    }

    public static void main(String[] args) {
        System.out.println(sqrt());
        System.out.println(cbrt());
        System.out.println(pow());
    }
}
