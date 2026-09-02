package de.basf.container;

public class Stapel {

    private static final int DEFAULT_SIZE = 10;
    private int index;
    private int [] data;

    public Stapel() {
        this(DEFAULT_SIZE);
    }

    public Stapel(int size) {
        index =0;
        data = new int [size>0?size:DEFAULT_SIZE];
    }

    public void push(int value) {
        if(isFull()) return;
        data[index++] = value;
    }

    public int pop() {

        if(isEmpty()) return 0;
        return data[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == data.length;
    }
}
