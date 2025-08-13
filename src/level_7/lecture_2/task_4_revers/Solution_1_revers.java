package level_7.lecture_2.task_4_revers;

/**
 * Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все
 * элементы массива.
 * Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
 * Метод должен работать только с массивами целочисленных значений (int[]).
 *
 * Пример:
 * Если массив содержал элементы:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
 * то после вызова метода reverseArray() должен содержать:
 * 0, 9, 8, 7, 6, 5, 4, 3, 2, 1
 *
 * Требования:
 * Метод reverseArray() должен менять порядок элементов массива на обратный.
 */

public class Solution_1_revers {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        printArray(array);
        int[] newArray = reverseArray(array);
        printArray(newArray);
    }

    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();
    }
}



