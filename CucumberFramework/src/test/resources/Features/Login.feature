Feature: To test Login functionlity
  
  Scenario: Cheack login is successfull
    Given User is on login page
    When Enter username and password
    And Click on login button
    Then you are on home page