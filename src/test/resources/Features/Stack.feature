@tag
Feature: Stack feature

      Background: 
                  Given User is on home page and clicks signin button
                  Then User enters username and password
                  And Clicks Login button
                  Then User gets success login message 
   
                
    @TS_005_TC01
    Scenario: User validate Stack page
    Given User clicks on Get Started button of Stack in home page
    When User click Operations in Stack link in Stack home page
    And Clicks Try Here button in Operations in Stack page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Operations in Stack" |
    And Clicks Run button and gets the respected output
    
    
    @TS_005_TC02
    Scenario: User validate Stack page with wrong python code
    Given User clicks on Get Started button of Stack in home page
    When User click Operations in Stack link in Stack home page
    And Clicks Try Here button in Operations in Stack page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Stack |
    And Clicks Run button and gets popup error message 

    
    @TS_005_TC03
    Scenario: User validate Stack page
    Given User clicks on Get Started button of Stack in home page
    When User click Implementation link in Stack home page
    And Clicks Try Here button in Implementation page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Implementation" |
    And Clicks Run button and gets the respected output
    
    
    @TS_005_TC04
    Scenario: User validate Stack page with wrong python code
    Given User clicks on Get Started button of Stack in home page
    When User click Implementation link in Stack home page
    And Clicks Try Here button in Implementation page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Stack |
    And Clicks Run button and gets popup error message 
    
    
    @TS_005_TC05
    Scenario: User validate Stack page
    Given User clicks on Get Started button of Stack in home page
    When User click Applications link in Stack home page
    And Clicks Try Here button in Applications page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Applications" |
    And Clicks Run button and gets the respected output
    
    
    @TS_005_TC06
    Scenario: User validate Stack page with wrong python code
    Given User clicks on Get Started button of Stack in home page
    When User click Applications link in Stack home page
    And Clicks Try Here button in Applications page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Stack |
    And Clicks Run button and gets popup error message 