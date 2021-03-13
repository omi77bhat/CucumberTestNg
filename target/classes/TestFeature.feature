
Feature: Title of your feature



Background:

Given user loads the application

@Smoke
Scenario: Valid Login functionality

Given user adds valid id
And user adds password
When user click submit button
Then user should login successfully



Scenario: InValid Login functionality

Given user adds invalid id
And user adds password
When user click submit button
Then user login should fail