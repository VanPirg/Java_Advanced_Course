package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5_1 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3,8,13);  //sozdanie lista bez add
        System.out.println(list1);
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Zaur");
        arraylist1.add("Ivan");
        arraylist1.add("Mariya");
        System.out.println(arraylist1);
        List<String> list2 = List.copyOf(arraylist1);
        System.out.println(list2);
    }
}
