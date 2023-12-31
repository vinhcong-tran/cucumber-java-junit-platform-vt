package io.github.burakkaygusuz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class AboutSeleniumPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement header;

    @FindBy(css = "div[class='row -bg-selenium-green-45'] h2")
    private WebElement seleniumEcosystemHeader;
    @FindBy(css = "div[class='row -bg-selenium-green-45'] a")
    private WebElement viewEcoSystemButton;

    public AboutSeleniumPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getHeaderText() {
        return header.getText();
    }

    public void clickViewEcoSystemButton() {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", seleniumEcosystemHeader);
        viewEcoSystemButton.click();
    }
}
