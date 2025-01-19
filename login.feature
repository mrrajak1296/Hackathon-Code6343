@RunAll
Feature: OrangHRM login page

  @Sanity
  Scenario Outline: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL
    And User enters <Username> and <Password>
    And Click on Loginbutton
    Then Page Title should be

    Examples: 
      | Username | Password |
      | Admin    | admin123 |

  @Anil
  Scenario: Home page
    Given user getTimeLink
    When user getProjectinfo
    And user getCustomerclick
    Then getAddcusto

  @home
  Scenario: Add Customer page
    Given getCustName
    When user getDescriptionText
    Then user getSaveButton

  @Project
  Scenario: Project page is successfull
    Given user getProjectinfo
    When user getProjectclick
    And user getAddcusto
    And user getCustoName
    Then user getSaveButton
