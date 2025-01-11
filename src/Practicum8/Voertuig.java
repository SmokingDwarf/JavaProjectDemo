package Practicum8;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.time.Year.now;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig (String tp, double pr, int jr){
        this.type = tp;
        if (pr <= 0){
            throw new IllegalArgumentException("De nieuwprijs kan niet gelijk zijn aan of minder dan nul.");
        } else {
            this.nieuwprijs = pr;
        }
        if (jr <=  now().getValue()) {
            this.bouwjaar = jr;
        } else {
            throw new IllegalArgumentException("Het bouwjaar kan niet hoger zijn dan het huidige jaar.");
        }
    }

    public boolean equals (Object obj){
        if (!(obj instanceof Voertuig voertuig))
            return false;

        return (this.type.equals(voertuig.type)
                && this.nieuwprijs == voertuig.nieuwprijs
                && this.bouwjaar == voertuig.bouwjaar);
    }

    public String toString(){
        BigDecimal bd = BigDecimal.valueOf(huidigeWaarde());
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return "Voertuig: " + this.type + " met bouwjaar " + this.bouwjaar + " heeft een waarde van: € " + bd;
    }
}
