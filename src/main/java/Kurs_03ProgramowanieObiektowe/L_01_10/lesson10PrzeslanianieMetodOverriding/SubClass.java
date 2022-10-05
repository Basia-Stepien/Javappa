package Kurs_03ProgramowanieObiektowe.L_01_10.lesson10PrzeslanianieMetodOverriding;

public class SubClass extends BaseClass{
    @Override
    public String getFirstName() {
        return "Jan";
    }

    @Override
    public String getLastName() {
        super.getLastName();
        return "Kowalski";
    }

}
