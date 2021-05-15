package com.testng.runallpackage;

import org.testng.annotations.Test;

public class ExampleForPriority {
    @Test(priority = 3)
    public void testOneP() {
        System.out.println("Test one for priority");
    }

    @Test(priority = 2)
    public void testTwoP() {
        System.out.println("Test two for priority");
    }

    @Test(priority = 4)
    public void testThreeP() {
        System.out.println("Test three for priority ");
    }

    @Test(priority = 1)
    public void testFourP() {
        System.out.println("Test four for priority ");
    }
}
