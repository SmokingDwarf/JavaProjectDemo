package Practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bedrijf1 = new BedrijfsInventaris("Villa Volta", 250000.00);
        Computer computer1 = new Computer("MacBook", "00:0C:6E:D2:11:E6", 2349.00, 2021);
        Computer computer2 = new Computer("MacBook", "00:0C:6E:D2:11:E6", 2349.00, 2021);
        Computer computer3 = new Computer("Lenovo", "7a-b0-ae-64-29-79", 1799.00, 2022);
        Fiets fiets1 = new Fiets("Gazelle", 699.00, 2019, 789456123);
        Fiets fiets2 = new Fiets("Gazelle", 699.00, 2019, 789456123);
        Fiets fiets3 = new Fiets("Twiddler", 249.99,2021, 456789123);
        Auto auto1 = new Auto("Humvee", 32999.00, 2022, "69-AB-42");
        Auto auto2 = new Auto("Humvee", 32999.00, 2022, "69-AB-42");
        Auto auto3 = new Auto("Jeep", 29999.00, 2023, "CD-73-DJ");
        bedrijf1.schafAan(computer1);
        bedrijf1.schafAan(computer2);
        bedrijf1.schafAan(computer3);
        bedrijf1.schafAan(auto1);
        bedrijf1.schafAan(auto2);
        bedrijf1.schafAan(auto3);
        bedrijf1.schafAan(fiets1);
        bedrijf1.schafAan(fiets2);
        bedrijf1.schafAan(fiets3);
        System.out.println(bedrijf1);
        }
    }

