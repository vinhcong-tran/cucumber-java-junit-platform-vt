package com.burakkaygusuz.bdd.step_definitions;

import com.burakkaygusuz.bdd.pages.AboutPage;
import com.burakkaygusuz.bdd.pages.EcoSystemPage;
import com.burakkaygusuz.bdd.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EcoSystemStepDefinitions {

    private RemoteWebDriver driver;
    private HomePage homePage;
    private AboutPage aboutPage;
    private EcoSystemPage ecoSystemPage;

    @Before
    public void before() {
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://selenium.dev");

        homePage = new HomePage(driver);
        aboutPage = new AboutPage(driver);
        ecoSystemPage = new EcoSystemPage(driver);
    }

    @After
    public void after() {
        if (driver != null)
            driver.quit();
    }

    @Given("I want to get information from {string} page")
    public void iWantToGetInformationIntoPage(String headerName) {
        homePage.goToAboutPage();
        assertThat(aboutPage.getHeader().getText()).isEqualTo(headerName);
    }

    @When("I go the ecosystem page")
    public void iGoTheEcosystemPage() {
        aboutPage.clickViewEcoSystemButton();
    }

    @And("I view the browser drivers list")
    public void iViewTheBrowserDriversList() {
        ecoSystemPage.gotToBrowserDriversTable();
    }

    @Then("I should see the {string}")
    public void iShouldSeeThe(String webDriver) {
        List<String> currentBrowsers = new ArrayList<>();

        for (int i = 0; i < ecoSystemPage.getDriverList().size(); i++) {
            currentBrowsers.add(ecoSystemPage.getDriverList().get(i).getText());
        }

        assertThat(currentBrowsers).contains(webDriver);
    }
}
