package Practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfnaam;
    private double budget;
    private ArrayList<Goed> inventaris;

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfnaam = nm;
        this.budget = bud;
        this.inventaris = new ArrayList<>();
    }

    public void schafAan(Goed g) {
        if (!this.inventaris.contains(g) && g.huidigeWaarde() <= this.budget ) {
            this.inventaris.add(g);
            this.budget = this.budget - g.huidigeWaarde();
        } else if (g.huidigeWaarde() > this.budget) {
            throw new IllegalArgumentException ("Exception: Huidige waarde van deze goed is groter dan budget.");
        }
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Goed g : inventaris) {
            string.append(g).append("\n");
        }
        return string.toString();
    }

}
