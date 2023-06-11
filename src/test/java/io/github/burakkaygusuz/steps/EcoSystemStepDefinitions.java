package io.github.burakkaygusuz.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.burakkaygusuz.config.BaseDriver;
import io.github.burakkaygusuz.pages.AboutSeleniumPage;
import io.github.burakkaygusuz.pages.EcoSystemPage;
import io.github.burakkaygusuz.pages.HomePage;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class EcoSystemStepDefinitions {

    private final HomePage homePage;
    private final AboutSeleniumPage aboutSeleniumPage;
    private final EcoSystemPage ecoSystemPage;
    private final RemoteWebDriver driver;

    public EcoSystemStepDefinitions(BaseDriver baseDriver) {
        driver = baseDriver.getDriver();
        homePage = new HomePage(driver);
        aboutSeleniumPage = new AboutSeleniumPage(driver);
        ecoSystemPage = new EcoSystemPage(driver);
    }

    @Given("the user navigates to the official {string} page")
    public void theUserNavigatesToTheOfficialPage(String page) {
        driver.navigate().to("https://www.selenium.dev");
        assertThat(driver.getTitle()).isEqualTo(page);
    }

    @And("they would like to get further information by {string}")
    public void theyWouldLikeToGetFurtherInformationBy(String header) {
        homePage.goToAboutSeleniumPage();
        assertThat(aboutSeleniumPage.getHeaderText())
                .withFailMessage(() -> "Main header text should be %s but %s".formatted(aboutSeleniumPage.getHeaderText(), header))
                .isEqualTo(header);
    }

    @When("views the {string} page")
    public void viewsThePage(String header) {
        aboutSeleniumPage.clickViewEcoSystemButton();
        assertThat(ecoSystemPage.getMainHeaderText())
                .withFailMessage(() -> "Main header text should be %s but %s".formatted(ecoSystemPage.getMainHeaderText(), header))
                .isEqualTo(header);
    }

    @And("observes the {string}")
    public void observesThe(String subHeader) {
        ecoSystemPage.scrollToBrowserDrivers();
        assertThat(ecoSystemPage.getSubHeaderText())
                .withFailMessage(() -> "Sub header text should be %s but %s".formatted(ecoSystemPage.getSubHeaderText(), subHeader))
                .isEqualTo(subHeader);
    }

    @Then("the supported web drivers should be listed")
    public void theSupportedWebDriversShouldBeListed(DataTable dataTable) {
        List<Map<String, String>> webDrivers = dataTable.asMaps(String.class, String.class);
        String webDriver = webDrivers.get(0).get("webDriver");
        List<String> supportedWebDrivers = new ArrayList<>();

        ecoSystemPage.getSupportedWebDrivers().forEach(wd -> supportedWebDrivers.add(wd.getText()));
        assertThat(supportedWebDrivers).isNotNull().containsAnyOf(webDriver);
    }


}
