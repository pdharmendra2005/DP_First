@test1
Feature: User LonIn for Automation Practice

  As a user I want to LogIn successfully so that
  I can access my account


  Background:
    Given I am on the HomePage
    When I click on SignIn Link
    Then I should be on Authentication Page
    And I should see SignUp Panel

  @smoke1
  Scenario: verify user can access to create an account page
  When I enter my Email Id as "vicky_sturd@hotmail.com"
  And I click on Create an account button
  Then I should be on Registration Page

  # Happy Path scenarios:
  @smoke2
  Scenario: Verify User can login with valid credentials
    When I enter username as "vicky_sturd@hotmail.com" and password as "Vivek123"
    And I click SignIn
    Then I Should be loggedIn successfully
    And I should be on MyAccount page
