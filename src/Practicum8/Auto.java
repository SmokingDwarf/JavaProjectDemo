package Practicum8;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto (String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
        this.kenteken = kt;
    }

    public double huidigeWaarde(){
        int leeftijd;
        double huidigeWaarde = this.nieuwprijs;
        leeftijd = java.time.Year.now().getValue() - this.bouwjaar;
        for ( int i = 0; i < leeftijd; i++ ) {
            huidigeWaarde = huidigeWaarde * 0.7;
            System.out.println(huidigeWaarde);
        }
        return huidigeWaarde;
    }

    public boolean equals (Object obj){
        if (!(obj instanceof Auto auto))
            return false;

        return (this.kenteken.equals(auto.kenteken)
                && this.nieuwprijs == auto.nieuwprijs
                && this.bouwjaar == auto.bouwjaar);
    }
}
