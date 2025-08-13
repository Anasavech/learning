package level_1.lecture_2.task_1;

public class Main {

    public static void main(String[] args) {
        RezeptPiroga pirog = new RezeptPiroga();

        pirog.сахар = 200;
        pirog.мука = 2;

        pirog.посоли();
        pirog.замешай();

        RezeptPiroga pirogСВишней = new RezeptPiroga();

        pirogСВишней.сахар = 600;
        pirogСВишней.мука = 5;

        pirogСВишней.посоли();
        pirogСВишней.замешай();
    }
}
