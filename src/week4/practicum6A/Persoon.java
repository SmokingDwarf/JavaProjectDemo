package week4.practicum6A;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Persoon {
    private String naam;
    private double budget;
    ArrayList<Game> gameCollectie = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget(){
        return this.budget;
    }

    public boolean koop(Game g){
        boolean buitenBudget;
        boolean inCollectie;

        // Check of persoon voldoende budget heeft
        buitenBudget = g.huidigeWaarde() > this.budget || this.budget - g.huidigeWaarde() < 0;

        // Check of persoon de game al bezit
        inCollectie = this.gameCollectie.contains(g);

        if (buitenBudget || inCollectie){
            return false;
        } else {
            this.gameCollectie.add(g);
            this.budget = this.budget - g.huidigeWaarde();
            return true;
        }
    }

    public boolean verkoop (Game g, Persoon koper){
        boolean buitenBudget;
        boolean inPersoonCollectie;
        boolean inKoperCollectie;

        // Check of persoon de game al bezit
        inPersoonCollectie = this.gameCollectie.contains(g);

        // Check of koper de game al bezit
        inKoperCollectie = koper.gameCollectie.contains(g);

        // Check of koper voldoende budget heeft
        buitenBudget = (g.huidigeWaarde() > koper.budget || koper.budget - g.huidigeWaarde() < 0);

        if (buitenBudget || !inPersoonCollectie || inKoperCollectie){
            return false;
        } else {
            this.gameCollectie.remove(g);
            koper.gameCollectie.add(g);
            this.budget = this.budget + g.huidigeWaarde();
            koper.budget = koper.budget - g.huidigeWaarde();
            return true;
        }
    }

    public String toString(){
        BigDecimal bd = new BigDecimal(this.budget);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        StringBuilder returnTekst = new StringBuilder(this.naam + " heeft een budget van €" + bd + " en bezit de volgende games:");
        for (Game g : this.gameCollectie){
            returnTekst.append("\n").append(g.toString());
        }
        return returnTekst.toString().replace('.',',');
    }
}
