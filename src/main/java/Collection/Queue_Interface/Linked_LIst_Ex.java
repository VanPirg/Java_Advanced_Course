package Collection.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class Linked_LIst_Ex {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Alex");
        queue.add("Oleg");
        queue.offer("Danik");// toje dobavlyaet element
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll()); // toje udalyaet element
        System.out.println(queue);
        System.out.println(queue.element()); // pokazivaet kto v ocheredi da pervom meste
        System.out.println(queue.peek()); // toje kak metod element no ne vibrasivaet eksaption

    }
}
