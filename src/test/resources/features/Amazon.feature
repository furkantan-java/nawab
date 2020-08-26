# new feature
# Tags: optional

Feature: As a user I want to use the departments dropdown

  Scenario: Go to https://www.amazon.com, verify that default value of the All departments dropdown is All,
  verify that options in the All departments dropdown are not sorted alphabetically

    Given user is on the url2
    When user clicks on All dropdown
    Then verify that default value in dropdown is All, and the dropdown is not sorted alphabetically