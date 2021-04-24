package com.burakkaygusuz.bdd.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class AboutPage extends BasePage {

    public AboutPage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(css = "body > section > h1")
    private WebElement header;

    @FindBy(xpath = "//b[contains(text(),'VIEW ECOSYSTEM')]")
    private WebElement viewEcoSystemButton;

    public WebElement getHeader() {
        return header;
    }

    public void clickViewEcoSystemButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewEcoSystemButton);
        viewEcoSystemButton.click();
    }
}
