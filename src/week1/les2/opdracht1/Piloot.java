package week1.les2.opdracht1;

public class Piloot {
    private String naam;
    private Double salaris;
    private Integer vlieguren;

    public Piloot(String nm){
        naam = nm;
    }

    public void setSalaris(double sl){
        salaris = sl;
    }

    public double getSalaris(){
        return salaris;
    }

    public int getVlieguren(){
        return vlieguren;
    }

    public int verhoogVliegurenMet(int extra){
        vlieguren = vlieguren + extra;
        return vlieguren;
    }

    public String toString(){
        String s = naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
        return s;
    }
}
