package enums;

public enum Rating {
    ONE ("Один"),
    TWO ("Два"),
    THREE ("Три"),
    FOUR ("Четыре"),
    FIVE ("Пять");

    private final String value;

    Rating(String rating) {
        this.value = rating;
    }

    public String getValue() {
        return value;
    }
}
