package io.github.burakkaygusuz.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected RemoteWebDriver driver;
    protected JavascriptExecutor javascriptExecutor;

    public BasePage(RemoteWebDriver driver) {
        this.driver = driver;
        javascriptExecutor = driver;
        PageFactory.initElements(driver, this);
    }
}
