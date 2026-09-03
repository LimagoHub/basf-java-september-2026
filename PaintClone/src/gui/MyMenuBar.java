package gui;


import java.awt.*;

public class MyMenuBar extends MenuBar {

    public MyMenuBar() {
        Menu menu;
        MenuItem item;

        menu = new Menu("Datei");

        item = new MenuItem("beenden");
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
    }
}
