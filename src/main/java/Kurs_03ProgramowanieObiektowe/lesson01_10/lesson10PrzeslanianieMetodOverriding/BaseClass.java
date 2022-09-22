package Kurs_03ProgramowanieObiektowe.lesson01_10.lesson10PrzeslanianieMetodOverriding;

public class BaseClass {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getLastName() {
        System.out.println("Supermetoda w superklasie");
        return lastName;
    }
}
