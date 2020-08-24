@login
Feature: login
  As user, I want to be able to login with username and password

  @storemanager_login
  Scenario: Login as store manager and verify that title is Dashboard
    Given user is on the login page
    When user logs in as a store manager
    Then user should verify that title is 'Dashboard'