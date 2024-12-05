package week2.practicum4A;

public class Huis
{
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis (String nieuwAdres, int nieuwBouwjaar)
    {
        this.adres = nieuwAdres;
        this.bouwjaar = nieuwBouwjaar;
    }

    public void setAdres(String nieuwAdres){
        this.adres = nieuwAdres;
    }

    public void setBouwjaar(int nieuwBouwjaar){
        this.bouwjaar = nieuwBouwjaar;
    }

    public void setHuisbaas(Persoon nieuwPersoon){
        this.huisbaas = nieuwPersoon;
    }

    public String getAdres(){
        return this.adres;
    }

    public int getBouwjaar(){
        return this.bouwjaar;
    }

    public Persoon getHuisbaas()
    {
        return this.huisbaas;
    }

    public String toString()
    {
        return "Huis " + this.adres + " is gebouwd in " + this.bouwjaar + "\nen heeft huisbaas " + getHuisbaas();
    }
}
