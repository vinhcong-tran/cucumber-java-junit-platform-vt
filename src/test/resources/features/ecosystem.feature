Feature: Selenium EcoSystem

  Background: Open Selenium page URL
    Given the user navigates to "https://selenium.dev"

  Scenario Outline: Verify the supported browsers
    Given the user would like to get further information by "About Selenium"
    When views the "Ecosystem" page
    And observes the "Browser Drivers"
    Then should see the supported web drivers
      | webDriver   |
      | <webDriver> |

    Examples: Supported WebDrivers
      | webDriver            |
      | Google ChromeDriver  |
      | Microsoft EdgeDriver |
      | Mozilla GeckoDriver  |
      | Opera ChromiumDriver |
      | Apple SafariDriver   |