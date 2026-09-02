package tiere;

public class Schwein {

    // Instanzvariablen
    private String name;
    private int gewicht;

    // KLassenvariablen
    private static int counter;

    // KLassenkonstruktor
    static {
        Schwein.counter = 0;
    }

    public static int getCounter() {
        return Schwein.counter;
    }

    // Instanzkonstruktor
    public Schwein() {
        this("nobody");
    }

    public Schwein(String name) {
        setName(name);
        gewicht = 10;
        Schwein.counter ++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Quueeeiiiikkkk");
        Schwein.counter --;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        if("Elsa".equals(name)) return ;
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        if(gewicht < 10) return ;
        this.gewicht = gewicht;
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
