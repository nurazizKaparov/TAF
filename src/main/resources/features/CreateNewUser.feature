Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page
    Given Enter "nuta" in UserName or Email input field
    And Enter "HelloWorld312!" in password input field
    When user click on login button
    Then user should successfully logged in

    @smoke
    Scenario: Positive: Create new user
      Given user should click Add user button in Admin Home page
      And verify following field names are displayed
        | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
      And enter following data to create new user
        | firstName | lastName | emailAddress | userName | password |
        | Elon       |Musk      |musl@tesla.com|elaon     |VeryH@rdP@$$312|
        | Leo        |Messi     |messi@asd.com |messi     |VeryH@rdP@$$3|



