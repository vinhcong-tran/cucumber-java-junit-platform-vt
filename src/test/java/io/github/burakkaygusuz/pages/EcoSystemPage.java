package io.github.burakkaygusuz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EcoSystemPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement mainHeader;
    @FindBy(css = "#browser-drivers")
    private WebElement subHeader;
    @FindBy(css = "div.col-sm-4")
    private WebElement dataTable;

    public EcoSystemPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getMainHeaderText() {
        return mainHeader.getText();
    }

    public String getSubHeaderText() {
        return subHeader.getText();
    }

    public void scrollToBrowserDrivers() {
        actions.sendKeys(Keys.DOWN).build().perform();
    }

    public List<WebElement> getSupportedWebDrivers() {
        return dataTable.findElements(By.cssSelector("p.card-title a"));
    }
}
