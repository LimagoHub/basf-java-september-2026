package main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Linie extends Frame {
    private int x1,y1,x2,y2;
    public Linie()  {
        x1 = x2 = y1= y2 = -1;
        setSize(500,500);
        addMouseListener(new MyMouseListener() );
        setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawLine(x1,y1,x2,y2);
    }

    public static void main(String[] args) {
        new Linie();
    }

    private class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
}
