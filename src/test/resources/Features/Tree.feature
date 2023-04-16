@tag
Feature: Tree feature
  
  Background: 
                  Given User is on home page and clicks signin button
                  Then User enters username and password
                  And Clicks Login button
                  Then User gets success login message 
                  
    @TS_008_TC01
    Scenario: User validates Overview of Trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Overview of Trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Overview of Trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC02
    Scenario: User validates Terminologies page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Terminologies link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Terminologies" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC03
    Scenario: User validates Types of Trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Types of Trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Types of Trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC04
    Scenario: User validates Tree Traversals page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Tree Traversals link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Tree Traversals" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC05
    Scenario: User validates Traversals-Illustration page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Traversals-Illustration link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Traversals-Illustration" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC06
    Scenario: User validates Binary Trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Binary Trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Binary Trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC07
    Scenario: User validates Types of Binary trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Types of Binary trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Types of Binary trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC08
    Scenario: User validates Implementation in Python page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Implementation in Python link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Implementation in Python" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC09
    Scenario: User validates Binary Tree Traversals page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Binary Tree Traversals link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Binary Tree Traversals" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC10
    Scenario: User validates Implementation of Binary Trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Implementation of Binary Trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Implementation of Binary Trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC11
    Scenario: User validates Applications of Binary trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Applications of Binary trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Applications of Binary trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC12
    Scenario: User validates Binary Search Trees page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Binary Search Trees link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Binary Search Trees" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    @TS_008_TC13
    Scenario: User validates Implementation Of BST page
    Given User clicks on Get Started button of Tree in dsalgo home page
    When User click Implementation Of BST link in Tree home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Implementation Of BST" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Tree |
    And Again clicks Run button and gets popup error message 
    
    
    
    
    
    
    
    