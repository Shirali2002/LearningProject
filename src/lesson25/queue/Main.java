package src.lesson25.queue;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1);
        queue.add(2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

//        Integer peek = queue.peek(); //-> out olacaq elementi qaytarir amma silmir. bosdursa null qaytarir
//        Integer poll = queue.poll(); //-> out olacaq elementi qaytarir ve silir. bosdursa null qaytarir
//        Integer remove = queue.remove(); //-> out olacaq elementi qaytarir ve silir. bosdursa exception atir
    }

}
