package fr.vertours.quotingservice.constant;

import java.math.BigDecimal;

public class Constants {

    private Constants() {
    }

    public final static BigDecimal CLEANS_SOURCES_PERCENTAGE = BigDecimal.valueOf(0.81);
    public final static BigDecimal DIRTIES_SOURCES_PERCENTAGE = BigDecimal.valueOf(0.19);
    public final static BigDecimal HUNDRED = BigDecimal.valueOf(100);
    public final static int BLOCK_VALUE = 256;

    public static BigDecimal getCleansSourcesPercentage(int nbKWh) {
        BigDecimal ratio = CLEANS_SOURCES_PERCENTAGE.multiply(
                BigDecimal.valueOf(nbKWh));
        return ratio.divide(HUNDRED);
    }
    public static BigDecimal getDirtiesSourcesPercentage(int nbKWh) {
        BigDecimal ratio = DIRTIES_SOURCES_PERCENTAGE.multiply(
                BigDecimal.valueOf(nbKWh));
        return ratio.divide(HUNDRED);
    }

}
