package Kurs_02_Podstawy;

public class lesson_04_Warunek_If_Else {
    public static void main(String[] args) {
        System.out.println("Hello JavAPPa");

        int numberOfItems = 220;
        if (numberOfItems < 100) {
            System.out.println("Liczba itemów mniejsza niż 100.");
        } else if (numberOfItems < 200) {
            System.out.println("Liczba itemów mniejsza niż 200.");
        } else {
            System.out.println("Liczba itemów nie jest mniejsza od 100 ani od 200. Jest większa bądź równa 200.");
        }
    }
}
