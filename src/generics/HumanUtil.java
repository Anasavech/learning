package generics;

import java.util.ArrayList;
import java.util.List;

public class HumanUtil {

    public static <R extends Human> List<R> filter(List<R> list) {
        List<R> filtredList = new ArrayList<>();

        for (R item : list) {
            if (item.getAgeOld() < 18) filtredList.add(item);
        }

        return filtredList;
    }

    public static void enrichMan(List<Man> list) {

        list.add(new Man(22, "Сергей"));
        list.add(new Man(16, "Максим"));
        list.add(new Man(54, "Олег"));
        list.add(new Man(23, "Дейдара"));
        list.add(new Man(34, "Гаара"));
        list.add(new Man(6, "Наруто"));
    }

    public static void enrichWoman(List<Woman> list) {
        list.add(new Woman(22, "Ника"));
        list.add(new Woman(16, "Ольга"));
        list.add(new Woman(54, "Вика"));
        list.add(new Woman(23, "Маша"));
        list.add(new Woman(34, "Галя"));
        list.add(new Woman(6, "Света"));
    }
}
