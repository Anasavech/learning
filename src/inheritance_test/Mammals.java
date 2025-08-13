package inheritance_test;

public class Mammals {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    protected void кормитьМолоком() {
        System.out.println(this.name + "Я покормил");
    }
}
