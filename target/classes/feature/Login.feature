Feature: Login functionality

  Background: Land to Home page
    Given Go to login page

  @Regression
  Scenario: Positive: Login with valid credential as Admin
    Given Enter "naka" in username or Email input field
    And Enter "nana&K81" in password input field
    When user click on login button
    Then user should successfully logged in


