package level_6_DONE.lecture_8.task_5;

import java.util.Arrays;

/**
 * Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится в переданном массиве, иначе — false.
 * Массив array не должен изменять расположение своих элементов.
 * <p>
 * Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать, используй статический метод
 * Arrays.binarySearch(int[], int) класса Arrays. Первым параметром нужно передать отсортированный массив,
 * в котором выполнить поиск, вторым параметром — искомый элемент.
 * Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.
 * <p>
 * Для сортировки массива можно использовать метод Arrays.sort(int[]).
 * При тестировании значения переменных класса Solution будут разными.
 * <p>
 * Требования:
 * В методе main(String[]) не изменяй расположение элементов массива array. //
 * При вызове метода main(String[]) вывести в консоли true, если значение переменной element содержится в массиве.
 * При вызове метода main(String[]) вывести в консоли false, если переданный элемент не содержится в массиве.
 * В методе main(String[]) используй вызов метода Arrays.binarySearch(int[], int).
 */
public class Solution_1 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 12;

    public static void main(String[] args) {
        Arrays.sort(array);
        boolean isContains = false;
        while (!isContains) {
            int middleIndex = array.length / 2;

            if (array.length == 1 && element != array[middleIndex]) {
                break;
            }

            if (array[middleIndex] == element) {
                isContains = true;
                break;
            }
            else if (element > middleIndex) {
                array = Arrays.copyOfRange(array, middleIndex, array.length);
            } else {
                array = Arrays.copyOfRange(array, 0, middleIndex);
            }
        }

        System.out.println(isContains);


//        int[] arrayCopy = Arrays.copyOf(array, 9); // копия массива array
//        Arrays.sort(arrayCopy);                    //сортировка массива по возрастанию
//
//        int result = -1;
//        int left = 0;
//        int right = arrayCopy.length - 1;
//
//       while (left <= right) {
//
//           int midd = (left + right) / 2;
//           if (arrayCopy[midd] == element) {
//               result = arrayCopy[midd];
//               System.out.println(result);
//               break;
//           } else if (arrayCopy[midd] < element) {
//               right = element - 1;
//           } else if (arrayCopy[midd] > element) {
//               left = element + 1;
//           }
//
//           if (result == -1) {
//               System.out.println(result);
//           } else {
//               System.out.println(result);
//           }
//       }
    }
}


/**
 * ДОП ЗАДАНИЕ:
 * <p>
 * не используй binarySearch()
 */

/**
 * DONE
 */
