package level_9.lecture_1.task_4;

import java.util.Arrays;
import java.util.Scanner;

import static level_6_DONE.lecture_8.task_5.Solution_1.element;

/**
 * В этой задаче тебе нужно:
 *
 * Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
 * Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
 * В методе min(int[]) обязательно используй метод Math.min(int, int).
 * Требования:
 * Программа должна считывать числа с клавиатуры.
 * Класс Solution должен содержать только три метода.
 * Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив размером 10 элементов,
 * заполненный считанными числами.
 * Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int) класса Math.
 * Метод main() должен вызывать метод getArrayOfTenElements().
 * Метод main() должен вызывать метод min(int[]).
 */

public class Solution_1 { //ГОВНО НЕ ПОЛУЧАЕТСЯ


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
