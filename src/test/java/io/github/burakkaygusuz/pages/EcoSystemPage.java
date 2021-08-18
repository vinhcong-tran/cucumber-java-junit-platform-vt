package io.github.burakkaygusuz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EcoSystemPage extends BasePage {

    public EcoSystemPage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'Browser Drivers')]")
    private WebElement browserDriversHeader;

    public void gotToBrowserDriversTable() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", browserDriversHeader);
    }

    public List<WebElement> getDriverList() {
        WebElement dataTable = driver.findElement(By.className("data-list"));
        return dataTable.findElements(By.xpath("//td[@data-label='Browser']"));
    }
}
