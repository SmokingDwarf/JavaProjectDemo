package Practicum7;

import java.util.ArrayList;

public class StringProcessor {

    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        this.processen = new ArrayList<>();
    }

    public String verwerk(String input){
        for (OpmaakProces proces : this.processen){
            input = proces.maakOp(input);
        }
        return input;
    }

    public void voegProcesToe(OpmaakProces proces){
        this.processen.add(proces);
    }
}
