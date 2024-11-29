package week1.practicum2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;


class VoetbalclubTest
{
    private Voetbalclub test4;

    @BeforeEach
    void VoetbalclubNEC() {
        this.test4 = new Voetbalclub("NEC");
    }

    @Test
    void VoetbalclubConstructorTest() {

        Voetbalclub test1 = new Voetbalclub(null);
        assertEquals("FC", test1.getNaam(), "Voetbalclub(null);");

        Voetbalclub test2 = new Voetbalclub("");
        assertEquals("FC", test2.getNaam(), "Voetbalclub('');");

        Voetbalclub test3 = new Voetbalclub("NEC");
        assertEquals("NEC", test3.getNaam(), "Voetbalclub('NEC');");
    }

    // Winst

    @Test
    void verwerkResultaatTestWinstPunten() {
        System.out.println("verwerkResultaatTestWinstPunten init");
        test4.verwerkResultaat('w');
        assertEquals(3, test4.aantalPunten(), "verwerkResultaatTestWinstPunten");
    }

    @Test
    void verwerkResultaatTestWinstGespeeld()
    {
        System.out.println("verwerkResultaatTestWinstGespeeld init");
        test4.verwerkResultaat('w');
        assertEquals(1, test4.aantalGespeeld(), "verwerkResultaatTestWinstGespeeld");
    }

    @Test
    void verwerkResultaatTestWinstToString() {
        System.out.println("verwerkResultaatTestWinstToString init");
        test4.verwerkResultaat('w');
        assertEquals("NEC 1 1 0 0 3", test4.toString(), "verwerkResultaatTestWinstToString");
    }

    void verwerkResultaatTestMeerdereWinstPunten(){
        System.out.println("verwerkResultaatTestMeerdereWinst init");
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('w');
        assertEquals(6, test4.aantalPunten(), "verwerkResultaatTestMeerdereWinst");
    }

