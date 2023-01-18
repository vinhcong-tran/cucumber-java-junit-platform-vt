package io.github.burakkaygusuz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "li[class='nav-item dropdown'] a[id='navbarDropdown']")
    private WebElement aboutNavBarItem;
    @FindBy(css = "a[href='/about']")
    private WebElement aboutSeleniumDropDownItem;

    public HomePage(RemoteWebDriver driver) {
        super(driver);
    }

    public void goToAboutSeleniumPage() {
        aboutNavBarItem.click();
        aboutSeleniumDropDownItem.click();
    }
}
