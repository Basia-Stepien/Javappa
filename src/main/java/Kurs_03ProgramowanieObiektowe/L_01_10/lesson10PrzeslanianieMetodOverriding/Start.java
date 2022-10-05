package Kurs_03ProgramowanieObiektowe.L_01_10.lesson10PrzeslanianieMetodOverriding;

public class Start {
    public static void main(String[] args) {
        BaseClass baseObject01 = new BaseClass();
        baseObject01.setFirstName("Jakub");
        baseObject01.setLastName("Nowak");
        System.out.println(baseObject01.getFirstName() + " " + baseObject01.getLastName());

        BaseClass baseObject02 = new SubClass();
        baseObject02.setFirstName("Jakub");
        baseObject02.setLastName("Nowak");
        System.out.println(baseObject02.getFirstName() + " " + baseObject02.getLastName());

    }
}
