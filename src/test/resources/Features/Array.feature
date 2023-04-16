@tag
Feature: Array feature
 
    Background: 
                  Given User is on home page and clicks signin button
                  Then User enters username and password
                  And Clicks Login button
                  Then User gets success login message 
                  
                  
    @TS_0010_TC01
    Scenario: User validates Arrays in Python page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Arrays in Python link in Array home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Arrays in Python" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_0010_TC02
    Scenario: User validates Arrays Using List page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Arrays Using List link in Array home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Arrays Using List" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_0010_TC03
    Scenario: User validates Basic Operations in Lists page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Basic Operations in Lists link in Array home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Basic Operations in Lists" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_0010_TC04
    Scenario: User validates Applications of Array page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Applications of Array link in Array home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Applications of Array" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_0010_TC05
    Scenario: User validates Practice Questions page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Practice Questions link in Arrays in python page
    Then User navigated to array practice page with respective four practice link
    
    
    @TS_0010_TC06
    Scenario: User validates Search the array page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Practice Questions link in Arrays in python page
    And User navigated to array practice page and clicks Search the array practice link
    Then User enters the Python code in the respective field
               |pythoncode  | print"Search the array" |
    Then Clicks Run button and gets the respected output
    Then User validates with the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
    @TS_0010_TC07
    Scenario: User validates Max Consecutive Ones page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Practice Questions link in Arrays in python page
    And User navigated to array practice page and clicks Max Consecutive Ones practice link
    Then User enters the Python code in the respective field
               |pythoncode  | print"Max Consecutive Ones" |
    Then Clicks Run button and gets the respected output
    Then User validates with the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message    
    
    
    @TS_0010_TC08
    Scenario: User validates Find Numbers with Even Number of Digits page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Practice Questions link in Arrays in python page
    And User navigated to array practice page and clicks Find Numbers with Even Number of Digits practice link
    Then User enters the Python code in the respective field
               |pythoncode  | print"Find Numbers with Even Number of Digits" |
    Then Clicks Run button and gets the respected output
    Then User validates with the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message   
    
    
    @TS_0010_TC09
    Scenario: User validates Squares of  a Sorted Array page
    Given User clicks on Get Started button of Array in dsalgo home page
    When User click Practice Questions link in Arrays in python page
    And User navigated to array practice page and clicks Squares of a Sorted Array practice link
    Then User enters the Python code in the respective field
               |pythoncode  | print"Squares of a Sorted Array" |
    Then Clicks Run button and gets the respected output
    Then User validates with the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message   