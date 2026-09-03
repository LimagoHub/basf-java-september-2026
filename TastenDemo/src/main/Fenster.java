package main;

import java.awt.*;
import java.awt.event.*;

import static java.awt.event.KeyEvent.*;

public class Fenster extends Frame  {

    private static final int SIZE = 500;
    private String message = "Hallo";

    private int x, y;

    public Fenster(String message) {
        this.message = message;
    }

    public Fenster() {
        x = y = SIZE /2;
        setSize(SIZE, SIZE);
        addMouseMotionListener(new MyMouseMotionListener());
        addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
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





 /*

    private class MyWindowListerer extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    }
*/
    private class MyKeyListener extends KeyAdapter {
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
    }

    private class MyMouseMotionListener extends MouseMotionAdapter {
        @Override
        public void mouseMoved(final MouseEvent e) {
            x += (e.getX() - x) / 20;
            y += (e.getY() - y) / 20;
            repaint();
        }
    }
}
