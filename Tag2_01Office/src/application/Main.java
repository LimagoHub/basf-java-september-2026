package application;

import office.Dokument;
import office.Excel;
import office.Word;

public class Main {

    public static void main(String[] args) {
        Dokument d = new Excel();
        d.drucken();
    }
}
