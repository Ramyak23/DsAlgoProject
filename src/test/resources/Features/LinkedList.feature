@tag
Feature: LinkedList feature
 

  Background: 
                  Given User is on home page and clicks signin button
                  Then User enters username and password
                  And Clicks Login button
                  Then User gets success login message 
                  
    @TS_009_TC01
    Scenario: User validates Introduction-LinkedList page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Introduction link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Introduction of LinkedList" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
       
    @TS_009_TC02
    Scenario: User validates Creating Linked LIst page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Creating Linked LIst link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Creating Linked LIst" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_009_TC03
    Scenario: User validates Types of Linked List page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Types of Linked List link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Types of Linked List" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_009_TC04
    Scenario: User validates Implement Linked List in Python page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Implement Linked List in Python link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Implement Linked List in Python" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_009_TC05
    Scenario: User validates Traversal page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Traversal link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Traversal" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_009_TC06
    Scenario: User validates Insertion page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Insertion link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Insertion" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    @TS_009_TC07
    Scenario: User validates Deletion page
    Given User clicks on Get Started button of LinkedList in dsalgo home page
    When User click Deletion link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Deletion" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    