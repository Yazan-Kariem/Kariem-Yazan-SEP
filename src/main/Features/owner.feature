@tag2
Feature: Adding Residences Sakancom Application.

  Scenario: Check if owner logged in and selected add residence option
    Given owner wants to login and add a residence
    And owner enters "Ahmad mohammed" as username and "11223344" as a password
    Then owner logged in with "Ahmad mohammed" as username and "11223344" as a password and dashboard appears and adding list appears

  Scenario: owner wants to enter the department name
    Given owner is logged in with username "Ahmad mohammed" and  password "11223344" and selected "1" for housing then selected "1" to add housing.
    And enters "Academia" as department name using function departmentName
    Then department added successfully for owner "Ahmad mohammed"

  Scenario: owner wants to add photo to the housing
    Given owner is logged in with username "Ahmad mohammed" and  password "11223344" and selected "1" for housing then selected "1" for add housing
    And adding to the housing options appears and owner added photo by function addPhoto
    Then photo added successfully for owner "Ahmad mohammed"

  Scenario: owner wants to add location
    Given owner is logged in with username "Ahmad mohammed" and  password "11223344" and selected "1" for housing and "1" for add housing
    And adding to the housing options appears and owner entered "description" as location and information by function addLocationInfo
    Then location and information added successfully for owner "Ahmad mohammed"

  Scenario: owner wants to add services
    Given owner is logged in with username "Ahmad mohammed" and  password "11223344" then selected "1" for housing and "1" for add housing
    And adding to the housing options appears and owner entered "Washing machine, iron, free internet" as services by function addServices
    Then services added successfully for owner "Ahmad mohammed"

  Scenario: owner wants to add price
    Given owner is logged in with username "Ahmad mohammed",  password "11223344" and selected "1" for housing and "1" for add housing
    And adding to the housing options appears and owner entered "1000 with electricity and water" as monthly rent by function addPrice
    Then monthly rent added successfully for owner "Ahmad mohammed"

  Scenario: owner wants to add contact information
    Given owner is logged in with username "Ahmad mohammed", password "11223344" and selected "1" for housing and "1" for add housing.
    And adding to the housing options appears and "Ahmad mohammed" contact information taken from database by function addContactInfo
    Then contact information added successfully for owner "Ahmad mohammed"

    Scenario: show housings
      Given owner logged in
      And dashboard appears then selected "1" for housing then selected "2" for show housings full information
      Then housings appears for owner "Ahmad mohammed"
