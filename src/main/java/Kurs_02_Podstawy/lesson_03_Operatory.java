package Kurs_02_Podstawy;

public class lesson_03_Operatory {

    static void checkSomeObject(Object object) {
        if(object instanceof String) {
            String someText = (String) object;
            System.out.println("Some text: " + someText);
        }
        else {
            System.out.println("Other type");
        }
    }

    public static void main(String[] args) {
        int itemValue = 100 + 50;
        System.out.println("itemValue = " + itemValue);

        int itemCurrentValue = itemValue + 250;
        System.out.println("itemCurrentValue = " + itemCurrentValue);

        int itemNextValue = itemCurrentValue + itemValue;
        System.out.println("itemNextValue = " + itemNextValue);

        itemValue = 10;
        System.out.println("itemValue = " + itemValue);

        itemValue += 5;
        System.out.println("itemValue = " + itemValue);

        int maxValue = itemValue+1;
        if (itemValue < maxValue) {
            System.out.println("maxValue = " + maxValue);
            System.out.println("itemValue jest mniejsze od maxValue");
        }

        if (true && true) {
            System.out.println("prawda && prawda");
        }
        if(true || false) {
            System.out.println("prawda || fałsz");
        }

        String someText = "Great string!";
        Integer someNumber = 0;
        checkSomeObject(someText);
        checkSomeObject(someNumber);

        System.out.println("\nOperator Warunkowy / Ternary Operator:");
        int someValue = 7;
        System.out.println(someValue == 7 ?  "prawda" :  "fałsz");


        System.out.println("\nOperatory binarne:" +
                "");
        int x = 5; // w systemie binarnym: 0101
        int y = 7; // w systemie binarnym: 0111

        // Koniunkcja. Porównaj kolejne pozycje w dwóch ciągach bitowych.
        // Jeśli co najmniej jedna z nich zawiera 0 wówczas wynikiem będzie 0.
        // Jeśli obie zawierają jedynkę wynikiem będzie 1.
        // 0101 & 0111 = 0101 = 5
        System.out.println("x & y = " + (x & y));

        // Alternatywa. Porównaj kolejne pozycje w dwóch ciągach bitowych.
        // Jeśli co najmniej jedna z nich zawiera 1 wówczas wynikiem będzie 1.
        // Jeśli obie zawierają zero wynikiem będzie 0.
        // Dla dwóch jedynek otrzymamy 1.
        // 0101 | 0111 = 0111 = 7
        System.out.println("x | y = " + (x | y));

        // Alternatywa wykluczająca. Porównaj kolejne pozycje w dwóch ciągach bitowych.
        // Jeśli obie zawierają jedynkę wynikiem będzie 0!
        // Jeśli tylko jedna z nich zawiera 1 wówczas wynikiem będzie 1.
        // Alternatywa wykluczająca: 0101 ^ 0111 = 0010 = 2
        System.out.println("x ^ y = " + (x ^ y));

        // Negacja. Na każdej pozycji zamieniamy 1 z 0 a 0 z 1.
        // ~0101 = 1010 = -6
        System.out.println("~x = " + ~x);
    }
}
