package org.petrovic.uuid;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    long iterations = 1000 * 10000;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        long start = System.currentTimeMillis();
        for (long i = 0; i < iterations; ++i) {
            UUID.randomUUID();
        }
        long stop = System.currentTimeMillis();
        System.out.println("random: " + ((stop - start) / 1000));

        start = System.currentTimeMillis();

        for (long i = 0; i < iterations; ++i) {
            java.util.UUID.fromString(new com.eaio.uuid.UUID().toString());
        }
        stop = System.currentTimeMillis();
        System.out.println("time: " + ((stop - start) / 1000));

    }
}
