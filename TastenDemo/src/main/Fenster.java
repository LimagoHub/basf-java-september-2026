package main;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenster extends Frame implements KeyListener {

    private static final int SIZE = 500;
    private String message = "Hallo";

    private int x, y;

    public Fenster(String message) {
        this.message = message;
    }

    public Fenster() {
        x = y = SIZE /2;
        setSize(SIZE, SIZE);
        addKeyListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fenster();
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message, 50, 50);
        g.drawRect(x, y, 20, 20);
    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }

        message = "Taste";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}
