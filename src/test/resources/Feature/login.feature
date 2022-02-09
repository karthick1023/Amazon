Feature: Login functionality of amazon

  Scenario Outline: Open amazon website and validate invalid data for login functionality
    Given User should be on amazon home page
    When User should navigate to login page and fill "<email>"
    And User click on continue button
    And User has to fill "<password>" and click login button
    Then User should see the error message

    Examples: 
      | email            | password |
      | karthi@gmail.com |  0987654 |
