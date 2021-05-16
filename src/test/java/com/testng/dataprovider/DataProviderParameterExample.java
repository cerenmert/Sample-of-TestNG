package com.testng.dataprovider;

import org.testng.annotations.Test;

public class DataProviderParameterExample {
    @Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
    public void scenario1(String sData) {
        System.out.println("Scenario testing: Data for(" + sData + ")");
    }

    @Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
    public void scenario2(String sData) {
        System.out.println("Scenario testing: Data for(" + sData + ")");
    }

    @Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
    public void commonScenarios(String sData) {
        System.out.println("Common Scenarios testing: Data for(" + sData + ")");
    }
}
