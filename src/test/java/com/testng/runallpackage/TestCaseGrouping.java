package com.testng.runallpackage;

import org.testng.annotations.Test;

public class TestCaseGrouping {
    @Test(groups = "London")
    public void london(){
        System.out.println("London is really good city");
    }
    @Test(groups = "Barcelona")
    public void barcelona(){
        System.out.println("Claro, Barcelona es muy bueno!");
    }
    @Test(groups = "Barcelona")
    public void barcelona2(){
        System.out.println("Claro, Barcelona es un lugar muy interesante!");
    }
    @Test(groups = "Paris" )
    public void paris(){
        System.out.println("Paris est très belle");
    }
    @Test(groups = {"Paris", "Barcelona"})
    public void letsGo(){
        System.out.println("They both need to be visited");
    }
}
