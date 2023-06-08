package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Zaur");
        arraylist1.add("Ivan");
        arraylist1.add("Mariya");
        arraylist1.add("Kolya");
        arraylist1.add("Nastya");
        Iterator<String> iterator = arraylist1.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }
    }
}
