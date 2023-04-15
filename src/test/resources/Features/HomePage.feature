#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Home Page
  I want to use this template for my feature file

  @TS_001_TC01
  Scenario: User launch home page of an dsalgo project
    Given User launch browser
    When The user opens DS Algo portal link "https://dsportalapp.herokuapp.com/"
    And The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    And Close browser

  @TS_001_TC02
  Scenario: User is on Home page and click on Get Started button without sign in
    Given User launch browser
    When The user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    When The user clicks on "Get Started" button of Data Structures without login
    Then The user get warning message "You are not logged in"
    And Close browser
    
  @TS_001_TC03
  Scenario: User click Data Structures dropdown menu and select Arrays  
    Given User launch browser
    When The user is navigated to home page "https://dsportalapp.herokuapp.com/home"
    When The user click Data Structures dropdown menu and select Arrays options
    Then The user get warning message "You are not logged in"
    And Close browser
    
 