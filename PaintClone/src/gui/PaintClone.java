package gui;

import java.awt.*;

public class PaintClone extends Frame {

    private static final int SIZE = 1000;

    public PaintClone() {
        super("PaintClone");
        setSize(SIZE,SIZE);
        setResizable(false);
        setMenuBar(new MyMenuBar());
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintClone();
    }
}
