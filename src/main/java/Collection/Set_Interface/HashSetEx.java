package Collection.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        set.add("Igor"); //Net dublicatov
        set.remove("Zaur");

        System.out.println(set);
        for (String s:set){
            System.out.println(s);
        }
        set.size();
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Marina"));


    }
}
