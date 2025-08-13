package level_9.lecture_1.task_1;

/**
 * Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно,
 * полученного как параметр. Угол задан в градусах.
 * В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.
 *
 * Требования:
 * Реализуй метод sin(double) согласно условию.
 * Реализуй метод cos(double) согласно условию.
 * Реализуй метод tan(double) согласно условию.
 */
public class Solution_1 {
    public static double sin = 30;
    public static double cos = 40;
    public static double tan = 50;

    public static double sin() {
        return Math.sin(Math.toRadians(sin));
    }

    public static double cos() {
        return Math.cos(Math.toRadians(cos));
    }

    public static double tan() {
        return Math.tan(Math.toRadians(tan));
    }

    public static void main(String[] args) {
        System.out.println(sin());
        System.out.println(cos());
        System.out.println(tan());
    }
}
