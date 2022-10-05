package Kurs_03ProgramowanieObiektowe.lesson11_20.lesson14Interfejsy;

public interface Item {

    public String LABEL = "Item LABEL final String";

    public abstract void setName(String name);

    public abstract String getName();

    public abstract String getDescription();

    default String getFullName() {
        return "Item in Jo's app";
    }
}
