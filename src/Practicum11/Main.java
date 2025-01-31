package Practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Opvragen bronbestand
        System.out.println("Geef naam van het bronbestand op.");
        String bronbestand = scanner.nextLine();

        //Opvragen bestemmingsbestand
        System.out.println("Geef naam van het bestemmingsbestand op.");
        String bestemmingsbestand = scanner.nextLine();

        //Opvragen dollarWaarde
            // 91,8720
        System.out.println("Geef de waarde van 1 US dollar in Eurocenten op.");
        double dollarWaarde;
        try {
            dollarWaarde = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("De ingevoerde waarde is geen geldig getal.");
            return;
        }

        Path bronbestandPath;
        List<String> alleRegels = null;

        try {
            bronbestandPath = Path.of("src/Practicum11/" + bronbestand);
            //Read all lines
             alleRegels = Files.readAllLines(bronbestandPath);
        } catch (Exception n) {
            System.out.println("Dit bestand staat niet in je folder.");
            return;
        }

        //Verwerken input bestemmingsbestand
        Path bestemmingsbestandPath = Path.of("src/Practicum11/" + bestemmingsbestand);

        //For loop: Voor elke string in de List:
        BufferedWriter out = Files.newBufferedWriter(bestemmingsbestandPath);

        for (String regel : alleRegels) {
            String x = regel.substring(regel.indexOf(": "));
            double y = Double.parseDouble(x.substring(1));
            double z = y / 100 * dollarWaarde;
            String whatever = regel.replace(x, "");
            out.write(whatever + ": " + z + "\n");
        }
        out.close();
    }
}
