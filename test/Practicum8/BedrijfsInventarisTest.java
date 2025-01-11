package Practicum8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BedrijfsInventarisTest {
    int vorigJaar = java.time.Year.now().getValue() - 1;
    int volgendJaar = java.time.Year.now().getValue() + 1;
    int huidigJaar = java.time.Year.now().getValue();
    BedrijfsInventaris testBedrijf = new BedrijfsInventaris("Permanentgeleendefietsen.nl", 150.00);
    Fiets fiets1 = new Fiets("Goeiekoop", 50.00, vorigJaar, 789456123);
    Fiets fiets2 = new Fiets("Goeiekoop", 50.00, vorigJaar, 789456123);
    Fiets fiets3 = new Fiets("Goeiekoop", 150.00, vorigJaar, 456123789);
    Fiets fiets4 = new Fiets("Goeiekoop", 50.00, huidigJaar, 123789456);

    // Testgeval 1 - Kijken of het budget juist is aangepast
    @Test
    void EenOfTweeFietsenInInventarisTest(){
        testBedrijf.schafAan(fiets1);
        testBedrijf.schafAan(fiets2);
        assertEquals("Voertuig: Goeiekoop met bouwjaar 2024 heeft een waarde van: € 40.50\n", testBedrijf.toString(), "EenOfTweeFietsenInInventarisTest()");
    }

    // Testgeval 2 - Het aanschaffen mislukt als er onvoldoende budget is.
    @Test
    void BudgetCorrectTest(){
        testBedrijf.schafAan(fiets1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> testBedrijf.schafAan(fiets3));
        assertEquals("Exception: Huidige waarde van deze goed is groter dan budget.", exception.getMessage(), "BudgetCorrectTest()");
    }

    // Testgeval 3 - Controleren of het berekenen van de huidige waarde correct gebeurt.
    @Test
    void HuidigeWaardeTestLeeftijd1Jaar(){
        assertEquals(40.50, fiets1.huidigeWaarde(), "HuidigeWaardeTestLeeftijd1Jaar()");
    }

    // Testgeval 4 - Controleren of de huidige waarde correct berekend wordt wanneer het productiejaar het huidige jaar is.
    @Test
    void HuidigeWaardeTestLeeftijd0Jaar(){
        assertEquals(45.00, fiets4.huidigeWaarde(), "HuidigeWaardeTestLeeftijd0Jaar()");
    }

    // Testgeval 5 - Controleren of het systeem een exception throwed wanneer het opgegeven productiejaar groter is dan de huidige datum.
    @Test
    void ExceptionFietsProductiejaarHogerDanHuidigeDatum(){
        int volgendJaar = java.time.Year.now().getValue() + 1;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Fiets("Goeiekoop", 50.00, volgendJaar, 123789456));
        assertEquals("Het bouwjaar kan niet hoger zijn dan het huidige jaar.", exception.getMessage(), "ExceptionFietsProductiejaarHogerDanHuidigeDatum()");
    }

    // Testgeval 6 - Controleren of het systeem een exception throwed wanneer het opgegeven productiejaar groter is dan de huidige datum.
    @Test
    void ExceptionFietsBouwjaarHogerDanHuidigeDatum(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Computer("Goeiekoop", "7a-b0-ae-64-29-79", 50.00, volgendJaar));
        assertEquals("Het productiejaar kan niet hoger zijn dan het huidige jaar.", exception.getMessage(), "ExceptionFietsBouwjaarHogerDanHuidigeDatum()");
    }

    //Testgeval 7 - Controleren of het systeem een exception throwed wanneer het aanschafbedrag gelijk is of lager dan nul
    @Test
    void ExceptionComputerAanschafbedragGelijkAanOfLagerDanNul(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Computer("Goeiekoop", "7a-b0-ae-64-29-79", -50.00, vorigJaar));
        assertEquals("De aanschafprijs kan niet gelijk zijn aan of minder dan nul.", exception.getMessage(), "ExceptionComputerAanschafbedragGelijkAanOfLagerDanNul()");
    }

    //Testgeval 8 - Controleren of het systeem een exception throwed wanneer de nieuwprijs gelijk is of lager dan nul
    @Test
    void ExceptionFietsNieuwprijsGelijkAanOfLagerDanNul(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Fiets("Goeiekoop", -50.00, vorigJaar, 123789456));
        assertEquals("De nieuwprijs kan niet gelijk zijn aan of minder dan nul.", exception.getMessage(), "ExceptionFietsNieuwprijsGelijkAanOfLagerDanNul()");
    }
}
