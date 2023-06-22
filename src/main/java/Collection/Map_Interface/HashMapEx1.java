package Collection.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(3568,"Ivan Ivanov");
        map1.put(6578,"Mariya Sidorova");
        map1.put(1400,"Nikolay Petrov");
        map1.put(6578,"Mariya Sidrova");
        map1.putIfAbsent(1000,"Zaur Tregulov");
        System.out.println(map1.get(1000));
        System.out.println(map1);
        map1.remove(6578);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());


        Map<String,String> map2 = new HashMap<>();
        map2.put("Sasha","Dobrii");
        map2.put("Misha","Umnii");


    }
}
