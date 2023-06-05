package Generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("abc");
        al1.add("def");
        al1.add("rty");
        String a = GenMethod.getSecondElement(al1);
        System.out.println(a);
    }
}
class GenMethod{
    public static  <T>  T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
