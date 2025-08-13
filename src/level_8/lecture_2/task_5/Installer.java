package level_8.lecture_2.task_5;

public class Installer {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public void setValue(long value) {
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
