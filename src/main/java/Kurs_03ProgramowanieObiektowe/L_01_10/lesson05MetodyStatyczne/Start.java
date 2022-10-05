package Kurs_03ProgramowanieObiektowe.L_01_10.lesson05MetodyStatyczne;

public class Start {
    public static void main(String[] args) {

        Item item = new Item("Appa Item no. 1");
        ItemDataPrinter.printItemData(item);

        Start start = new Start();
        start.printItemData();

    }

    public void printItemData() {
        System.out.println("Item no. 1");
    }
}
