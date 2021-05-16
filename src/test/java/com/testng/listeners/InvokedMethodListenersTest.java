package com.testng.listeners;

import org.testng.annotations.*;

@Listeners(InvokedMethodListeners.class)
public class InvokedMethodListenersTest {
    @Test
    public void test1() {
        System.out.println("FIRST TEST EXECUTED HERE");
    }

    @Test
    public void test2() {
        System.out.println("SECOND TEST EXECUTED HERE");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("BEFORE CLASS METHOD HERE");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("AFTER CLASS METHOD HERE");
    }
}
