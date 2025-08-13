package level_8.lecture_7.task_2;

import static java.util.Arrays.deepToString;

/**
 * Правильно унаследуй классы:
 *
 * машину — от транспортного средства;
 * электрокар — от машины.
 * Удали дублирующиеся переменные.
 * Требования:
 * Класс Car должен наследоваться от класса Vehicle.
 * Класс ElectricCar должен наследоваться от класса Car.
 * Дублирующих переменных не должно быть.
 */

public class ElectricCar extends Car{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        int weels = vehicle.wheels;
        int hood = vehicle.hood;

        Car car = new Car();
        String colorCar = car.colorCar;

        System.out.print("У электромобиля есть: " + weels + " двери, ");
        System.out.println(hood + " багажник");
        System.out.println("Цвет машины: " + colorCar);
    }
}
