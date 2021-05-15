package com.testng.runallpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependency {
    @Test
    public void login(){
        System.out.println("Please enter your email and password for login");
    }
    @Test(dependsOnMethods = "login")
    public void addToBasket(){
        System.out.println("If you like it, add to basket!");
    }
    @Test (dependsOnMethods = "addToBasket")
    public void validateCreditCard(){
        Assert.assertTrue(false);
        System.out.println("To buy something, validate you credit card");
    }
    @Test(dependsOnMethods = {"addToBasket","validateCreditCard"})
    //if one of the methods is failed, then orderSuccessful method will be executed but ignored!
    public void orderSuccessful(){
        System.out.println("Your order is received, have a nice day");
    }
}
