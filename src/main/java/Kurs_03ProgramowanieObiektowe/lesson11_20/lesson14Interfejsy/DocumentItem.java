package Kurs_03ProgramowanieObiektowe.lesson11_20.lesson14Interfejsy;

public class DocumentItem implements Item, Image{
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return "This is description for DocumentItem";
    }

    @Override
    public String getImageName() {
        return "DefaultImage.png";
    }
}
