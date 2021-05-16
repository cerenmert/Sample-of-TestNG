package com.testng.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestClass {
    @Test
    public void testOne(){
        System.out.println("I am Test1");
    }

    @Test(dataProvider = "dataProviderCeren")
    public void testGetData(String s) {
        System.out.println("testGetData method input = " +s);
    }

    @DataProvider
    public Object[][] dataProviderCeren() {
        return new Object[][] {{"Abc"}};
    }

    @Test
    public void testThree(){
        Assert.assertEquals(3, 5);
    }

    @Test
    public void testFour(){
        System.out.println("I am test4 and skipping this test after it is invoked");
        throw new SkipException(null);
    }
}
