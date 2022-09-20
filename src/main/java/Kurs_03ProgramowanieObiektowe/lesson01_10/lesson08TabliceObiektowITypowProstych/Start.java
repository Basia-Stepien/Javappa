package Kurs_03ProgramowanieObiektowe.lesson01_10.lesson08TabliceObiektowITypowProstych;

public class Start {
    public static void main(String[] args) {
        String[] items01;
        //System.out.println("items01 = " + items01); -> error: "java: variable items01 might not have been initialized"

        String[] items = {"Appa Item no. 1", "Appa Item no. 2", "Appa Item no. 3", "Appa Item no. 4"};
        System.out.println("items = " + items[0]);
        System.out.println(items.length);

        for (int i=0; i < items.length; i++) {
            System.out.println(items[i]);
        }

        System.out.println();
        String[][] items02 = {{"Appa Item no. 1", "Appa Item no. 2", "Appa Item no. 3", "Appa Item no. 4"},
                {"Appa Item no. 5", "Appa Item no. 6", "Appa Item no. 7"}};
        String item = items02[1][2];
        System.out.println(item);

        System.out.println();


        int[] itemsNumbers = {5, 10, 15, 20, 25}; //zadeklarowanie tablicy wraz z jej zainicjowaniem wartościami
        int length = itemsNumbers.length; //pobranie długości tablicy
        System.out.println("itemsNumbers[2] = " + itemsNumbers[2]);
        itemsNumbers[2] = 30; //przypisanie wartości w 3 elemencie tablicy
        System.out.println("itemsNumbers[2] = " + itemsNumbers[2]);

        System.out.println();
        String[] items03 = new String[4];
        items03[0] = "Appa Item no. 1";
        items03[1] = "Appa Item no. 2";
        items03[2] = "Appa Item no. 3";
        items03[3] = "Appa Item no. 4";
        for(int i =0; i<items03.length; i++) {
            System.out.println("items03[" + i + "] = " + items03[i]);
        }



    }
}
