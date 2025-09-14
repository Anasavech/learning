package enums;

public class Test {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        switch (countOfCorner) {
            case 3:
                return "Треугольник";
            case 4:
                return "Четырехугольник";
            case 5:
                return "Пятиугольник";
            case 6:
                return "Шестиугольник";
            default:
                return "Другая фигура";
        }
    }

    public static String getShapeNameByCountOfCornersShort(int countOfCorner) {
        return switch (countOfCorner) {
            case 3 -> "Треугольник";
            case 4 -> "Четырехугольник";
            case 5 -> "Пятиугольник";
            case 6 -> "Шестиугольник";
            default -> "Другая фигура";
        };
    }
}
