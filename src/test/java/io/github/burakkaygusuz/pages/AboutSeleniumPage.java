package io.github.burakkaygusuz.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class AboutSeleniumPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(xpath = "//a[normalize-space()='View ecosystem']")
    private WebElement viewEcoSystemButton;

    public AboutSeleniumPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return header.getText();
    }

    public void clickViewEcoSystemButton() {
        actions.sendKeys(Keys.DOWN).build().perform();
        viewEcoSystemButton.click();
    }
}
