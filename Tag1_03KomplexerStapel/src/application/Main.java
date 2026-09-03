package application;

import de.basf.container.Stapel;
import geometrie.Kreis;
import geometrie.Punkt;
import tiere.Schwein;

public class Main {
    public static void main(String[] args) {
        Stapel<Punkt> stapel = new Stapel<>(40);

        for (int i = 0; i < 10; i++) {
            if( ! stapel.isFull())
                //stapel.push(i);
                //stapel.push(new Schwein("Schwein Nr."+i));
                stapel.push(new Punkt(i,i));
                stapel.push(new Kreis(i));
        }

        while(!stapel.isEmpty()) {
            Punkt p = (Punkt) stapel.pop();
            p.rechts();
            System.out.println(p);
        }
    }
}
