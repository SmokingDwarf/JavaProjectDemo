package Practicum8;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp, pr, jr);
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
        this.framenummer = fnr;
    }

    public double huidigeWaarde(){
        int leeftijd;
        double huidigeWaarde = this.nieuwprijs;
        leeftijd = java.time.Year.now().getValue() - this.bouwjaar;
        for ( int i = 0; i <= leeftijd; i++ ) {
            huidigeWaarde *= 0.9;
        }
        return huidigeWaarde;
    }

    public boolean equals (Object obj){
        if (!(obj instanceof Fiets fiets))
            return false;

        return (this.framenummer == fiets.framenummer);
    }
}
