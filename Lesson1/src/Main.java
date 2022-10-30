import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> list = new MyLinkedList<Integer>();

        for (int i = 0; i < 50; i++) {
            list.add(i, 0);
        }
        System.out.println("   ");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        list = new MyArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i, 0);
        }
        System.out.println("   ");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }


        MyQueue<Integer> queue = new MyLinkedList<Integer>();
        for (int i = 0; i < 50; i++) {
            queue.put(i);
        }
        System.out.println("   ");
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.poll());
        }

    }
}