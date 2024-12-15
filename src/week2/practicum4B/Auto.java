package week2.practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        if (prPd < 0){
            throw new IllegalArgumentException("Illegal Argument Exception: Prijs per dag kan niet minder zijn dan 0.");
        } else {
            prijsPerDag = prPd;
        }
    }

    public void setPrijsPerDag(double prPd){
        if (prPd < 0){
            throw new IllegalArgumentException("Illegal Argument Exception: Prijs per dag kan niet minder zijn dan 0.");
        } else {
            this.prijsPerDag = prPd;
        }
    }

    public double getPrijsPerDag(){
        return prijsPerDag;
    }

    public String toString() {
        return this.type + " met prijs per dag: " + getPrijsPerDag();
    }
}
