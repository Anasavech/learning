package level_14.lecture_6.Solution_3_1;

import level_8.lecture_7.task_3.JavaDeveloper;

public class Main {
    public static void main(String[] args) {
        JavarushQuest[] quests = JavarushQuest.values();

        for (JavarushQuest javaQuest : quests)
            System.out.println(javaQuest + "\n");

        for (JavarushQuest javaQuestNumber : quests)
            System.out.println(javaQuestNumber.ordinal());
    }
}
