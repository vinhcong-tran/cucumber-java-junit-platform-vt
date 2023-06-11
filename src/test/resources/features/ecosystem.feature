Feature: Selenium EcoSystem

  Background: Open Selenium page URL
    Given the user navigates to the official "Selenium" page

  Scenario: Verify the supported browsers
    When they would like to get further information by "About Selenium"
    And views the "Ecosystem" page
    And observes the "Browser Drivers"
    Then the supported web drivers should be listed
      | webDriver            |
      | Mozilla GeckoDriver  |
      | Microsoft EdgeDriver |
      | Google ChromeDriver  |
      | Opera ChromiumDriver |
      | Apple SafariDriver   |