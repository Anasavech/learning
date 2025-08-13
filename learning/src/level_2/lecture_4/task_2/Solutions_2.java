package level_2.lecture_4.task_2;
/*
В переменной number записано число.
В переменную lastDigit нужно записать последнюю цифру этого числа.
Для вычисления используй переменную number и оператор «остаток от деления».
Для объявления и инициализации lastDigit используй одну команду.

Подсказка: делить нужно на 10.

Требования:
Не изменяй значение переменной number.
Для вычисления lastDigit должны использоваться number и оператор «остаток от деления».
Программа должна выводить на экран значение переменной lastDigit.
 */
public class Solutions_2 {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}

/*
В условии сказано "В переменную lastDigit нужно записать последнюю цифру этого числа.", т.е. будет lastDigit = 6;
Я не понимаю, это для чего?
Решение должно выглядеть вот так?
Public class Solutions_2 {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = 6;
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}

 */

/**
 * DONE
 */