package Collection.Map_Interface;
import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f,false);
        Student st1 = new Student("Zaur","Tregulov",3);
        Student st2 = new Student("Mariya","Ivanova",1);
        Student st3 = new Student("Sergey","Petrov",4);
        Student st4 = new Student("Mariya","Ivanova",1);
        Student st5 = new Student("Sergey","Petrov",4);
        Student st6 = new Student("Mariya","Ivanova",1);
        Student st7 = new Student("Sergey","Petrov",4);
        lhm.put(7.2,st3);
        lhm.put(7.4,st1);
        lhm.put(8.5,st5);
        lhm.put(6.9,st4);
        lhm.put(7.1,st7);
        lhm.put(7.3,st2);
        lhm.put(9.1,st6);

        System.out.println(lhm);
    }
}
