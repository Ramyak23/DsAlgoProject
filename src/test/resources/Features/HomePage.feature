@tag
Feature: Home Page

  @TS_001_TC01
  Scenario: User launch home page of an dsalgo project
    Given User launch browser
    When The user opens DS Algo portal link
    And The user clicks the Get Started button
    Then The user should be redirected to homepage
    And Close browser

  @TS_001_TC02
  Scenario: User is on Home page and click on Get Started button of one module without sign in
    Given User launch browser
    When The user is navigated to home page
    When The user clicks on Get Started button of Data Structures without login
    Then The user get warning message "You are not logged in"
    And Close browser

  @TS_001_TC03
  Scenario: User is on home page and clicking on Data Structures dropdown menu
    Given User is on home page
    When User clicks Data Structures dropdown menu
    Then User should be able to see list of all the options in the dropdown

  @TS_001_TC04
  Scenario: User click Data Structures dropdown menu and select Arrays
    Given User launch browser
    When The user is navigated to home page
    When The user click Data Structures dropdown menu and select Arrays options
    Then The user get warning message "You are not logged in"
    And Close browser

  @TS_001_TC05
  Scenario: User clicks on Register link in home page
    Given User is on home page
    When User clicks on Register link
    Then User should land in the Register page

  @TS_001_TC06
  Scenario: User clicks on Sign in link in home page
    Given User is on home page
    When User clicks on Sign in link
    Then User should land in the Login page
