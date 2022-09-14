package Kurs_03ProgramowanieObiektowe.lesson02KlasyIProgramyObiektowe;

public class Item {
    int id;
    String name;
    Category category;

    public Item(int id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
