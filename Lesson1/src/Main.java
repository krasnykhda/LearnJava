
public class Main {
    public static void main(String[] args) {

        MyList<Integer> list = new MyLinkedList<Integer>();

        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        System.out.println("   ");
        var size = list.getSize();
        for (int i = 0; i < size - 2; i++) {
            list.remove(0);
        }
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
        for (int i = 0; i < 50; i++) {
            System.out.println(queue.poll());
        }

    }
}