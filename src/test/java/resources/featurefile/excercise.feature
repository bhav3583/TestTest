Feature: Tile filtering

  As a user I would like to filter the animal with life span

  Background: I am on hompage
  @Regression
  Scenario: User navigates smart Client page and filter the search with tile filtering
    Given I click on tile and filtering
    When I set animal using letter "a"
    And I set life span to 40
    And I select "Life Span" from dropdown
    And I select checkbox to ascending
    Then I verify result contain more than 12 items

  @Smoke
  Scenario: User navigates to smart Client page and filter the search with grid filtering
    Given I click on dropdown grid
    And when I select excercise from the dropdown
    Then I able to select Excercise



