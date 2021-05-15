package com.testng.runallpackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {
    @Test
    public void testOne() {
        System.out.println("Test one here");
    }

    @Test(enabled = false)
    public void testTwo() {
        System.out.println("Test two here");
    }

    @Test
    public void testThree() {
        System.out.println("Test three here");
        throw new SkipException("test is incomplete, skip it");
    }

    @Test
    public void testFour() {
        System.out.println("Test four here");
    }
}
