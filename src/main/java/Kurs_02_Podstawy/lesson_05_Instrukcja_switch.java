package Kurs_02_Podstawy;

public class lesson_05_Instrukcja_switch {

    public static void main(String[] args) {

        int numberOfItems = 15;
        switch (numberOfItems) {
            case 0:
                System.out.println("Liczba itemów równa jest 0.");
                break;
            case 10:
                System.out.println("Liczba itemów równa jest 10.");
                break;
            case 50:
                System.out.println("Liczba itemów równa jest 50.");
                break;
            case 103:
                System.out.println("Liczba itemów równa jest 103.");
                break;
            default:
                System.out.println("Liczba itemów jest inna niż przewidywana");
        }
    }
}
