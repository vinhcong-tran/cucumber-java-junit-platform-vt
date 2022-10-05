package io.github.burakkaygusuz.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.burakkaygusuz.config.BaseDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class Hooks {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(Hooks.class.getName());
    private final BaseDriver baseDriver;

    public Hooks(BaseDriver baseDriver) {
        this.baseDriver = baseDriver;
    }

    @Before
        LOGGER.info("Scenario: " + scenario.getName() + " started");
        baseDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        baseDriver.getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario) {
        baseDriver.getDriver().quit();
        LOGGER.info("Scenario: " + scenario.getName() + " finished.Status: " + scenario.getStatus());
    }
}