    @Test
    void verwerkResultaatTestMeerdereWinstGespeeld(){
        System.out.println("verwerkResultaatTestMeerdereWinst init");
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('w');
        assertEquals(2, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereWinst");
    }

    @Test
    void verwerkResultaatTestMeerdereWinstToString(){
        System.out.println("verwerkResultaatTestMeerdereWinstToString init");
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('w');
        assertEquals("NEC 2 2 0 0 6", test4.toString(), "verwerkResultaatTestMeerdereWinstToString");
    }

    // Gelijkspel

    @Test
    void verwerkResultaatTestGelijkspelPunten() {
        System.out.println("verwerkResultaatTestGelijkspelPunten init");
        test4.verwerkResultaat('g');
        assertEquals(1, test4.aantalPunten(), "verwerkResultaatTestGelijkspelPunten");
    }

    @Test
    void verwerkResultaatTestGelijkspelGespeeld() {
        System.out.println("verwerkResultaatTestGelijkspelGespeeld init");
        test4.verwerkResultaat('g');
        assertEquals(1, test4.aantalGespeeld(), "verwerkResultaatTestGelijkspelGespeeld");
    }

    @Test
    void verwerkResultaatTestGelijkspelToString() {
        System.out.println("verwerkResultaatTestGelijkspelToString init");
        test4.verwerkResultaat('g');
        assertEquals("NEC 1 0 1 0 1", test4.toString(), "verwerkResultaatTestGelijkspelToString");
    }

    @Test
    void verwerkResultaatTestMeerdereGelijkspelPunten(){
        System.out.println("verwerkResultaatTestMeerdereGelijkspelPunten init");
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('g');
        assertEquals(2, test4.aantalPunten(), "verwerkResultaatTestMeerdereGelijkspelPunten");
    }

    @Test
    void verwerkResultaatTestMeerdereGelijkspelGespeeld(){
        System.out.println("verwerkResultaatTestMeerdereGelijkspelGespeeld init");
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('g');
        assertEquals(2, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereGelijkspelGespeeld");
    }

    @Test
    void verwerkResultaatTestMeerdereGelijkspelToString(){
        System.out.println("verwerkResultaatTestMeerdereGelijkspelToString init");
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('g');
        assertEquals("NEC 2 0 2 0 2", test4.toString(), "verwerkResultaatTestMeerdereGelijkspelToString");
    }

    // Verlies

    @Test
    void verwerkResultaatTestVerliesPunten()
    {
        System.out.println("verwerkResultaatTestVerliesPunten init");
        test4.verwerkResultaat('v');
        assertEquals(0, test4.aantalPunten(), "verwerkResultaatTestVerliesPunten");
    }

    @Test
    void verwerkResultaatTestVerliesGespeeld()
    {
        System.out.println("verwerkResultaatTestVerliesGespeeld init");
        test4.verwerkResultaat('v');
        assertEquals(1, test4.aantalGespeeld(), "verwerkResultaatTestVerliesGespeeld");
    }

    @Test
    void verwerkResultaatTestVerliesToString() {
        System.out.println("verwerkResultaatTestVerliesToString init");
        test4.verwerkResultaat('v');
        assertEquals("NEC 1 0 0 1 0", test4.toString(), "verwerkResultaatTestVerliesToString");
    }

    @Test
    void verwerkResultaatTestMeerdereVerliesPunten(){
        System.out.println("verwerkResultaatTestMeerdereVerliesPunten init");
        test4.verwerkResultaat('v');
        test4.verwerkResultaat('v');
        assertEquals(0, test4.aantalPunten(), "verwerkResultaatTestMeerdereVerliesPunten");
    }

    @Test
    void verwerkResultaatTestMeerdereVerliesGespeeld(){
        System.out.println("verwerkResultaatTestMeerdereVerliesGespeeld init");
        test4.verwerkResultaat('v');
        test4.verwerkResultaat('v');
        assertEquals(2, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereVerliesGespeeld");
    }

    @Test
    void verwerkResultaatTestMeerdereVerliesToString(){
        System.out.println("verwerkResultaatTestMeerdereVerliesToString init");
        test4.verwerkResultaat('v');
        test4.verwerkResultaat('v');
        assertEquals("NEC 2 0 0 2 0", test4.toString(), "verwerkResultaatTestMeerdereVerliesToString");
    }

    // Overig testresultaten

    @Test
    void verwerkResultaatTestOverigPunten()
    {
        System.out.println("verwerkResultaatTestOverigPunten init");
        test4.verwerkResultaat('c');
        assertEquals(0, test4.aantalPunten(), "verwerkResultaatTestOverigPunten");
    }

    @Test
    void verwerkResultaatTestOverigGespeeld() {
        System.out.println("verwerkResultaatTestOverigGespeeld init");
        test4.verwerkResultaat('c');
        assertEquals(0, test4.aantalGespeeld(), "verwerkResultaatTestOverigGespeeld");
    }

    @Test
    void verwerkResultaatTestOverigToString() {
        System.out.println("verwerkResultaatTestOverigToString init");
        assertEquals("NEC 0 0 0 0 0", test4.toString(), "verwerkResultaatTestOverigToString");
    }

    // Divers
    @Test
    void verwerkResultaatTestMeerdereDiversePunten(){
        System.out.println("verwerkResultaatTestMeerdereDiversePunten init");
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('v');
        assertEquals(4, test4.aantalPunten(), "verwerkResultaatTestMeerdereDiversePunten");
    }

    @Test
    void verwerkResultaatTestMeerdereDiverseGespeeld(){
        System.out.println("verwerkResultaatTestMeerdereDiverseGespeeld init");
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('v');
        assertEquals(3, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereDiverseGespeeld");
    }

    @Test
    void verwerkResultaatTestMeerdereDiverseToString(){
        System.out.println("verwerkResultaatTestMeerdereDiverseToString init");
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('v');
        assertEquals("NEC 3 1 1 1 4", test4.toString(), "verwerkResultaatTestMeerdereDiverseToString");
    }

}