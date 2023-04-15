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
Feature: Scenarios related to Tree

  Background: Background steps
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/home"
    And User Enters username as "Khushboo" and Password as "Test@123"
    And Click on Login
 
  
 @TS_002_TC01
  Scenario: User click Data Structures dropdown menu and select Tree  
    Given User is on home page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/home"
    When User click on "Get started" page 
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/"
    
  @TS_002_TC02
  Scenario: User is on Tree page and able click on "Overview of Trees"
    Given User is on Tree page
    When The user is navigated to "https://dsportalapp.herokuapp.com/tree/"
    When The user click "Overview of Trees"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/overview-of-trees/"
    
  @TS_002_TC03
  Scenario: User is on Tree page and click try here in overview of trees 
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/overview-of-trees/"
    When The user click on "Try here"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tryEditor"
    
  @TS_002_TC04
  Scenario: User is on Tree page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/overview-of-trees/"  
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
  @TS_002_TC05
  Scenario: User is on Tree page  write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/overview-of-trees/"  
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
    
  @TS_003_TC01
  Scenario: User is on Tree page and click on Terminologies
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on second link "Terminologies"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/terminologies/"
    
  @TS_003_TC02
  Scenario: User is on Terminologies on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/terminologies/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_003_TC03
  Scenario: User is on Tree page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/terminologies/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
     @TS_003_TC04
  Scenario: User is on Tree page and write invalid code in Try here
      When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/terminologies/" 
      When The user click on "Try here"
      When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
    
     @TS_004_TC01
  Scenario: User is on Tree page and click on types-of-trees
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on third link "types-of-trees"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/types-of-trees/"
    
  @TS_004_TC02
  Scenario: User is on types-of-trees on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/types-of-trees/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_004_TC03
  Scenario: User is on Types of tree  and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/types-of-trees/"
     When The user click on "Try here"
     When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_004_TC04
  Scenario: User is on Types of tree and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/types-of-trees/"
     When The user click on "Try here"
     When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
    
     @TS_005_TC01
  Scenario: User is on Tree page and click on tree-traversals
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on fourth link "tree-traversals"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/tree-traversals/"
    
  @TS_005_TC02
  Scenario: User is on tree-traversals on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/tree-traversals/"
    #When The user is scorlled down and click on "Try here"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_005_TC03
  Scenario: User is on Ttree-traversals page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/tree-traversals/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_005_TC04
  Scenario: User is on tree-traversals page and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/tree-traversals/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
    @TS_006_TC01
  Scenario: User is on Tree page and click on traversals-illustration/
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on traversal illustration "traversals-illustration/"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/traversals-illustration/"
    
  @TS_006_TC02
  Scenario: User is on traversals-illustration on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/traversals-illustration/"
    #When The user is scorlled down and click on "Try here"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_006_TC03
  Scenario: User is on traversals-illustration page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/traversals-illustration/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_006_TC04
  Scenario: User is on traversals-illustration page and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/traversals-illustration/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
    
      @TS_007_TC01
  Scenario: User is on Tree page and click on binary-trees
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on binary tree "binary-trees"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/binary-trees"
    
  @TS_007_TC02
  Scenario: User is on binary-trees on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-trees/"
    #When The user is scorlled up and click on "Try here"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_007_TC03
  Scenario: User is on binary-trees page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-trees/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_007_TC04
  Scenario: User is on binary-trees page and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-trees/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
    
  @TS_008_TC01
  Scenario: User is on Tree page and click on types-of-binary-trees
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on types of binary trees "types-of-binary-trees/"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/"
    
  @TS_008_TC02
  Scenario: User is on types-of-binary-trees/ on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_008_TC03
  Scenario: User is on types-of-binary-trees/ page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_008_TC04
  Scenario: User is on types-of-binary-trees page and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
    
     @TS_009_TC01
  Scenario: User is on Tree page and click on implementation-in-python
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on implementation in python "implementation-in-python/"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/implementation-in-python/"
    
  @TS_009_TC02
  Scenario: User is on implementation-in-python on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-in-python/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_009_TC03
  Scenario: User is on implementation-in-python page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-in-python/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_009_TC04
  Scenario: User is on implementation-in-python page and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-in-python/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
    
    
    @TS_0010_TC01
  Scenario: User is on Tree page and click on binary-tree-traversals/
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on binary tree traversals "binary-tree-traversals/"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/"
    
  @TS_0010_TC02
  Scenario: User is on binary-tree-traversals on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_0010_TC03
  Scenario: User is on binary-tree-traversals page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_0010_TC04
  Scenario: User is on binary-tree-traversals page and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
  
   @TS_0011_TC01
  Scenario: User is on Tree page and click on implementation-of-binary-trees
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on implementation of tree "implementation-of-binary-trees"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/"
    
  @TS_0011_TC02
  Scenario: User is on implementation-of-binary-trees on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_0011_TC03
  Scenario: User is on implementation-of-binary-trees page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_0011_TC04
  Scenario: User is on implementation-of-binary-trees and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
  
   @TS_0012_TC01
  Scenario: User is on Tree page and click on applications-of-binary-trees
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on apps of binary tree "applications-of-binary-trees/"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/"
    
  @TS_0012_TC02
  Scenario: User is on implementation-of-applications-of-binary-trees on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_0012_TC03
  Scenario: User is on applications-of-binary-trees page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_0012_TC04
  Scenario: User is on applications-of-binary-trees and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
   @TS_0013_TC01
  Scenario: User is on Tree page and click on binary-search-trees
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click on binary search tree "binary-search-trees"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/binary-search-trees"
    
  @TS_0013_TC02
  Scenario: User is on binary-search-trees on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-search-trees/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_0013_TC03
  Scenario: User is on binary-search-trees page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-search-trees/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_0013_TC04
  Scenario: User is on binary-search-trees and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/binary-search-trees/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
    
     @TS_0014_TC01
  Scenario: User is on Tree page and click on implementation-of-bst
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/"
    When The user click implementation of bst "implementation-of-bst"
    Then The user is redirected to "https://dsportalapp.herokuapp.com/tree/implementation-of-bst/"
    
  @TS_0014_TC02
  Scenario: User is on implementation-of-bst on Tree page
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-of-bst/"
    When The user click on "Try here"
    Then The user is navigated to "https://dsportalapp.herokuapp.com/tryEditor"
    
     @TS_0014_TC03
  Scenario: User is on implementation-of-bst page and write valid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-of-bst/"
    When The user click on "Try here"
    When The user should write 'print("hi")' in tryhere;
    Then The user should see "hi" printed in blank space.
    
   @TS_0014_TC04
  Scenario: User is on implementation-of-bst and write invalid code in Try here
    When The user is navigated to  page "https://dsportalapp.herokuapp.com/tree/implementation-of-bst/"
    When The user click on "Try here"
    When The user should write 'printh("hi")' in tryhere;
    Then The user should get popup "NameError: name 'printh' is not defined on line 1"
  
