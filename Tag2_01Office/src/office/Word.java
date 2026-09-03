package office;

import java.io.Serializable;

public class Word extends Wordpad implements Dokument, Serializable {

    public void drucken() {
        System.out.println("Hier druckt Word");
    }
}
