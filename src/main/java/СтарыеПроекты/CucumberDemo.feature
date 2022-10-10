Feature: Feature in one functionality
@smoke
  Scenario: We give a scenario name(Deposit within allowed range)
    # Given - step are used for precondition
    Given User is logged in to Demir account
    # When Action -
    When User deposit 1000$ to Atay
    # Then Validation
    Then Atay should have 1200$ in balance

  @smoke
  Scenario: Deposit above threshold limit
    Given User is logged in to Demir account
    When User deposit $50000 to Nuraziz
    Then Nuraziz should not have 500000 in balance


  Scenario: Deposit negative value
  #Precondition
    Given User is logged in to chase account
    And   User has 300 in the account
  #Action
    When  User deposits -10 to John Doe
  #Validation
    Then  User should have 300
    And   John Doe Should not any deposits


  Scenario: Withdraw within the limit
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    And User deposits $1000.00
    When User withdraws $1000.00
    Then User should have $0.0 in account


  Scenario: Withdraw over the limit
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    And User deposits $1000.00
    When User withdraws $1500.00
    Then User should have $1000.0 in account


  Scenario: Withdraw with insufficient funds from initial balance
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    When User withdraws $10.00
    Then User should have $0.0 in account


  Scenario: Withdraw from 0 balance
    Given User account with accountNumer 234523453245 and routing number 123456789 is opened
    And User deposits $-1000.00
    When User withdraws $10.00
    Then User should have $0.0 in account



