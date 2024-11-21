package week1.practicum1;

public class Practicum_1_Uitwerking
{
    public static void main(String[] arg)
    {
        GetallenLijstFor();
        GetallenLijstWhile();
        RandomGetallen(10);
        SomVanGeheleGetallen();
        Zaagtandpatroon(4);
    }

    public static void GetallenLijstFor()
    {
//  Deze for loop print de getallen 1 tot en met 10 naar de console.
        for (int index = 1; index <= 10; index++)
        {
            System.out.println(index);
        }
    }

    public static void GetallenLijstWhile()
    {
//  Deze while loop print de getallen 1 tot en met 10 naar de console.
        int index = 1;
        while (index <= 10)
        {
            System.out.println(index);
            index++;
        }
    }

    public static void RandomGetallen(int endPoint)
    {
//  Deze methode gebruikt een while loop om willekeurige getallen te printen. Hij doet dit zo vaak als het gegeven argument
        int index = 1;
        while (index <= endPoint)
        {
            System.out.println(Math.random());
            index++;
        }
    }

    public static void SomVanGeheleGetallen() {
        int som = 0;
        for (int index = 1; index <= 39; index++) {
            som = som + index;
        }
        System.out.println(som);
    }

    public static void Zaagtandpatroon(int patroonLengte)
    {
        for (int index = 1; index <= patroonLengte; index++) {
            if (index % 2 == 0) {
                System.out.println("ss");
            } else {
                System.out.println("s");
            }
        }
    }
}
