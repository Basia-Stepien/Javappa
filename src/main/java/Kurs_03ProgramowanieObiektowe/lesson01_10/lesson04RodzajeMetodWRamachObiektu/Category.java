package Kurs_03ProgramowanieObiektowe.lesson01_10.lesson04RodzajeMetodWRamachObiektu;

public class Category {

    int id;
    String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
