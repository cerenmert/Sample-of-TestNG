import org.testng.annotations.Test;

public class FacebookLogin {
    @Test
    public void tryToLoginWithValidCredentials() {
        System.out.println("Successful login");
    }

    @Test
    public void tryToLoginWithInvalidCredentials() {
        System.out.println("Unsuccessful login");
    }
}
