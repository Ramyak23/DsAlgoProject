@tag
Feature: DataStructures Introduction

      Background: Given User starts browser
                  Then The user enters the home page url 
                  And Click signin button
                  Given User enters username as "ramya23" and password as "ninja1234"
                  And Click Login button
                  Then Success message "You are logged in" is displayed
   
                
  @TS_002_TC01
  Scenario: User validate DataStructures-Introduction and Time Complexity page
    Given User clicks on Get Started button of Data Structures-Introduction tab
    When User click time complexity link in data structures page
    And User clicks Try Here button in time complexity page
    Then User navigated to tryEditor page and enters the Python code as "print('DataStructures')"
    And Clicks Run button and gets the output
 
   @TS_002_TC02
   Scenario: User validate DataStructures-Introduction and Time Complexity page with wrong python code
    Given User clicks on Get Started button of Data Structures-Introduction tab
    When User click time complexity link in data structures page
    And User clicks Try Here button in time complexity page
    Then User navigated to tryEditor page and enters the incorrect Python code syntax as "Hello"
    And Clicks Run button and gets the popup error message