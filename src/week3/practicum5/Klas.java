package week3.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC){
        klasCode = kC;
        this.leerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l){
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for (Leerling leerling : leerlingen) {
           if (leerling.getNaam().equals(nm)) {
               leerling.setCijfer(nweCijfer);
               break;
           }
        }
    }

    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("In klas ").append(klasCode).append(" zitten de volgende leerlingen: \n");
        for (Leerling leerling : leerlingen) {
            result.append(leerling).append("\n");
        }
        return result.toString();
    }
}
