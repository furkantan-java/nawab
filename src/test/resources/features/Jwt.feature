@Jwt
Feature: As a user I want to be able to check and uncheck boxes of days

  Scenario: Go to url and randomly select a checkbox,as soon as you check any day,
  print the name of the day and uncheck immediately. After you check and uncheck Friday for the third time,
  exit the program.

    Given user is on the url
    When user randomly select a checkbox,as soon as you check any day,print the name of the day and uncheck immediately
    Then after you check and uncheck Friday for the third time, exit the program.
