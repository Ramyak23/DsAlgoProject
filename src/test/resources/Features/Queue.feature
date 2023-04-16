@tag
Feature: Queue feature
  
          Background: 
                  Given User is on home page and clicks signin button
                  Then User enters username and password
                  And Clicks Login button
                  Then User gets success login message 
                  
  @TS_007_TC01
  Scenario: User validates Queue page
    Given User clicks on Get Started button of Queue in dsalgo home page
    When User click Implementation of Queue in Python link in Queue home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Queue |
    And Again clicks Run button and gets popup error message 
    
  @TS_007_TC02
  Scenario: User validates Queue page
    Given User clicks on Get Started button of Queue in dsalgo home page
    When User click Implementation using collections.deque link in Queue home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Queue |
    And Again clicks Run button and gets popup error message 
    
  @TS_007_TC03
  Scenario: User validates Queue page
    Given User clicks on Get Started button of Queue in dsalgo home page
    When User click Implementation using array link in Queue home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Queue |
    And Again clicks Run button and gets popup error message 
    
  @TS_007_TC04
  Scenario: User validates Queue page
    Given User clicks on Get Started button of Queue in dsalgo home page
    When User click Queue Operations link in Queue home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Queue |
    And Again clicks Run button and gets popup error message 