package level_7.lecture_6.task_2;

public class Worker {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void worked() {
        System.out.println("Работники работают");
    }
}
