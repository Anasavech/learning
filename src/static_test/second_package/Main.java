package static_test.second_package;

import static_test.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        int maxOldAge = Human.MAX_OLD_AGE;
        Human.itCameFromTheMonkey();
    }
}
