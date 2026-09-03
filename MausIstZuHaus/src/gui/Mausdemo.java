package gui;

import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mausdemo extends Frame implements MouseListener{

    private String message = "Hello World!";

    public Mausdemo() {
        setSize(500,500);
        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message,100,100);
    }

    public static void main(String[] args) {
        new Mausdemo();
    }

    @Override
    public void mouseClicked(final MouseEvent e) {

    }

    @Override
    public void mousePressed(final MouseEvent e) {

    }

    @Override
    public void mouseReleased(final MouseEvent e) {

    }

    @Override
    public void mouseEntered(final MouseEvent e) {
        message = "Mouse entered!";
        repaint();
    }

    @Override
    public void mouseExited(final MouseEvent e) {
        message = "Mouse exited!";
        repaint();
    }
}
