package generics;

public abstract class Human {

    private int ageOld;
    private String name;

    public Human(int ageOld, String name) {
        this.ageOld = ageOld;
        this.name = name;
    }

    public int getAgeOld() {
        return ageOld;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Я поел");
    }
}
