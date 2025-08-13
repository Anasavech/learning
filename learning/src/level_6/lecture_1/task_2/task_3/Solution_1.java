package level_6_DONE.lecture_1.task_2.task_3;
/*
В методе main(String[]) тебе нужно заполнить массив strings значениями.
Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
Вывод текста в консоль в тестировании не участвует.

Требования:
В классе Solution должна быть публичная статическая переменная strings типа String[],
проинициализированная массивом размером 5 элементов.
Метод main(String[]) должен заполнять массив согласно условию.
 */

public class Solution_1 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i <= strings.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Индекс " + i + " = " + EVEN);
            } else {
                System.out.println("Индекс " + i + " = " + ODD);
            }
        }
    }
}

/**
 * DONE
 */

