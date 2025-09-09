package level_14.lecture_5.Solution_5_1;

/**
 * Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
 * Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int),
 * который вернет строку под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
 * Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.
 *
 * Требования:
 * Метод get(int index) должен возвращать элемент, который находится под индексом index в списке.
 */
public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        Node node = first.next;

        for (int i = 1; i <= index; i++) {
            node = node.next;
            if (node.next == null){
                node.value = null;
                break;
            }
        }
        return node.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
