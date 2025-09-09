package level_14.lecture_5.Solution_3_1;

import org.w3c.dom.Node;

/**
 * Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь,
 * как работает двусвязный список и сможешь добавлять в него элементы. У тебя есть класс StringLinkedList,
 * в котором есть поля first и last, указывающие на первый и последний элемент соответственно.
 * Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.
 * <p>
 * Подсказки:
 * <p>
 * Для правильной реализации важно понимать, что по списку можно проходить как с первого элемента до последнего,
 * так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки рядом стоящих.
 * Метод add должен создавать новый объект класса Node, в который он поместит переданное значение. Перед тем
 * как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную, а новосозданная станет последней.
 * Если в списке один элемент, то на него указывает first.next и last.prev одновременно.
 * Метод printAll создан для debug и в проверке не участвует.
 * Важно:
 * Node first не должна иметь значение, она указывает только на первый элемент(first.next);
 * Node last также не содержит значения, а только указывает на последний элемент(last.prev).
 * <p>
 * Требования:
 * При добавлении нового элемента предыдущие элементы должны получать на него ссылку.
 * При добавлении нового элемента он должен получать ссылку на предыдущий.
 * Поле first класса StringLinkedList должно всегда ссылаться на первый элемент, не содержать значение (value) и
 * ссылку на предыдущий элемент (prev).
 * Поле last класса StringLinkedList должно всегда ссылаться на последний элемент, не содержать значение (value) и
 * ссылку на следующий элемент (next).
 */
public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        if (first.next == null || last.prev == null) {
            Node current = new Node(first, value, last);
            first.next = current;
            last.prev = current;
            return;
        }
        Node currentElement = new Node(last.prev, value, last);
        last.prev.next = currentElement;
        last.prev = currentElement;

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        Node() {
        }

        Node(Node prev, String value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}
