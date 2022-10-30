public class MyLinkedList<E> implements MyList, MyQueue {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public void add(Object object) {
        Node<E> node = new Node<E>(object);
        Node<E> prevTeil = tail;
        tail = node;
        tail.setNext(prevTeil);
        if (prevTeil != null) {
            prevTeil.setPrev(tail);
        }
        if (head == null) {
            head = node;
        }
        size++;

    }

    @Override
    public void add(Object object, int index) {
        if (index > size - 1 && size != 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> newNode = new Node<E>(object);
        Node<E> node = head;
        if (tail == null && head == null) {
            tail = newNode;
            head = newNode;
        }
        for (int i = 0; i < index; i++) {
            node = node.getPrev();
        }
        newNode.setPrev(node);
        if (node != null) {
            newNode.setNext(node.getNext());
            if (node.getNext() != null) {
                node.getNext().setPrev(newNode);
            }
            node.setNext(newNode);
        }
        if (newNode.getNext() == null) {
            head = newNode;
        }
        if (newNode.getPrev() == null) {
            tail = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (index > size - 1 && size != 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;

        for (int i = 0; i < index; i++) {
            node = node.getPrev();
        }
        return node.getElement();
    }

    @Override
    public void remove(int index) {
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getPrev();
        }
        node.getPrev().setNext(node.getNext());
        if (node.getNext() != null) {
            node.getNext().setPrev(node.getPrev());

        } else {
            head = node.getPrev();
        }
        size--;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void put(Object object) {
        add(object);

    }

    @Override
    public E peek() {
        return get(0);
    }

    @Override
    public E poll() {
        Node node = head;
        head.getPrev().setNext(head.getNext());
        head = head.getPrev();
        size--;
        return (E) node.getElement();
    }
}
