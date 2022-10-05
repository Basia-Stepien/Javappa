package Kurs_03ProgramowanieObiektowe.lesson11_20.lesson13KlasyAbstrakcyjne;

public abstract class Item {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}
