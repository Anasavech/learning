package level_2.lecture_6.task_1;
//В переменную tagline нужно записать строку "JustDoIt".
//        Используй s1, s2, s3 и конкатенацию строк.
//
//        Требования:
//Не изменяй значения переменных s1, s2, s3.
//Для инициализации переменной tagline используй s1, s2, s3 и конкатенацию строк.
//Программа должна выводить на экран значение переменной tagline.

public class Solution_1 {
    public static void main(String[] args) {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2;

        System.out.println(tagline);
    }
}

/**
 * DONE
 */
