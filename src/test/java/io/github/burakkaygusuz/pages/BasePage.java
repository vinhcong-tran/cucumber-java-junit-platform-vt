package io.github.burakkaygusuz.pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected RemoteWebDriver driver;
    protected Actions actions;

    public BasePage(RemoteWebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
}
