package level_6_DONE.lecture_6.task_3;

/**
 * В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.
 * <p>
 * Требования:
 * В классе Solution должна быть публичная статическая переменная multiArray типа int[][][].
 * В методе main(String[]) выведи на экран все числа из multiArray.
 */
public class Solution_1 {
    public static int[][][] multiArray = new int[][][]
            {
                    {
                            {4, 8, 15}, // 4 = [0][0][0] 8 = [0][0][1] 15 = [0][0][2]
                            {16}  // 16 = [0][1][0]
                    },
                    {
                            {23, 42}, // 23 = [1][0][0] 42 = [1][0][1]
                            {} // [1][1][0]
                    },
                    {
                            {1}, // 1 = [2][0][0]
                            {2}, // 2 = [2][1][0]
                            {3}, // 3 = [2][2][0]
                            {4, 5} // 4 = [2][3][0] 5 = [2][3][1]
                    }
            };
    // i = 2
    // 1 случай: q -- i = 0 && q = 1
    // 2 случай: q -- i = 1 && q = 1
    // 3 случай: q -- i = 2 && q = 3

    // 4 8 15 16 23 42


    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int q = 0; q < multiArray[i].length; q++) {
                for (int k = 0; k < multiArray[i][q].length; k++) {
                    System.out.print(multiArray[i][q][k] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
    }

    public Object[][] get() {
        return new Object[][] {
                {"Привет", "Как дела"}, //"Привет" = [0][0]
                {"Клиент", "Не прав"}
        };
    }
}

/**
 * DONE
 */


