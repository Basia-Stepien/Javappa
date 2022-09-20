package Kurs_03ProgramowanieObiektowe.lesson01_10.lesson09KlasyDziedziczenieInheritance;

public class Start {
    public static void main(String[] args) {

        Item item = new Item();
        item.setName("Appa Item 1");

        System.out.println(item.getName());

        DocumentItem item2 = new DocumentItem();
        item2.setName("Appa Item 2");
        item2.setType("Appa Type 1");

        System.out.println(item2.getName());
        System.out.println(item2.getType());

        Item item3 = new DocumentItem();
        item3.setName("Appa Item 3");

        System.out.println(item3.getName());
    }
}
