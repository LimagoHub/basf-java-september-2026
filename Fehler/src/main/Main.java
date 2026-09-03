package main;

public class Main {
    public static void main(String[] args) {

        try {
            int feld[] = new int [2];
            int a, b , c;

            a = b = 0;
            feld[5] = 100 ;
            c = a / b;


        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Vielen Dank, Sie haben ein kleines Programm sehr gluecklich gemacht!");
    }


}
