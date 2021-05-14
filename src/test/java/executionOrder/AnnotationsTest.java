package executionOrder;

import org.testng.annotations.*;

public class AnnotationsTest {
    @Test
    public void test() {
        System.out.println("From Test annotated in AnnotationsTest....");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("From BeforeMethod annotation in AnnotationsTest....");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("From AfterMethod annotation in AnnotationsTest....");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("From BeforeClass annotation test in AnnotationsTest class....");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("From AfterClass annotation test in AnnotationsTest class....");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("From AfterTest annotation in AnnotationsTest class ....");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("From AfterSuite annotation in AnnotationsTest class ....");
    }
}
