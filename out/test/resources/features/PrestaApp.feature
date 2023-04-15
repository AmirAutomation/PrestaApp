#Author: MirQA
@Regression
Feature: Application PrestaApp

  @TC001
  Scenario: Login successful user
    Given that roboot open app PrestaApp go Login
    When The user login correctly
    Then Validate the login successful in PrestApp

  @TC002
  Scenario: Login faild user
    Given that roboot open app PrestaApp go Login
    When The user login faild
    Then Validate the login faild in PrestApp

  @TC003
  Scenario: Create customer basic
    Given that roboot open app PrestaApp
    When The user register customer
    Then Validate customer registered

  @TC004
  Scenario: Similar credit
    Given that roboot open app PrestaApp
    When The user run a simulation
    Then Validate the credit simulation

  @TC005
  Scenario: Create customer basic extra information
    Given that roboot open app PrestaApp
    When The user register customer extra information
    Then Validate customer registered

  @TC006
  Scenario: Edit name customer information
    Given that roboot open app PrestaApp
    When The user edit information the customer
    Then Validate customer update

  @TC007
  Scenario: Delete customer
    Given that roboot open app PrestaApp
    When The user delete information the customer
    Then Validate customer delete