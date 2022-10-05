package Kurs_03ProgramowanieObiektowe.lesson11_21.lesson11PrzeciazanieMetod;

public class Start {
    public static void main(String[] args) {
        Item item1 = new Item(1);
        item1.setDescription();

        System.out.println(item1.getName());
        System.out.println(item1.getDescription());

        Item item2 = new Item(2, "Jo's item");
        item2.setDescription("good description");
        System.out.println(item2.getName());
        System.out.println(item2.getDescription());

        Item item3 = new Item(3, "Jo's item no. 3");
        item3.setDescription("good description", "Jo");
        System.out.println(item3.getName());
        System.out.println(item3.getDescription());

    }
}
