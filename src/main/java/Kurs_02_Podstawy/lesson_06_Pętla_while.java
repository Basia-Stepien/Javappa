package Kurs_02_Podstawy;

public class lesson_06_Pętla_while {
    public static void main(String[] args) {
        System.out.println("Hello JavAPPa");

        int itemCounter = 0;
        while (itemCounter < 5) {
            System.out.println(itemCounter);
            itemCounter++;
        }

        itemCounter = 0;
        do {
            System.out.println(itemCounter);
            itemCounter++;
        }
        while (itemCounter < 5);
    }
}
