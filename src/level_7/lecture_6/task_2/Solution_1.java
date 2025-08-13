package level_7.lecture_6.task_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Перед тобой — цифровая учетная карточка работника. В ней указано его имя, должность и зарплата.
 * Имя работника вряд ли поменяется, а вот должность и зарплата могут.
 * Такие изменения вносятся с помощью методов setPosition() и setSalary(). Правда, сейчас они неправильно работают.
 * Разберись, в чем причина и исправь баги. При этом ни имена переменных класса, ни имена параметров методов изменять нельзя.
 *
 * Требования:
 * Метод setPosition() должен устанавливать полученное значение переменной класса position.
 * Метод setSalary() должен устанавливать полученное значение переменной класса salary.
 * Изменять имена переменных класса нельзя.
 * Изменять имена параметров методов нельзя.
 */

public class Solution_1 {

    public static void main(String[] args) {

        Worker worker = new Worker();

        worker.setPosition("QA");
        worker.setSalary(50_000);

        System.out.println(worker.name);
        System.out.println(worker.position);
        System.out.println(worker.salary);

    }
}


