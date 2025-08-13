package level_9.lecture_4.task_2;

import java.util.concurrent.TimeUnit;

/**
 * В классе Solution реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время,
 * используя соответствующие методы java.util.concurrent.TimeUnit.
 *
 * Требования:
 * Метод setTimer(int, int, int, int, int) должен быть реализован согласно условию.
 */

public class task_4 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(setTimer(0, 0, 0, 10, 10));
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }

    public static int setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");

        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);

        return days; //как написать код без retern?, нам не надо чтобы возвращался день
    }
}
