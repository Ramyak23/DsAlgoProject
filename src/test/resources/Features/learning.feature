Feature: Scenarios related to Tree

  Background: 
  Scenario Outline: related to Tree
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/home"
    And User Enters username as "<username>" and Password as "<password>"
    And Click on Login
    Examples:

    | username | password |

    | Employee_1 | Welc@345 |

    | Employee_2 | Test@123 |
    
    | Khushboo   | Welc@345 |
    
    | Khushboo  | Test@123 |