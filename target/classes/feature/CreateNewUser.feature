Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page
    Given Enter "naka" in username or Email input field
    And Enter "nana&K81" in password input field
    When user click on login button
    Then user should successfully logget in

  @Regression
    Scenario: Positive :Create new user
      Given user shoud click Add user button in Admin Home page
      And verify following field names are displayed
      |First name|last name|Email adress|Username|Password|Bio|User type|Time zone|Language|
      And enter following data to create new user
        |firstName|lastName|emailAddress  |userName|Password  |
        |Elon     |Musk    |musl@tesla.com|elaon   |Very12345#|
        |Leo      |Messi   |mess@tmail.com|messi   |Mess12345#|
