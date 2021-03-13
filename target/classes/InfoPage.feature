Feature: Select the dates of travel

Scenario Outline: search the available flights.

Given user selects to and from date
When user selects date of travel
When user decides the no of passengers
Then user clicks SEARCH button
Then to validate user moves to next screen.