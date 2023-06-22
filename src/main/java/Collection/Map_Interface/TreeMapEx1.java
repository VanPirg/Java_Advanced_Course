package Collection.Map_Interface;

import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Student,Double>treeMap = new TreeMap<>();
        TreeMap<Student,Double>treeMap1 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Student st1 = new Student("Zaur","Tregulov",3);
        Student st2 = new Student("Mariya","Ivanova",1);
        Student st3 = new Student("Sergey","Petrov",4);
        Student st4 = new Student("Mariya","Ivanova",1);
        Student st5 = new Student("Sergey","Petrov",4);
        Student st6 = new Student("Mariya","Ivanova",1);
        Student st7 = new Student("Sergey","Petrov",4);
        treeMap.put(st1,5.8);
        treeMap.put(st2,9.1);
        treeMap.put(st7,6.4);
        treeMap.put(st4,7.5);
        treeMap.put(st6,7.2);
        treeMap.put(st5,8.2);
        treeMap.put(st3,7.9);

        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);


    }
}
