package week2.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant (String nm){
        naam = nm;
    }

    public void setKorting(double kP){
        if (kP < 0 || kP > 100){
            throw new IllegalArgumentException("Illegal Argument Exception: Percentage lager of hoger dan 100%.");
        } else {
            this.kortingsPercentage = kP;
        }
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public String toString(){
        return this.naam + " (korting: " + getKorting() + "%)";
    }
}
