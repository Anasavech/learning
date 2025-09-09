package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Man> manList = new ArrayList<>();
        List<Woman> womanList = new ArrayList<>();

        HumanUtil.enrichMan(manList);
        HumanUtil.enrichWoman(womanList);

        manList = HumanUtil.filter(manList);
        womanList = HumanUtil.filter(womanList);

        System.out.println();
    }
}
