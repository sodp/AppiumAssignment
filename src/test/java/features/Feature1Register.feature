@Register
Feature: Register Functionality


@registeruser
  Scenario Outline: Register User on App
    Given User on register activity
    When User Enter <name>
    When User Enter <mobile> Number
    Then User Click Submit

    Examples: 
      | name             | mobile        |
      | "Siddhant Panda" | "22333445566" |


@selectcity  
  Scenario Outline: User Select City From Available Ones
    When User Select city as Delhi
    And User Enter <nearest> Location
    Then User Click on Submit button
    

    Examples: 
      | nearest       |
      | "Sadar bazar" |


  @details
  Scenario: User fill required  details
    Given User on fill details activity
    When User tap on Male
    And User tap on Graduate
    And User tap on English
    And User swipes up1
    And User tap Fluent English
    And User tap Fresher
    And User swipes up2
    And User tap age and selects age
    And User swipes up3
    And User swipes up4
    And User select its field as graphic designer
    Then User submit its profile


  @skilldetails
  Scenario: User fill required skill details
    When User tap Graphic Designer skill detail
    And User selects skill illustrator
    And User click on submit graphic designer skill
    And User tap education degree
    And User selects degree
    Then User submit its profile
    
    
  @language
  Scenario: Select Language
    Given User on select language activity
    Then User select English
