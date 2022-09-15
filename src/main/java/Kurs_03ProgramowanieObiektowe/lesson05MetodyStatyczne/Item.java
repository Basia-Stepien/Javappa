package Kurs_03ProgramowanieObiektowe.lesson05MetodyStatyczne;

public class Item {

    int id;
    String name;

    public Item(String name) {
        this.id = id;
        this.name = name;

    }

    void printItemData() {
        System.out.println(this.name);
        // getName() to inna metoda zdefiniowana w klasie Item
        System.out.println(this.getName());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
