package level_7.lecture_3.task_3;

import java.util.Scanner;

/**
 * Калькулятором, который умеет возводить число в третью степень, никого не удивишь.
 * Калькулятор, который может возвести число в девятую степень — другое дело! Так давай реализуем его!
 * Для этого создай метод public static long ninthDegree(long).
 * В качестве аргумента он должен принимать целочисленное значение типа long.
 * Метод должен возводить полученное значение в девятую степень и возвращать его как результат работы метода.
 * Школьный курс арифметики гласит: чтобы получить девятую степень, число нужно возвести в третью степень и
 * полученный результат еще раз возвести в третью степень.
 * Воспользуемся этим правилом в нашей программе.
 * В методе ninthDegree() возведи переданный аргумент в третью степень, воспользовавшись методом cube(),
 * полученный результат снова передай в метод cube(). Окончательный результат верни как результат работы метода.
 *
 * Требования:
 * Должен быть создан метод public static long ninthDegree(long).
 * Метод ninthDegree() должен возвращать результат возведения переданного ему числа в девятую степень.
 * Метод ninthDegree() должен использовать метод cube() для последовательных возведений чисел в куб.
 */
public class Solution_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long integer = scanner.nextLong();

        //1-й вариант
        System.out.println(cube(cube(integer)));

        //2-й вариант
        long newNumber = cube(integer);
        newNumber = cube(newNumber);

        System.out.println(newNumber);
    }
//    public static long ninthDegree(long value, long degree) {
//        long result = 1;
//
//        for (long i = 0; i < degree; i++) {
//            result = result * value;
//        }
//        return result;
//    }

    public static long cube(long number) {
        return number * number * number;
    }
}

/**
 * DONE
 */
