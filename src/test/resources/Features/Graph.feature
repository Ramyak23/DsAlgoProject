@tag
Feature: Graph feature

      Background: 
                  Given User is on home page and clicks signin button
                  Then User enters username and password
                  And Clicks Login button
                  Then User gets success login message 
   
                
  @TS_004_TC01
  Scenario: User validate Graph page
    Given User clicks on Get Started button of Graph in home page
    When User click Graph link in Graph home page
    And Clicks Try Here button in Graph page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Graph" |
    And Clicks Run button and gets the respected output
    
    
   @TS_004_TC02
   Scenario: User validate Graph page with wrong python code
    Given User clicks on Get Started button of Graph in home page
    When User click Graph link in Graph home page
    And Clicks Try Here button in Graph page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Graph |
    And Clicks Run button and gets popup error message 
    
    
  @TS_004_TC03
  Scenario: User validate Graph page
    Given User clicks on Get Started button of Graph in home page
    When User click Graph Representation link in Graph home page
    And Clicks Try Here button in Graph Representation page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Graph Representation" |
    And Clicks Run button and gets the respected output
    
   
   @TS_004_TC04
   Scenario: User validate Graph page with wrong python code
    Given User clicks on Get Started button of Graph in home page
    When User click Graph Representation link in Graph home page
    And Clicks Try Here button in Graph Representation page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Graph |
    And Clicks Run button and gets popup error message  
    