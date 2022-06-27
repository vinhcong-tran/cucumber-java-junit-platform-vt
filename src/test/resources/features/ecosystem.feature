Feature: Selenium EcoSystem

  Background: Open Selenium page URL
    Given the user navigates to "https://selenium.dev"

  Scenario: Verify the supported browsers
    When would like to get further information by "About Selenium"
    And views the "Ecosystem" page
    And observes the "Browser Drivers"
    Then should see the supported web drivers
      | webDriver            |
      | Mozilla GeckoDriver  |
      | Microsoft EdgeDriver |
      | Google ChromeDriver  |
      | Opera ChromiumDriver |
      | Apple SafariDriver   |