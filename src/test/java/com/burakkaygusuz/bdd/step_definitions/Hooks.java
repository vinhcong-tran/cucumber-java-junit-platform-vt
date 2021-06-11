package com.burakkaygusuz.bdd.step_definitions;

import com.burakkaygusuz.bdd.config.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Hooks {

    private final BaseDriver baseDriver;

    public Hooks(BaseDriver baseDriver) {
        this.baseDriver = baseDriver;
    }

    @Before()
    public void beforeScenario() throws MalformedURLException {
        baseDriver.setDriver(new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions()));

        baseDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        baseDriver.getDriver().manage().window().maximize();
        baseDriver.getDriver().get("http://selenium.dev");
    }

    @After
    public void afterScenario() {
        baseDriver.getDriver().quit();
    }

}
