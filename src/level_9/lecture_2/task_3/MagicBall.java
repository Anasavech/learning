package level_9.lecture_2.task_3;

import java.util.Random;

public class MagicBall {
    public static final String CERTAIN = "Бесспорно";
    public static final String DEFINITELY = "Определённо да";
    public static final String MOST_LIKELY = "Вероятнее всего";
    public static final String OUTLOOK_GOOD = "Хорошие перспективы";
    public static final String ASK_LATER = "Спроси позже";
    public static final String TRY_AGAIN = "Попробуй снова";
    public static final String NO = "Мой ответ — нет";
    public static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        String[] answer = new String[]{CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};

        Random number = new Random();
        int randomNumber = number.nextInt(answer.length);

        if ((randomNumber >= 0) && (randomNumber <= answer.length)) {
            return answer[randomNumber];
        }
        return null;
    }
}

