package week4.practicum6A;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        // Huidige waarde is nieuwprijs - 30% van nieuwprijs per jaar sinds releasejaar

        int aantalJaar = LocalDate.now().getYear() - this.releaseJaar;
        double waarde = this.nieuwprijs;
        // Elk jaar opnieuw berekenen hoe veel 30% is.
        for (int index = 0; index < aantalJaar; index++) {
            waarde = waarde * 0.7;
        }
        return waarde;
    }

    public boolean equals(Object andereObject){
        // Vergelijk this.naam en this.releasejaar met naam en releasejaar van andereObject.
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game game = (Game) andereObject;
            if (this.naam.equals(game.naam) && this.releaseJaar == game.releaseJaar) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;

        // Als ze gelijk zijn, return true.
    }

    public String toString(){
        BigDecimal bd1 = new BigDecimal(huidigeWaarde());
        bd1 = bd1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd2 = new BigDecimal(this.nieuwprijs);
        bd2 = bd2.setScale(2, RoundingMode.HALF_UP);
        String returnTekst = naam + ", uitgegeven in " + this.releaseJaar + "; nieuwprijs: €" + bd2 + " nu voor: €" + bd1;
        return returnTekst.replace('.', ',');
    }
}
