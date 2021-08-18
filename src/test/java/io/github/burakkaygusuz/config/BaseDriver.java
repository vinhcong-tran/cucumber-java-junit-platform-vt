package io.github.burakkaygusuz.config;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseDriver {

    private final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public RemoteWebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(RemoteWebDriver driver) {
        this.driver.set(driver);
    }
}
