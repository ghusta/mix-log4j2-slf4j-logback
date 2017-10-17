package fr.husta.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PojoWithLog4j2 {

    private static final Logger LOGGER = LogManager.getLogger(PojoWithLog4j2.class);

    public static void logMe()
    {
        LOGGER.info("Hello Log4J2 !");
    }

}
