package Kurs_03ProgramowanieObiektowe.lesson11_20.lesson13KlasyAbstrakcyjne;

public class Start {
    public static void main(String[] args) {
        ExcelDocumentItem item1 = new ExcelDocumentItem();
        System.out.println(item1.getDescription());

//        ExcelDocumentItem item2 = new DocumentItem();
        DocumentItem item3 = new DocumentItem();
        System.out.println(item3.getDescription());

        DocumentItem item4 = new ExcelDocumentItem();
        System.out.println(item4.getDescription());

    }
}
