package Kurs_03ProgramowanieObiektowe.lesson06TypyObiektowe;

public class Main {
    public static void main(String[] args) {
        byte itemByte = 3; // Typ prosty
        Byte itemByteAsObject = new Byte((byte) 3); // Typ obiektowy

        short itemShort = 4;
        Short itemShortAsObject = new Short((short) 4);

        int itemInteger = 5;
        Integer itemIntegerAsObject = new Integer(5);

        double itemDouble = 6.5;
        Double itemDoubleAsObject = new Double(6.5);

        Byte itemNumberAsByteObject = 3;
        Short itemNumberAsShortObject = 4;
        Integer itemNumberAsIntegerObject  = 5;
        Double itemNumberAsDoubleObject = 6.5;

        int itemNumberAsIntType = new Integer(7);

        Long itemNumberAsLongObject = 7L;

        long itemNumberAsLongType = 7;
        long itemNumberAsLongType02 = 72036854775807L;

    }
}
