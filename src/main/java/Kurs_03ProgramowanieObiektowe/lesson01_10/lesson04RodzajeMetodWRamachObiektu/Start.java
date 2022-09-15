package Kurs_03ProgramowanieObiektowe.lesson01_10.lesson04RodzajeMetodWRamachObiektu;

public class Start {
    public static void main(String[] args) {
        ItemService itemService01 = new ItemService();
        Item item01 = itemService01.createItem();

        Item item02 = new Item("Appa Item 1", new Category(1, "Appa Category 1"));
        Category category = item02.getCategory();

        ItemService itemService02 = new ItemService();
        itemService02.printItemData(item02);

        
    }
}
