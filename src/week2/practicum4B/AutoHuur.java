package week2.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant klant;
    private Auto auto;

    public AutoHuur() {
        aantalDagen = 0;
        klant = null;
        auto = null;
    }

    public void setAantalDagen(int aD){
        if (aD < 0) {
            throw new IllegalArgumentException ("Illegal Argument Exception: Aantal Dagen kan niet minder zijn dan 0.");
        } else {
            this.aantalDagen = aD;
        }
    }

    public int getAantalDagen(){
        return this.aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        this.auto = gA;
    }

    public Auto getGehuurdeAuto(){
        return this.auto;
    }

    public void setHuurder(Klant k){
        this.klant = k;
    }

    public Klant getHuurder(){
        return this.klant;
    }

    public double totaalPrijs(){
        if (auto != null && klant != null) {
            double x = this.aantalDagen * this.auto.getPrijsPerDag();
            double y = x / 100;
            double z = y * this.klant.getKorting();
            return x - z;
        } else if (auto != null) {
            return this.aantalDagen * this.auto.getPrijsPerDag();
        } else {
            return 0.0;
        }
    }

    public String toString(){
        String string;
        if (this.auto == null && this.klant == null){
            string = "er is geen auto bekend\n" + "er is geen huurder bekend\n" + "aantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs();
        } else if (this.auto == null) {
            string = "er is geen auto bekend\n" + "op naam van: " + this.klant + "\n" + "aantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs();
        } else if (this.klant == null) {
            string = "autotype: " + this.auto +"\n" + "er is geen huurder bekend\n" + "aantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs();
        } else {
            string = "autotype: " + this.auto +"\n" + "op naam van: " + this.klant + "\n" + "aantal dagen: " + this.aantalDagen + " en dat kost " + this.totaalPrijs();
        }
        return string;
    }
}
