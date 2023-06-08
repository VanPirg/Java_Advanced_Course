package Collection;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Ivan");
        list1.add("Mariya");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Zaur");
        list2.add("Mariya");
//        list1.removeAll(list2);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
