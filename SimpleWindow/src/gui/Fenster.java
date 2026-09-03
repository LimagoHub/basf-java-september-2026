package gui;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Fenster extends Frame implements KeyListener {


    private String message = "Hallo Fenster";

    public Fenster() {
        setTitle("Fenster");
        setSize(500, 500);
        addKeyListener(this);
        setVisible(true);
    }
    public static void main(String[] args) {
       new Fenster();
    }
    @Override
    public void paint(final Graphics g) {

        g.drawString(message, 50, 50);
    }
    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) {
        message = "Taste wurde gedrueckt";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}
