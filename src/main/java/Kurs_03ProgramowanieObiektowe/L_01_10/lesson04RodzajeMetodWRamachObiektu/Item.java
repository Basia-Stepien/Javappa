package Kurs_03ProgramowanieObiektowe.L_01_10.lesson04RodzajeMetodWRamachObiektu;

public class Item {

    int id;
    String name;
    Category category;

    public Item(String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    void printItemData() {
        System.out.println(this.name);
        // getName() to inna metoda zdefiniowana w klasie Item
        System.out.println(this.getName());
        System.out.println(this.category.getName());
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

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return this.category;
    }
}
