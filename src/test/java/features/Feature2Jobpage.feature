@Job
Feature: Job Page Feature functionality

@JobSearch
  Scenario Outline: Sorting Jobs having from salary high to low
    Given User on job search page
    When User tap on  sortby
    And User tap on salary high to low
    Then User search for <job>

    Examples: 
      | job           |
      | "2D Animator" |
      

@RecommendedJobs
   Scenario: Recommended Job Functionality
    Given User on the job search page
    When User tap on profile navigation bar
    And User tap on recommended jobs
    Then User find recommended jobs
     