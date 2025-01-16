package Practicum7;

public class Uitroeptekeneren implements OpmaakProces {

    public Uitroeptekeneren(){}

    @Override
    public String maakOp(String input) {
        return input.replace(".", "!");
    }
}
