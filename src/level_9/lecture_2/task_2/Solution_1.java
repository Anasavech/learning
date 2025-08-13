package level_9.lecture_2.task_2;

/**
 * В этой задаче тебе предстоит реализовать метод generateNumber(), 
 * который будет возвращать случайное число от 0 до 99. В методе generateNumber() используй метод Math.random().
 */

public class Solution_1 {
    
    public static int generateNumber() {
        return (int) (Math.random() * 99) + 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            int random = generateNumber();
            System.out.println(random);
        }
    }
}
