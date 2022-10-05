package Kurs_03ProgramowanieObiektowe.L_01_10.lesson07KlasaString;

public class Start {
    public static void main(String[] args) {
        String itemName01 = "First Item";
        String itemName02 = "First Item - 'The best one'";
        String itemName03 = new String("First Item");

        System.out.println("itemName01 = " + itemName01);
        System.out.println("itemName02 = " + itemName02);
        System.out.println("itemName03 = " + itemName03);

        String itemName04 = "itemName04";
        String itemNameExclusive05 = "itemName04";

        System.out.println("itemName04 = " + itemName04);
        System.out.println("itemNameExclusive05 = " + itemNameExclusive05);

        itemName04 = "Second Item";

        System.out.println("itemName04 = " + itemName04);
        System.out.println("itemNameExclusive05 = " + itemNameExclusive05);

        System.out.println();
        String itemName06 = "Second item";
        int len = itemName06.length();
        System.out.println("len = " + len);

        String itemNameUpperCase = itemName06.toUpperCase();
        System.out.println("itemNameUpperCase = " + itemNameUpperCase);

        String itemNameLowerCase = itemName06.toLowerCase();
        System.out.println("itemNameLowerCase = " + itemNameLowerCase);

        int index01  = itemName06.indexOf("nd");
        System.out.println("index01 = " + index01);

        int index02  = itemName06.lastIndexOf("e");
        System.out.println("index02 = " + index02);

        String itemNameOfItam = itemName06.replace('e','a');
        System.out.println("itemNameOfItam = " + itemNameOfItam);

        String itemNamePrefix = "Fourth";
        String itemNameBase = "Item";
        String itemFullName = itemNamePrefix + " " + itemNameBase;
        System.out.println("itemFullName = " + itemFullName);
        String itemFullName02 = itemNamePrefix.concat(itemNameBase);
        System.out.println("itemFullName02 = " + itemFullName02);

        System.out.println();
        System.out.println("Hello JavAPPa");

        String itemDescription = "All item has multiple attributes";
        String itemDescriptionModified = itemDescription.replace("i", "x");

        System.out.println(itemDescriptionModified);

    }
}
