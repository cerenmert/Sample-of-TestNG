import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SampleSuitAnnotation {
    @BeforeSuite
    public void beforeSuitMethod() {
        System.out.println("Execute before the test suite");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("Execute after the test suite");
    }
}
