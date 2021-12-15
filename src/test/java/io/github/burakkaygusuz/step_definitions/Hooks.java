package io.github.burakkaygusuz.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.burakkaygusuz.config.BaseDriver;
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
    public synchronized void beforeScenario() throws MalformedURLException {
        baseDriver.setDriver(new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions()));

        baseDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        baseDriver.getDriver().manage().window().maximize();
        baseDriver.getDriver().get("https://selenium.dev");
    }

    @After
    public synchronized void afterScenario() {
        baseDriver.getDriver().quit();
    }

}
