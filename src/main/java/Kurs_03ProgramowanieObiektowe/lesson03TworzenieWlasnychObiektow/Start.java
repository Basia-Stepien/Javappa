package Kurs_03ProgramowanieObiektowe.lesson03TworzenieWlasnychObiektow;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello JavAPPa");
        Item item = new Item(5, "Appa Item 1", new Category(1, "Appa Category 1"));
        System.out.println(item.getName());
        System.out.println(item.getCategory().getName());
    }
}
