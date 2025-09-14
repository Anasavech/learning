package enums;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(Rating.THREE);
        System.out.println(student.getRating().getValue());
    }

//    public static String getInfoForRatingByStudent(Student student) {
//
//    }
}
