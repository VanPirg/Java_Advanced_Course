package Collection.Set_Interface;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_Ex1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
//        treeSet.add(null); null Hranit' nel'zya
        treeSet.remove(2);
        System.out.println(treeSet.contains(2));

        System.out.println(treeSet);

    }
}
