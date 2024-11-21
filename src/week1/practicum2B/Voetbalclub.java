package week1.practicum2B;

public class Voetbalclub
{
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private String naam;

    public Voetbalclub(String nieuweNaam)
    {
        naam = nieuweNaam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten()
    {
        int puntenGewonnen = 3 * this.aantalGewonnen;
        return puntenGewonnen + this.aantalGelijk;
    }

    public int aantalGespeeld()
    {
        return this.aantalGelijk + this.aantalGewonnen + this.aantalVerloren;
    }

    public int getAantalGewonnen()
    {
        return aantalGewonnen;
    }

    public int getAantalGelijk()
    {
        return aantalGelijk;
    }

    public int getAantalVerloren()
    {
        return aantalVerloren;
    }

    public String toString()
    {
        return String.format("%s %s %s %s %s %s",this.naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
