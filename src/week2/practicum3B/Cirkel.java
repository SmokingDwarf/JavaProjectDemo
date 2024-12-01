package week2.practicum3B;

public class Cirkel
{
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int xPositie, int yPositie) throws IllegalArgumentException
    {
        if(radius <= 0)
        {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }

    public String toString() {
//        cirkel (0, 0) met radius: 10
        return "Cirkel (" + this.xPositie + ", " + this.yPositie + ") met radius: " + this.radius;
    }
}
