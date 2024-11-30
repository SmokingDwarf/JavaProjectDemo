package week2.les3;

public class TariefFabriek {
    private static boolean success = false;

    public static void main(String[] args) {
        System.out.println("TariefFabriek init");
        while(!success) {
            try {
                BelastingTarieven test1 = new BelastingTarieven();
                test1.produceerBelastingTarieven();
                success = true;
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic Exception");
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
        System.out.println("TariefFabriek end");
    }
}


// ArithmeticException