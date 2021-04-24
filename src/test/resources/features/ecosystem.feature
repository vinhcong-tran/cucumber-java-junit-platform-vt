Feature: Selenium EcoSystem

  Scenario Outline: Verify the current drivers
    Given I want to get information from "About Selenium" page
    When I go the ecosystem page
    And I view the browser drivers list
    Then I should see the "<webDriver>"
    Examples: Drivers
      | webDriver             |
      | Google ChromeDriver   |
      | Microsoft Edge Driver |
      | Mozilla GeckoDriver   |
      | Opera ChromiumDriver  |
      | Apple SafariDriver    |



