package level_8.lecture_1.task_3;

/**
 * Перед тобой 5 общеизвестных величин.
 * Перепиши их в более читаемый формат — экспоненциальный. Мантиcса должна представлять собой дробное число от 1.0 до 10.
 * После изменения формата чисел реальное значение, хранимое в переменной, не должно измениться.
 *
 * Пример:
 * 109.1678 — обычная форма;
 * 1.091678E+2 — экспонентная форма записи.
 *
 * Требования:
 * Существующим переменным должны присваиваться значения, записанные в экспонентном виде.
 * Значением мантисы должно быть дробное число от 1.0 до 10.
 * Реальное значение переменных не должно измениться.
 */

public class Solution_1 {
    static double earthDiameter = 12742.0;
    static double lightSpeed = 299792458.0;
    static double uraniumAtomicMass = 238.0289;
    static double averageBeeWeight = 0.085;
    static double javaDeveloperSalary = 10000.0;

    public static void main(String[] args) {
        System.out.printf("%E%n", earthDiameter);
        System.out.printf("%E%n", lightSpeed);
        System.out.printf("%E%n", uraniumAtomicMass);
        System.out.printf("%E%n", averageBeeWeight);
        System.out.printf("%E%n", javaDeveloperSalary);
    }
}
