#Author: leomiro1 arroba yahoo.com

Feature: Automation Exercise

  Scenario: Going to www.seleniumhq.org Page
    Given user is on "www.google.com"
    When user types "Seleniumhq" in the searchbox
    And user press "ENTER" in the searchbox
    And user clicks on "Selenium HQ" link
    Then user is on Selenium HQ Page
