package level_8.lecture_1.task_5;

/**
 * В методе main() измени порядок вызова методов System.out.print() таким образом, чтобы вывод на консоль был: "Hello char".
 * Значение переменных не изменяй. В методе main() никакого кода больше не дописывай.
 *
 * Требования:
 * Программа должна выводить "Hello char" в консоли.
 * Значения переменных должны остаться прежними.
 * В методе main() не должно появиться нового кода.
 */

public class Solution_1 {
    public static char char1 = 101;
    public static char char2 = 'H';
    public static char char3 = 114;
    public static char char4 = '\u006F';
    public static char char5 = 108;
    public static char char6 = 'h';
    public static char char7 = 0x0063;
    public static char char8 = ' ';
    public static char char9 = 'l';
    public static char char10 = 0x61;

    public static void main(String[] args) {
        char letter1 = (char) char1;
        char letter2 = (char) char2;
        char letter3 = (char) char3;
        char letter4 = (char) char4;
        char letter5 = (char) char5;
        char letter6 = (char) char6;
        char letter7 = (char) char7;
        char letter8 = (char) char8;
        char letter9 = (char) char9;
        char letter10 = (char) char10;

        System.out.print(letter2);
        System.out.print(letter1);
        System.out.print(letter5);
        System.out.print(letter9);
        System.out.print(letter4);
        System.out.print(letter8);
        System.out.print(letter7);
        System.out.print(letter6);
        System.out.print(letter10);
        System.out.print(letter3);
    }
}

