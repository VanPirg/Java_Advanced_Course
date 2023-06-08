package Collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Ivan");
        list1.add("Mariya");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("????");
        list2.add("!!!!");
        list1.addAll(1,list2);
        System.out.println(list1);
//        list1.clear();
        int index = list1.indexOf("Ivan");
        System.out.println(index);
        System.out.println("Size of list : "+list1.size());
        System.out.println(list1.contains("Kolya"));
    }
}
