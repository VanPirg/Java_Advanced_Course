package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch:s.toCharArray()){
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseiterator = list.listIterator(list.size());
        boolean isPalendrome = true;
        while (iterator.hasNext() && reverseiterator.hasPrevious()){
            if(iterator.next()!=reverseiterator.previous()){
                isPalendrome = false;
                break;
            }
        }
        if (isPalendrome){
            System.out.println("Palendrome");
        }
        else
        {
            System.out.println("Not Palendrome");
        }
    }

}
