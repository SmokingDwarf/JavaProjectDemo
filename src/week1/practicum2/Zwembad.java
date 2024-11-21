package week1.practicum2;

public class Zwembad
{
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad()
    {

    }

    public Zwembad(double nieuweBreedte, double nieuweLengte, double nieuweDiepte)
    {
        this.breedte = nieuweBreedte;
        this.lengte = nieuweLengte;
        this.diepte = nieuweDiepte;
    }

    public double inhoud()
    {
        return this.lengte * this.breedte * this.diepte;
    }

    public double getBreedte()
    {
        return breedte;
    }

    public double getLengte()
    {
        return lengte;
    }

    public double getDiepte()
    {
        return diepte;
    }

    public void setBreedte(double nieuweBreedte)
    {
        this.breedte = nieuweBreedte;
    }

    public void setLengte(double nieuweLengte)
    {
        this.lengte = nieuweLengte;
    }

    public void setDiepte(double nieuweDiepte)
    {
        this.diepte = nieuweDiepte;
    }

    public String toString()
    {
        return String.format("Dit zwembad is %s meter breed, %s meter lang en %s meter diep.", this.breedte,this.lengte, this.diepte);
    }
}
