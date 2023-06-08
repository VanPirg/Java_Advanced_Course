package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ok");
        list.add("privet");
        list.add("poka");
        showInfo(list);
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showInfo(list1);


    }
    static void showInfo(List<?> list){
        System.out.println("Moy list soderjit :  "+list);
    }
}
