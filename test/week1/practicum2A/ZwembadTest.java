package week1.practicum2A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    void testBerekendeInhoud()
    {
        Zwembad testZwembad = new Zwembad(10, 10, 10);
        testZwembad.inhoud();
        int shouldBe = 10*10*10;
        assertEquals(1000, shouldBe, "De Inhoud() methode berekent niet de juiste inhoud");
    }
}