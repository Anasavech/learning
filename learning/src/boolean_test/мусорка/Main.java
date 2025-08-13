package boolean_test.мусорка;

public class Main {
    public static void main(String[] args) {
        Миличка миличка = new Миличка();
        Дмитрий дмитрий = new Дмитрий();
        Мусорка мусорка = new Мусорка();

        дмитрий.выкидываюМусор(мусорка);

        миличка.наполнитьМусорка(мусорка);

        дмитрий.выкидываюМусор(мусорка);


        boolean мусоркаПолная = false;
        if (мусоркаПолная) {
            System.out.println("Полная");
        } else {
            System.out.println("Пустая");
        }

        мусоркаПолная = true;
        if (мусоркаПолная) {
            System.out.println("Полная");
        } else {
            System.out.println("Пустая");
        }
    }
}
