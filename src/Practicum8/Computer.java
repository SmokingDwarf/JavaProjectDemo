package Practicum8;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.time.Year.*;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        if (pr <= 0){
            throw new IllegalArgumentException("De aanschafprijs kan niet gelijk zijn aan of minder dan nul.");
        } else {
            this.aanschafPrijs = pr;
        }
        if (jr <=  now().getValue()) {
            this.productieJaar = jr;
        } else {
            throw new IllegalArgumentException("Het productiejaar kan niet hoger zijn dan het huidige jaar.");
        }
    }

    public double huidigeWaarde(){
        int leeftijd;
        double huidigeWaarde = this.aanschafPrijs;
        leeftijd = now().getValue() - productieJaar;
        for ( int i = 0; i <= leeftijd; i++ ) {
            huidigeWaarde = huidigeWaarde * 0.6;
        }
        return huidigeWaarde;
    }

    public boolean equals (Object obj) {
        if (!(obj instanceof Computer computer))
            return false;

        return (this.type.equals(computer.type)
                && this.aanschafPrijs == computer.aanschafPrijs
                && this.macAdres.equals(computer.macAdres)
                && this.productieJaar == computer.productieJaar);
    }

    public String toString() {
        return "Computer: " + this.type + " met productiejaar " + this.productieJaar + " heeft een waarde van: € " + Utils.euroBedrag(huidigeWaarde());
    }
}
