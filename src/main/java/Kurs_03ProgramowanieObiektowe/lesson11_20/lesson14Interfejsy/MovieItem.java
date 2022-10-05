package Kurs_03ProgramowanieObiektowe.lesson11_20.lesson14Interfejsy;

public class MovieItem implements Item{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "This is description for MovieItem";
    }
}
