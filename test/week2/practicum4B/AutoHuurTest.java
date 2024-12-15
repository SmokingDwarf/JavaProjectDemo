package week2.practicum4B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    Klant jan = new Klant("Jan Janssen");
    Auto peogeot = new Auto("Peogeot 207", 50.0);

// Testgeval 1
    @Test
    void GeenHuurderGeenAutoNulDagen(){
        AutoHuur test = new AutoHuur();
        assertEquals("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0", test.toString(), "GeenHuurderGeenAutoNulDagen()");
    }

    @Test
    void GeenHuurderGeenAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        assertEquals("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 5 en dat kost 0.0", test.toString(), "GeenHuurderGeenAutoVijfDagen()");
    }

    // Testgeval 2
    @Test
    void WelHuurderMetKortingGeenAutoNulDagen(){
        AutoHuur test = new AutoHuur();
        test.setHuurder(jan);
        jan.setKorting(10.0);
        assertEquals("er is geen auto bekend\nop naam van: Jan Janssen (korting: 10.0%)\naantal dagen: 0 en dat kost 0.0", test.toString(), "WelHuurderMetKortingGeenAutoNulDagen()");
    }

    @Test
    void WelHuurderMetKortingGeenAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        test.setHuurder(jan);
        jan.setKorting(10.0);
        assertEquals("er is geen auto bekend\nop naam van: Jan Janssen (korting: 10.0%)\naantal dagen: 5 en dat kost 0.0", test.toString(), "WelHuurderMetKortingGeenAutoVijfDagen()");
    }

    // Testgeval 3
    @Test
    void WelHuurderZonderKortingGeenAutoNulDagen(){
        AutoHuur test = new AutoHuur();
        test.setHuurder(jan);
        assertEquals("er is geen auto bekend\nop naam van: Jan Janssen (korting: 0.0%)\naantal dagen: 0 en dat kost 0.0", test.toString(), "WelHuurderMetKortingGeenAutoNulDagen()");
    }

    @Test
    void WelHuurderZonderKortingGeenAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        test.setHuurder(jan);
        assertEquals("er is geen auto bekend\nop naam van: Jan Janssen (korting: 0.0%)\naantal dagen: 5 en dat kost 0.0", test.toString(), "WelHuurderMetKortingGeenAutoNulDagen()");
    }

    // Testgeval 4
    @Test
    void GeenHuurderWelAutoNulDagen(){
        AutoHuur test = new AutoHuur();
        test.setGehuurdeAuto(peogeot);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0", test.toString(), "GeenHuurderWelAutoNulDagen()");
    }

    @Test
    void GeenHuurderWelAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        test.setGehuurdeAuto(peogeot);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\ner is geen huurder bekend\naantal dagen: 5 en dat kost 250.0", test.toString(), "GeenHuurderWelAutoVijfDagen()");
    }

    //Testgeval 5
    @Test
    void WelHuurderMetKortingWelAutoNulDagen(){
        AutoHuur test = new AutoHuur();
        test.setGehuurdeAuto(peogeot);
        test.setHuurder(jan);
        jan.setKorting(10.0);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\nop naam van: Jan Janssen (korting: 10.0%)\naantal dagen: 0 en dat kost 0.0", test.toString(), "WelHuurderMetKortingWelAutoNulDagen()");
    }

    @Test
    void WelHuurderMetKortingWelAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        test.setGehuurdeAuto(peogeot);
        test.setHuurder(jan);
        jan.setKorting(10.0);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\nop naam van: Jan Janssen (korting: 10.0%)\naantal dagen: 5 en dat kost 225.0", test.toString(), "WelHuurderMetKortingWelAutoVijfDagen()");
    }

    // Testgeval 6
    @Test
    void WelHuurderZonderKortingWelAutoNulDagen(){
        AutoHuur test = new AutoHuur();
        test.setGehuurdeAuto(peogeot);
        test.setHuurder(jan);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\nop naam van: Jan Janssen (korting: 0.0%)\naantal dagen: 0 en dat kost 0.0", test.toString(), "WelHuurderZonderKortingWelAutoNulDagen()");
    }

    @Test
    void WelHuurderZonderKortingWelAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        test.setGehuurdeAuto(peogeot);
        test.setHuurder(jan);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\nop naam van: Jan Janssen (korting: 0.0%)\naantal dagen: 5 en dat kost 250.0", test.toString(), "WelHuurderZonderKortingWelAutoVijfDagen()");
    }

    //Testgeval 7
    @Test
    void KlantKortingMeerDanHonderd(){
        AutoHuur test = new AutoHuur();
        test.setHuurder(jan);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> jan.setKorting(110.0));
        assertEquals("Illegal Argument Exception: Percentage lager of hoger dan 100%.", exception.getMessage(), "KlantKortingMeerDanHonderd()");
    }

    @Test
    void KlantKortingMinderDanNul(){
        AutoHuur test = new AutoHuur();
        test.setHuurder(jan);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> jan.setKorting(-10.0));
        assertEquals("Illegal Argument Exception: Percentage lager of hoger dan 100%.", exception.getMessage(), "KlantKortingMeerDanHonderd()");
    }

    @Test
    void WelHuurderMetKorting100WelAutoVijfDagen(){
        AutoHuur test = new AutoHuur();
        test.setAantalDagen(5);
        test.setGehuurdeAuto(peogeot);
        test.setHuurder(jan);
        jan.setKorting(100.0);
        assertEquals("autotype: Peogeot 207 met prijs per dag: 50.0\nop naam van: Jan Janssen (korting: 100.0%)\naantal dagen: 5 en dat kost 0.0", test.toString(), "WelHuurderMetKorting100WelAutoVijfDagen()");
    }

// Testgeval 8
    @Test
    void AutoHuurSetAantalDagenMinderDanNul(){
        AutoHuur test = new AutoHuur();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> test.setAantalDagen(-5));
        assertEquals("Illegal Argument Exception: Aantal Dagen kan niet minder zijn dan 0.", exception.getMessage(), "AutoHuurSetAantalDagenMinderDanNul()");
    }

// Testgeval 9

    @Test
    void AutoConstructorPrijsPerDagMinderDanNul(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Auto x = new Auto("X", -50.0);
        });
        assertEquals("Illegal Argument Exception: Prijs per dag kan niet minder zijn dan 0.", exception.getMessage(), "AutoConstructorPrijsPerDagMinderDanNul()");
    }

    @Test
    void AutoSetPrijsPerDagMinderDanNul(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            peogeot.setPrijsPerDag(-50.0);
        });
        assertEquals("Illegal Argument Exception: Prijs per dag kan niet minder zijn dan 0.", exception.getMessage(), "AutoSetPrijsPerDagMinderDanNul()");
    }
}
