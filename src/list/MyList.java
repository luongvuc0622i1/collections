package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        E oldValue = get(index);
        int numMoved = size - index - 1;
        System.arraycopy(elements, index + 1, elements, index, numMoved);

        elements[--size] = null;
        return oldValue;
    }

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(11);
        listInteger.add(12);

        System.out.println(listInteger.elements.length);
        System.out.println(listInteger.size);

        listInteger.remove(8);
        listInteger.remove(9);
        listInteger.remove(10);

        System.out.println(listInteger.elements.length);
        System.out.println(listInteger.size);
        for (Object e: listInteger.elements) {
            System.out.println(e);
        }

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));

        listInteger.get(-1);
    }
}
