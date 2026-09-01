package de.basf.application;

import de.basf.geometrie.Punkt;

public class Main {

    public static void main(String[] args) {
        Punkt p = new Punkt();

        for (int i = 0; i < 11; i++) {
            p.rechts();
            System.out.println(p.toString());
        }
    }
}
