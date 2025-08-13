package level_7.lecture_6.task_1;

/**
 * Перед тобой класс Earth - сборник переменных, описывающих определенные характеристики планеты Земля.
 * Сделай из переменных класса Earth глобальные константы. Не забудь переименовать переменные,
 * чтобы они отвечали стилю написания глобальных переменных.
 *
 * Требования:
 * Переменную name класса Earth нужно переделать в глобальную переменную.
 * Переменную square класса Earth нужно переделать в глобальную переменную.
 * Переменную population класса Earth нужно переделать в глобальную переменную.
 * Переменную equatorLength класса Earth нужно переделать в глобальную переменную.
 */
public class Solution_1 {

    public class Earth {
        public static String NAME = "Земля";
        public static final double SQUARE = 510_100_000;
        public static final long POPULATION = 7_594_000_000L;
        public static final long EQUATOR_LENGHT = 40_075_696;
    }
}
