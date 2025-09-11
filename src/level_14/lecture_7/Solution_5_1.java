package level_14.lecture_7;

/**
 * В классе Solution есть метод getShapeNameByCountOfCorners(int),
 * который возвращает название многоугольника в зависимости от количества углов.
 * Твоя задача — переписать метод, используя только оператор switch.
 *
 * Требования:
 * Результат работы метода getShapeNameByCountOfCorners(int) не должен измениться.
 * В методе getShapeNameByCountOfCorners(int) должен использоваться только оператор switch.
 */
public class Solution_5_1 {
    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape = "-";
        switch (countOfCorner) {
            case 3:
                System.out.println("Треугольник");
                break;
            case 4:
                System.out.println("Четырехугольник");
                break;
            case 5:
                System.out.println("Пятиугольник");
                break;
            case 6:
                System.out.println("Шестиугольник");
                break;
            default:
                System.out.println("Другая фигура");
        }
        return shape;
    }
}
