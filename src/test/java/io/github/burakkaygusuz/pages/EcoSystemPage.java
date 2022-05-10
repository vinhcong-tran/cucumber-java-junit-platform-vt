package io.github.burakkaygusuz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EcoSystemPage extends BasePage {

    public EcoSystemPage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    private WebElement mainHeader;

    @FindBy(css = "#browser-drivers")
    private WebElement subHeader;

    public String getMainHeaderText() {
        return mainHeader.getText();
    }

    public String getSubHeaderText() {
        return subHeader.getText();
    }

    public void scrollToBrowserDrivers() {
        actions.moveToElement(subHeader).perform();
    }

    public List<WebElement> getSupportedWebDrivers() {
        WebElement dataTable = driver.findElement(By.xpath("//div[@class='col-sm-4 p-3']"));
        return dataTable.findElements(By.xpath("//p[@class='card-title font-weight-bold text-center h6']/a"));
    }
}
