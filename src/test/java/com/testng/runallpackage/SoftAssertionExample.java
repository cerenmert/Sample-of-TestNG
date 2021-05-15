package com.testng.runallpackage;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    @Test
    public void testCaseOne() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test case one started");
        softAssert.assertEquals(5, 5, "First hard assert failed");
        System.out.println("Soft assert success.");
        softAssert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
        System.out.println("Test case one executed successfully");
        softAssert.assertAll();
    }

    @Test
    public void testCaseTwo() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test case two started");
        softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
        System.out.println("Soft assert success.");
        softAssert.assertTrue(false, "Second soft assert failed");
        System.out.println("Test case two executed successfully");
        softAssert.assertAll();
    }

    @Test
    public void testCaseThree() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Test case Three started");
        softAssert.assertEquals(5, 5, "First hard assert failed");
        System.out.println("hard assert success.");
        Assert.assertTrue("Hello".equals("Hello"), "Second hard assert failed");
        System.out.println("Test case Three executed successfully");
    }

}
