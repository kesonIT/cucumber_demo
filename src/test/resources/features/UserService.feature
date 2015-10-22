Feature: Login

  Scenario: user with valid userName and password can successfully login to system
    Given user login
    
    When the login username is _userName,the password is _userName_password
    Then return true
    
    When the login username is _userName,the password is not _userName_password
    Then return false
    
    When the login username include:
      | keson  |
      | mike   |
      | yanni  |
      | uwen   |
      | steven |
    Then user in white list
    
    When the login username include:
      | 123 |
      | 456 |
      | 789 |
    Then user not in white list
    
    
    When the login username include text: xxx,yyy
    Then user not in white list
     
    When I'm a variable
    Then output my value:_variable
