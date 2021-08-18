package io.github.burakkaygusuz.step_definitions;

import io.github.burakkaygusuz.config.BaseDriver;
import io.github.burakkaygusuz.pages.AboutPage;
import io.github.burakkaygusuz.pages.EcoSystemPage;
import io.github.burakkaygusuz.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EcoSystemStepDefinitions {

    private final HomePage homePage;
    private final AboutPage aboutPage;
    private final EcoSystemPage ecoSystemPage;

    public EcoSystemStepDefinitions(BaseDriver baseDriver) {
        RemoteWebDriver driver = baseDriver.getDriver();
        homePage = new HomePage(driver);
        aboutPage = new AboutPage(driver);
        ecoSystemPage = new EcoSystemPage(driver);
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
