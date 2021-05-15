package com.testng.runallpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

    @Test
    public void testOne(){
        System.out.println("Hi, I am Test One .....");
        Assert.assertEquals("FaceBook", "FaceBook");
    }

    @Test
    public void testTwo(){
        Assert.assertEquals(404, 200);   //this is hard assertion
        System.out.println("Hi, I am Test Two .....");   //this will not executed.
    }

    @Test
    public void testThree(){
        System.out.println("Hi, I am Test Three .....");
        Assert.assertTrue(true);
    }

    @Test
    public void testFour(){
        System.out.println("Hi, I am Test Four .....");
        Assert.assertTrue(false, "Making Test Failure");
    }

    @Test
    public void testFive(){
        System.out.println("Hi, I am Test Five .....");
    }

    @Test
    public void testSix(){
        System.out.println("Hi, I am Test Six .....");
    }
}
