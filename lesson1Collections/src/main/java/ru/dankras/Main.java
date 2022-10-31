package ru.dankras;



import ru.dankras.myCollections.MyLinkedList;
import ru.dankras.myCollections.MyList;

import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {
        MyList<Integer> list = new MyLinkedList<Integer>();

        for (int i = 0; i < 50; i++) {
            list.add(i,0);
        }
        System.out.println("   ");
        var size = list.size();
       /* for (int i = 0; i < size ; i++) {
            list.remove(0);
        }*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*list = new MyArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i, 0);
        }
        System.out.println("   ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        MyQueue<Integer> queue = new MyLinkedList<Integer>();
        for (int i = 0; i < 50; i++) {
            queue.put(i);
        }
        System.out.println("   ");
        for (int i = 0; i < 50; i++) {
            System.out.println(queue.poll());
        }*/
    }
}
