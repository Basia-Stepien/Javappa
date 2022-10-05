package Kurs_03ProgramowanieObiektowe.lesson11_20.lesson14Interfejsy;

import java.awt.*;

public class Start {
    public static void main(String[] args) {
        DocumentItem item1 = new DocumentItem();
        item1.setName("Jo's item no. 1");
        System.out.println(item1.getName());
        System.out.println(item1.getDescription());
        System.out.println(item1.getImageName());
        System.out.println(item1.getFullName());
        System.out.println(Item.LABEL);

    }
}
