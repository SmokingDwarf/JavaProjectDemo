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
        if(naam == null || naam.isEmpty())
        {
            this.naam = "FC";
        }
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

    public String getNaam(){
        return this.naam;
    }

    public void setAantalGewonnen(int nieuwAantalGewonnen)
    {
        this.aantalGewonnen = nieuwAantalGewonnen;
    }

    public void setAantalGelijk(int nieuwAantalGelijk)
    {
        this.aantalGelijk = nieuwAantalGelijk;
    }

    public void setAantalVerloren(int nieuwAantalVerloren)
    {
        this.aantalVerloren = nieuwAantalVerloren;
    }

    public void setNaam(String nieuweNaam){
        this.naam = nieuweNaam;
    }

    public String toString()
    {
        return String.format("%s %s %s %s %s %s",this.naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
