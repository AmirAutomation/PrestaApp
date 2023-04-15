#Author: MirQA
@Regression
Feature: Application PrestaApp

  @TC001
  Scenario Outline: : Login successful user
    Given that roboot open app PrestaApp go Login
    When The user login correctly
      |email|password|
      |<email>|<password>|
    Then Validate the login successful in PrestApp
    Examples:
      |email|password|
      ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@Login Successful
   |amirr10c@gmail.com   |12345678|

  @TC002
  Scenario Outline: : Login faild user
    Given that roboot open app PrestaApp go Login
    When The user login faild
      |email|password|
      |<email>|<password>|
    Then Validate the login faild in PrestApp
    Examples:
      |email|password|
      ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@LoginFailed
   |Failed1@gmail.com   |ewdedd|
   |Failed2@gmail.com   |2332sdd|

  @TC003
  Scenario Outline: Create customer basic
    Given that roboot open app PrestaApp
      |email|password|
      |<email>|<password>|
    When The user register customer
      |id|name|lastname|
      |<id>|<name>|<lastname>|
    Then Validate customer registered
    Examples:
      |email|password|id|name|lastname|
      ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@CustomerRegister
   |amirr10c@gmail.com   |12345678   |1077893   |Amir Alexander   |Romaña Cordoba|
   |amirr10c@gmail.com   |12345678   |7673823   |Yair Alejandro   |Romaña Mosquera|
   |amirr10c@gmail.com   |12345678   |3767676   |Yissel   |Palacios Romaña|
   |amirr10c@gmail.com   |12345678   |5466745   |Ana Raquel   |Cordoba Mena|

  @TC004
  Scenario Outline: : Similate credit
    Given that roboot open app PrestaApp
      |email|password|
      |<email>|<password>|
    When The user run a simulation
      |value|interest|numberPayments|date|
      |<value>|<interest>|<numberPayments>|<date>|
    Then Validate the credit simulation
    Examples:
      |email|password|value|interest|numberPayments|date|
      ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@SimulateCredit
   |amirr10c@gmail.com   |12345678   |550,000.00   |5   |6   |04/15/2023|
   |amirr10c@gmail.com   |12345678   |2400000.00   |15   |3   |05/06/2023|


  @TC005
  Scenario Outline: : Create customer basic extra information
    Given that roboot open app PrestaApp
      |email|password|
      |<email>|<password>|
    When The user register customer extra information
      |id|name|lastname|address|emailCustomer|cellphone|phone|
      |<id>|<name>|<lastname>|<address>|<emailCustomer>|<cellphone>|<phone>|
    Then Validate customer registered
    Examples:
      |email|password|id|name|lastname|address|emailCustomer|cellphone|phone|
      ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@CustomerRegisterExtra
   |amirr10c@gmail.com   |12345678   |28932   |Mercedes   |Cuesta Beytar   |Cr 22 #45--21   |Mercedes@gmail.com   |311000928   |6047683|
   |amirr10c@gmail.com   |12345678   |829172878   |Anggie Angelica   |Teran Cordoba   |Cll 33 #11-11   |Anggiew@gmail.com   |300212333   |6043682|
   |amirr10c@gmail.com   |12345678   |3123232   |Mery Yareth   |Mosquera Romaña   |Avenida 3A #67-23   |Mery@gmail.com   |313444522   |6047433|

  @TC006
  Scenario Outline: Update name customer information
    Given that roboot open app PrestaApp
      |email|password|
      |<email>|<password>|
    When The user edit information the customer
      |id|name|lastname|nameUpdate|
      |<id>|<name>|<lastname>|<nameUpdate>|
    Then Validate customer update
    Examples:
      |email|password|id|name|lastname|nameUpdate|
    ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@CustomerUpdate
   |amirr10c@gmail.com   |12345678   |7673823   |Yair Alejandro   |Romaña Mosquera   |Camilo|

  @TC007
  Scenario Outline: : Delete customer
    Given that roboot open app PrestaApp
      |email|password|
      |<email>|<password>|
    When The user delete information the customer
      |id|name|lastname|
      |<id>|<name>|<lastname>|
    Then Validate customer delete
    Examples:
      |email|password|id|name|lastname|
    ##@externaldata@./src/test/resources/archivos/DataPrestaApp.xlsx@CustomerDelete
   |amirr10c@gmail.com   |12345678   |7673823   |Camilo   |Romaña Mosquera|
