package week1.practicum2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VoetbalclubTest
{
    private Voetbalclub test4;

    @BeforeEach
    public void init() {
        this.test4 = new Voetbalclub("NEC");
    }

    @Test
    void VoetbalclubConstructorTestNull() {
        Voetbalclub test1 = new Voetbalclub(null);
        assertEquals("FC", test1.getNaam(), "Voetbalclub(null);");
    }

    @Test
    void VoetbalclubConstructorTestLeegMetSpatie() {
        Voetbalclub test2 = new Voetbalclub(" ");
        assertEquals("FC", test2.getNaam(), "Voetbalclub(' ');");
    }

    @Test
    void VoetbalclubConstructorTestLeegZonderSpatie() {
        Voetbalclub test2 = new Voetbalclub("");
        assertEquals("FC", test2.getNaam(), "Voetbalclub('');");
    }

    @Test
    void VoetbalclubConstructorTestNEC() {
        Voetbalclub test3 = new Voetbalclub("NEC");
        assertEquals("NEC", test3.getNaam(), "Voetbalclub('NEC');");
    }

    // Winst

    @Test
    void verwerkResultaatTestWinstPunten() {
        test4.verwerkResultaat('w');
        assertEquals(3, test4.aantalPunten(), "verwerkResultaatTestWinstPunten");
    }

    @Test
    void verwerkResultaatTestWinstGespeeld()
    {
        test4.verwerkResultaat('w');
        assertEquals(1, test4.aantalGespeeld(), "verwerkResultaatTestWinstGespeeld");
    }

    @Test
    void verwerkResultaatTestWinstToString() {
        test4.verwerkResultaat('w');
        assertEquals("NEC 1 1 0 0 3", test4.toString(), "verwerkResultaatTestWinstToString");
    }

    @Test
    void verwerkResultaatTestMeerdereWinstPunten(){
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('w');
        assertEquals(6, test4.aantalPunten(), "verwerkResultaatTestMeerdereWinst");
    }

    @Test
    void verwerkResultaatTestMeerdereWinstGespeeld(){
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('w');
        assertEquals(2, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereWinst");
    }

    @Test
    void verwerkResultaatTestMeerdereWinstToString(){
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('w');
        assertEquals("NEC 2 2 0 0 6", test4.toString(), "verwerkResultaatTestMeerdereWinstToString");
    }

    // Gelijkspel

    @Test
    void verwerkResultaatTestGelijkspelPunten() {
        test4.verwerkResultaat('g');
        assertEquals(1, test4.aantalPunten(), "verwerkResultaatTestGelijkspelPunten");
    }

    @Test
    void verwerkResultaatTestGelijkspelGespeeld() {
        test4.verwerkResultaat('g');
        assertEquals(1, test4.aantalGespeeld(), "verwerkResultaatTestGelijkspelGespeeld");
    }

    @Test
    void verwerkResultaatTestGelijkspelToString() {
        test4.verwerkResultaat('g');
        assertEquals("NEC 1 0 1 0 1", test4.toString(), "verwerkResultaatTestGelijkspelToString");
    }

    @Test
    void verwerkResultaatTestMeerdereGelijkspelPunten(){
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('g');
        assertEquals(2, test4.aantalPunten(), "verwerkResultaatTestMeerdereGelijkspelPunten");
    }

    @Test
    void verwerkResultaatTestMeerdereGelijkspelGespeeld(){
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('g');
        assertEquals(2, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereGelijkspelGespeeld");
    }

    @Test
    void verwerkResultaatTestMeerdereGelijkspelToString(){
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('g');
        assertEquals("NEC 2 0 2 0 2", test4.toString(), "verwerkResultaatTestMeerdereGelijkspelToString");
    }

    // Verlies

    @Test
    void verwerkResultaatTestVerliesPunten()
    {
        test4.verwerkResultaat('v');
        assertEquals(0, test4.aantalPunten(), "verwerkResultaatTestVerliesPunten");
    }

    @Test
    void verwerkResultaatTestVerliesGespeeld()
    {
        test4.verwerkResultaat('v');
        assertEquals(1, test4.aantalGespeeld(), "verwerkResultaatTestVerliesGespeeld");
    }

    @Test
    void verwerkResultaatTestVerliesToString() {
        test4.verwerkResultaat('v');
        assertEquals("NEC 1 0 0 1 0", test4.toString(), "verwerkResultaatTestVerliesToString");
    }

    @Test
    void verwerkResultaatTestMeerdereVerliesPunten(){
        test4.verwerkResultaat('v');
        test4.verwerkResultaat('v');
        assertEquals(0, test4.aantalPunten(), "verwerkResultaatTestMeerdereVerliesPunten");
    }

    @Test
    void verwerkResultaatTestMeerdereVerliesGespeeld(){
        test4.verwerkResultaat('v');
        test4.verwerkResultaat('v');
        assertEquals(2, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereVerliesGespeeld");
    }

    @Test
    void verwerkResultaatTestMeerdereVerliesToString(){
        test4.verwerkResultaat('v');
        test4.verwerkResultaat('v');
        assertEquals("NEC 2 0 0 2 0", test4.toString(), "verwerkResultaatTestMeerdereVerliesToString");
    }

    // Overig testresultaten

    @Test
    void verwerkResultaatTestOverigPunten()
    {
        test4.verwerkResultaat('c');
        assertEquals(0, test4.aantalPunten(), "verwerkResultaatTestOverigPunten");
    }

    @Test
    void verwerkResultaatTestOverigGespeeld() {
        test4.verwerkResultaat('c');
        assertEquals(0, test4.aantalGespeeld(), "verwerkResultaatTestOverigGespeeld");
    }

    @Test
    void verwerkResultaatTestOverigToString() {
        assertEquals("NEC 0 0 0 0 0", test4.toString(), "verwerkResultaatTestOverigToString");
    }

    // Divers
    @Test
    void verwerkResultaatTestMeerdereDiversePunten(){
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('v');
        assertEquals(4, test4.aantalPunten(), "verwerkResultaatTestMeerdereDiversePunten");
    }

    @Test
    void verwerkResultaatTestMeerdereDiverseGespeeld(){
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('v');
        assertEquals(3, test4.aantalGespeeld(), "verwerkResultaatTestMeerdereDiverseGespeeld");
    }

    @Test
    void verwerkResultaatTestMeerdereDiverseToString(){
        test4.verwerkResultaat('w');
        test4.verwerkResultaat('g');
        test4.verwerkResultaat('v');
        assertEquals("NEC 3 1 1 1 4", test4.toString(), "verwerkResultaatTestMeerdereDiverseToString");
    }

}