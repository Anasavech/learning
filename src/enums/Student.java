package enums;

public class Student {
    public Rating getRating() {
        return rating;
    }

    private final Rating rating;

    public Student(Rating rating) {
        this.rating = rating;
    }
}
