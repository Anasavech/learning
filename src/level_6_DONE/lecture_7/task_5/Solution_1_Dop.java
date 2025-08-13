package level_6_DONE.lecture_7.task_5;

/**
 * Исправь работу метода main(String[]), который выводит в консоли true, если arrayFirst равняется arraySecond, иначе — false.
 * <p>
 * Требования:
 * Если arrayFirst равняется arraySecond, то метод main(String[]) выводит в консоли true.
 * Если arrayFirst не равняется arraySecond, то метод main(String[]) выводит в консоли false.
 */

public class Solution_1_Dop {
    public static int[][] arrayFirst = new int[][]
            {
                    {1, 2, 3, 4},   // 1 = [0][0]  2 = [0][1]  3 = [0][2]  4 = [0][3]
                    {5, 6, 7, 8},   // 5 = [1][0]  6 = [1][1]  7 = [1][2]  8 = [1][3]
                    {9, 10, 11, 12} // 9 = [2][0]  10 = [2][1]  7 = [2][2]  8 = [2][3]
            };
    public static int[][] arraySecond = new int[][]
            {
                    {1, 2, 3, 4},   // 1 = [0][0]  2 = [0][1]  3 = [0][2]  4 = [0][3]
                    {5, 6, 7, 8},   // 5 = [1][0]  6 = [1][1]  7 = [1][2]  8 = [1][3]
                    {9, 10, 11, 12},// 9 = [2][0]  10 = [2][1]  7 = [2][2]  8 = [2][3]
            };

//комментарии для меня
    public static void main(String[] args) { //объявиляем метод main
        boolean result = true;               //переменная result типа boolean, присваиваем значение true

        if (arrayFirst.length == arraySecond.length) {  //условие: если длина элементов двумерных массивов равны
            for (int i = 0; i < arrayFirst.length; i++) { //кол-во раз от 0 до конца длины двумерного массива
                if (arrayFirst[i].length != arraySecond[i].length) { //условие: если длина эл-ов у масивов не равны
                    result = false;
                    break;
                }
                for (int j = 0; j < arrayFirst[i].length; j++) { //кол-во раз от 0 до конца длины массива
                    if (arrayFirst[i][j] != arraySecond[i][j]) { //условие: если длина эл-ов у масивов и подмасивов не равны
                        result = false;
                        break;
                    }
                }
            }
        } else {
            result = false;
        }

        System.out.println(result);
    }
}

/**
 * ДОП ЗАДАНИЕ, сделать не через deepEquals()
 *
 * 1. Проверить размеры массивов
 * 2. Проверяем значения
 */

/**
 * DONE
 */
