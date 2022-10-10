  @Smoke
  Feature: Login functionality

  Background: Land to Home page
    Given Go to login page


  Scenario: Positive: Login with valid credentials as Admin
    Given Enter "nuta" in UserName or Email input field
    And Enter "HelloWorld312!" in password input field
    When user click on login button
    Then user should successfully logged in