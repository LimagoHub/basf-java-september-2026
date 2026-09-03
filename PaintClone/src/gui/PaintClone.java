package gui;

import java.awt.*;

public class PaintClone extends Frame {

    private static final int SIZE = 1000;

    public enum Formen {LINIE, RECHTECK, OVAL, LÖSCHEN};

    private Formen form = Formen.LINIE;
    private Color farbe = Color.WHITE;

    public PaintClone() {
        super("PaintClone");
        setSize(SIZE,SIZE);
        setResizable(false);
        setMenuBar(new MyMenuBar(this));
        setVisible(true);
    }

    public Formen getForm() {
        return form;
    }

    public void setForm(final Formen form) {
        this.form = form;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(final Color farbe) {
        this.farbe = farbe;
    }

    public static void main(String[] args) {
        new PaintClone();
    }
}
