package main;

public class Main {
    public static void main(String[] args) {
        new B();
        new B();
    }
}

class A {
    static {
        System.out.println("static von A");
    }
    public A(){
        System.out.println("Ctor A");
        foo();
    }
    public void foo(){
        System.out.println("foo von A");
    }
}
class B extends A {
    public B(){
        System.out.println("Ctor B");

    }
    public void foo(){
        System.out.println("foo von B");
    }
}

