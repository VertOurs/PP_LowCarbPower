package fr.vertours.quotingservice.constant;

import java.math.BigDecimal;

public class Constants {

    public final static double CLEANS_SOURCES_PERCENTAGE = 0.81;
    public final static double DIRTIES_SOURCES_PERCENTAGE = 0.19;
    public final static int HUNDRED = 100;
    public final static int BLOCK_VALUE = 256;

    public static double getCleansSourcesPercentage(int nbKWh) { //prècis mais Illisible ?
        BigDecimal ratio = BigDecimal.valueOf(CLEANS_SOURCES_PERCENTAGE)
                .multiply(BigDecimal.valueOf(nbKWh));

        return ratio.divide(BigDecimal.valueOf(HUNDRED)).doubleValue();
    }
    public static double getDirtiesSourcesPercentage(int nbKWh) { //lisible mais Imprécis
        return (DIRTIES_SOURCES_PERCENTAGE * nbKWh) / 100;
    }

}
