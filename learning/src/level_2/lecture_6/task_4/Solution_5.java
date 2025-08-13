package level_2.lecture_6.task_4;

/**
 * В методе main на экран выводятся значения трех строк.
 * Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.
 *
 * Требования:
 * Не изменяй значение переменной emptyString.
 * У трех строк, переданных в метод println, нужно вызвать метод length.
 * Программа должна вывести на экран три числа, каждое - с новой строки.
 */

public class Solution_5 {
    public static void main(String[] args) {
        String emptyString = "";

        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());

//        1) "" + 2 = "2";
//        2) "2" + 2 = "22";
//        3) "22" + "22" = "2222";
    }
}

/**
 * DONE
 */




