package level_8.lecture_4.task_3;

import java.util.Scanner;

/**
 * Используя оператор new в методе main(), создай:
 *
 * 10 объектов типа String;
 * 5 объектов типа int[] (массивов значений int);
 * 2 объекта типа Scanner.
 * Требования:
 * В методе main() должно создаваться 10 объектов типа String.
 * В методе main() должно создаваться 5 объектов типа int[].
 * В методе main() должно создаваться 2 объекта типа Scanner.
 */

public class Solution_1 {
    public static void main(String[] args) {
        String string = new String("Странное ");
        String str = new String("задание, ");
        String line = new String("но ");
        String word = new String("я ");
        String say = new String("его ");
        String speak = new String("сделала. ");
        String tell = new String("Придумывать ");
        String name = new String("названия ");
        String variables = new String("переменных - ");
        String dull = new String("тухло.");

        int[] integer = new int[0];
        int[][] number = new int[0][1];
        int[][][] data = new int[0][2][1];
        int[][] whole = new int[0][2];
        int[] unit = new int[1];

        Scanner scanner = new Scanner(System.in);
        Scanner console = new Scanner(System.in);

        System.out.print(string);
        System.out.print(str);
        System.out.print(line);
        System.out.print(word);
        System.out.print(say);
        System.out.println(speak);
        System.out.print(tell);
        System.out.print(name);
        System.out.print(variables);
        System.out.println(dull);
    }
}
