package fr.vertours.quotingservice.constant;

public class Constants {

    public final static Double CLEANS_SOURCES_PERCENTAGE = 0.81;
    public final static Double DIRTIES_SOURCES_PERCENTAGE = 0.19;
    public final static Integer BLOCK_VALUE = 256;

    public static Double getCleansSourcesPercentage(Integer nbKWh) {
        return (CLEANS_SOURCES_PERCENTAGE * nbKWh) / 100;
    }

}
