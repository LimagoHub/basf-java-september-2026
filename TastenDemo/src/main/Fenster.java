package main;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.event.KeyEvent.*;

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

       switch (e.getKeyCode()) {
           case VK_ESCAPE -> dispose();
           case VK_RIGHT -> x += 5;
           case VK_LEFT -> x -= 5;
           case VK_DOWN -> y += 5;
           case VK_UP -> y -= 5;
       }

        message = "Taste";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}
