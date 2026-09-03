package main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Linie extends Frame {


    private static final int SIZE =500;

    private BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);


    public Linie()  {

        setSize(SIZE,SIZE);
        setResizable(false);
        addMouseListener(new MyMouseListener() );
        setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        new Linie();
    }

    private class MyMouseListener extends MouseAdapter {
        private int x,y;
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }
        public void mouseReleased(MouseEvent e) {
            Graphics backBufferGraphics = image.getGraphics();
            backBufferGraphics.drawLine(x,y,e.getX(),e.getY());
            repaint();
        }
    }
}
