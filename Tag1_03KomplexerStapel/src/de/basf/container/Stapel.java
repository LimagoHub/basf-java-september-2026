package de.basf.container;

public class Stapel<T> {

    private static final int DEFAULT_SIZE = 10;
    private int index;
    private T [] data;

    public Stapel() {
        this(DEFAULT_SIZE);
    }

    public Stapel(int size) {
        index =0;
        data = (T []) new Object [size>0?size:DEFAULT_SIZE];
    }

    public void push(T  value) {
        if(isFull()) return;
        data[index++] = value;
    }

    public T pop() {

        if(isEmpty()) return null;
        return data[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == data.length;
    }
}
