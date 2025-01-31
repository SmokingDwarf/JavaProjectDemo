package Practicum8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        BigDecimal bigDecimal = new BigDecimal(bedrag);
        bigDecimal = bigDecimal.setScale(precisie, RoundingMode.HALF_UP);
        String s = "€ " + bigDecimal;
        return s.replace('.', ',');
    }
}
