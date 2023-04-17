Feature: Scenarios related to Tree

  #Background:
  #Scenario: related to Tree
  #Given User Launch Chrome browser
  #When User opens URL "https://dsportalapp.herokuapp.com/home"
  #And User Enters username as "<username>" and Password as "<password>"
  #And Click on Login
  #Examples:
  #
  #| username   |password|
  #
  #| Employee_1 |Welc@345|
  #
  #| Employee_2 |Test@123|
  #
  #| Khushboo   |Welc@345|
  #
  #| Khushboo   |Test@123|
  #Scenario: Test the valid login using datatable
    #Given User Launch Chrome browser
    #When User opens URL "https://dsportalapp.herokuapp.com/home"
    #When User enters Credentials to LogIn
      #| Username   | Password |
       #| testuser_2 | Test@154 |
    #| Khushboo | Test@123 |
   #
    #And Click on Login

    @InValidCredentials
Scenario: Login with invalid credentials
 
  Given User is on HRMLogin page
  When User enters invalid credentials and Login will be unsuccessful with custom error messages
    | Username    | Password  | ErrorMessage         |
    | Admin1      | admin123! | Invalid credentials  |
    | Admina      | admin123a | Invalid credentials  |