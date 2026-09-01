package main;

import de.basf.tiere.Schwein;

public class Main {

    public static void main(/* Parameter */String[] args) {

        new Main().run();

    }

    private void run() {
        // Declaration einer lokalen Variablen


        System.out.println(Schwein.getCounter());

        Schwein piggy;
        piggy = new Schwein();
        System.out.println(Schwein.getCounter());
        piggy.setName("Miss Piggy");

        System.out.println(piggy.toString());


        piggy.fuettern();

        System.out.println(piggy.toString());
    }
}
