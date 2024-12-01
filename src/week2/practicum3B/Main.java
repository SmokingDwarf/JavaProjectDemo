package week2.practicum3B;

public class Main {
    public static void main(String[] args) {
    Cirkel c1 = null, c2 = null;

    // Verwachting: Ik verwacht dat als het try-catch blok word verwijderd dat de applicatie gewoon alles uitvoert, maar de uitvoer verandert.
    // Ik verwacht dat de output van main zal zijn:
        //{locatie van c1}
        //{locatie van c2}

//    try {
//        c1 = new Cirkel(10, 0, 0);
//        c2 = new Cirkel(0, 10, 10);
//    } catch (IllegalArgumentException iae) {
//        System.out.println(iae.getMessage());
//    }

    //  Na het testen blijkt dat c1 en c2 als nul worden weergegeven.
    //  Blijkbaar komt dit omdat Java onder water slim genoeg is om by een System.out.println(null) dit automatisch te converteren en "null" te printen.

    System.out.println(c1);
    System.out.println(c2);

    }
}