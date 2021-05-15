package com.testng.runallpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization {

    @Test
    @Parameters("browser")
    public void browser(String browser) {
        System.out.println("Browser is: " + browser);
    }

    @Test
    @Parameters({"username", "password"})
    public void credentials(String username, String password) {
        System.out.println("Parameter for username is: " + username);
        System.out.println("Parameter for password is: " + password);
    }
}
