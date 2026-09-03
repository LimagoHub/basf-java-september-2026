package gui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenuBar extends MenuBar {

    public MyMenuBar(PaintClone paintClone) {
        Menu menu;
        MenuItem item;

        menu = new Menu("Datei");

        item = new MenuItem("beenden");
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paintClone.dispose();
            }
        });
        menu.add(item);
        add( menu );

        menu = new Menu("Formen");

        item = new MenuItem("Linie");
        menu.add(item);

        item = new MenuItem("Rechteck");
        menu.add(item);

        item = new MenuItem("Oval");
        menu.add(item);

        menu.addSeparator();

        item = new MenuItem("Löschen");
        menu.add(item);



        add( menu );

        menu = new Menu("Farben");

        item = new MenuItem("Weiss");
        menu.add(item);
        item = new MenuItem("Rot");
        menu.add(item);

        item = new MenuItem("Grün");
        menu.add(item);

        item = new MenuItem("Blau");
        menu.add(item);

        item = new MenuItem("Gelb");
        menu.add(item);

        item = new MenuItem("Pink");
        menu.add(item);



        add( menu );

        
    }
}
