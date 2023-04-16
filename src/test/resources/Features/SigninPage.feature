@tag
Feature: Signin feature

  @TS_003_TC01
  Scenario Outline: User validate signin page with valid credentials
    Given User is already on home page
    When User clicks signin button
    Then User should land in the login page
    And User enters "<username>" and "<password>"
    Then Clicks login button
    Then User gets success message as you are logged in

    Examples: 
      | username   | password   |
      | ramya23    | ninja1234  | 
      | ramya87    | ninja5678  |
      | ramya13    | ninja5624  |

  @TS_003_TC04
  Scenario Outline: User validate signin page with invalid credentials
    Given User is already on home page
    When User clicks signin button
    Then User should land in the login page
    And User enters "<username>" and "<password>"
    Then Clicks login button
    Then User should get a proper warning message    
    
    Examples: 
      | username      | password    |
      | numpyninja    | helloworld  | 