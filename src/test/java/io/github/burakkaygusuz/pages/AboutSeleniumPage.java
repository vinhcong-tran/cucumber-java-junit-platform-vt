package io.github.burakkaygusuz.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class AboutSeleniumPage extends BasePage {

    public AboutSeleniumPage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#td-cover-block-0 > div > div > div > div > h1")
    private WebElement header;

    @FindBy(xpath = "//a[normalize-space()='View ecosystem']")
    private WebElement viewEcoSystemButton;

    public WebElement getHeader() {
        return header;
    }

    public void clickViewEcoSystemButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewEcoSystemButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewEcoSystemButton);
    }
}
