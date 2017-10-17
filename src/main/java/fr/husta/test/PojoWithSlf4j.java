package fr.husta.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PojoWithSlf4j {

    private static final Logger LOGGER = LoggerFactory.getLogger(PojoWithSlf4j.class);

    public static void logMe() {
        LOGGER.info("Hello SLF4J !");
    }

}
