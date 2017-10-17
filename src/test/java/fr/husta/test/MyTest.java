package fr.husta.test;

import org.junit.Test;

public class MyTest {

    @Test
    public void testLog4j2() throws Exception {
        PojoWithLog4j2.logMe();
    }

    @Test
    public void testSlf4j() throws Exception {
        PojoWithSlf4j.logMe();
    }

}
