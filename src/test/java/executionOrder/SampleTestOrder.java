package executionOrder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestOrder {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("From BeforeSuite annotation in SampleTestOrder class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("From BeforeTest annotation in SampleTestOrder class");
    }
}
