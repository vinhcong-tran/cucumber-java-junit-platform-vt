package io.github.burakkaygusuz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(RemoteWebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'About')]")
    private WebElement aboutNavItem;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    private WebElement aboutSubNavItem;

    public void goToAboutPage() {
        aboutNavItem.click();
        aboutSubNavItem.click();
    }
}
