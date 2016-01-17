@testdiary

Feature: validate Testdiary site is working
  
 
  Scenario: validating testdiary
    Given I have the current testdiary url
    When I open the testdiary url
    Then testdiary should be displayed
    
