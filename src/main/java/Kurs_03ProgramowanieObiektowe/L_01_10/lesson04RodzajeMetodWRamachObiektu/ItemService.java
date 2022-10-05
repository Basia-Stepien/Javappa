package Kurs_03ProgramowanieObiektowe.L_01_10.lesson04RodzajeMetodWRamachObiektu;

public class ItemService {
    Item createItem() {
        Item item = new Item("Appa Item 1", new Category(1, "Appa Category 1"));
        return item;
    }

    void printItemData(Item item) {
        String itemNameFromItem = item.getName();
        System.out.println(itemNameFromItem);
    }

}
