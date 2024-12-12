#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Searching a product in Amazon India
  I want to use this template for my feature file
  
  @Background:
  Given I land on Amazon home page

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  @tag2
  Scenario Outline: Test to search Amazon product
    Given I logged in with username <name> and <password>
    When I search for the product <productName>
    Then I verify the <status> in step1

    Examples: 
      | name  										| password 	 | productName |status|
      | acharya.aparna@gmail.com  | Godbless1! | Mobile			 |true  |
     
