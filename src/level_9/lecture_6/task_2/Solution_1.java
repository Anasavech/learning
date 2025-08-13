package level_9.lecture_6.task_2;

/**
 * Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
 * Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
 *
 * Требования:
 * В методе getPowerOfTwo(int) необходимо возвращать степень двойки.
 * В методе getPowerOfTwo(int) должен использоваться оператор побитового сдвига влево.
 */

public class Solution_1 {
    
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(2));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        int i = result << power;
        return i;
    }
}
