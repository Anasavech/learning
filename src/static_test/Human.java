package static_test;

public class Human {
    public final static int MAX_OLD_AGE = 100;
    public final int maxOldAge = 100;

    public static void itCameFromTheMonkey() {
        System.out.println("Люди произошли от обезьяны");
    }

    private String name;
    private int age;

    void eat() {
        System.out.println("Я поел");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else {
            this.age = age;
        }
    }

    String surname;
    public String publicSurname;
    private String privateSurname;
}
