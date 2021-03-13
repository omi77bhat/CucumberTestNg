Feature: Login into Make my trip website.


Scenario Outline: Enter valid user name and password

Given open the chrome and launch the application
When user clicks Login button
When user enters "userName" and "password"
Then user clicks LOGIN button
Then to validate if login is successful

 Examples: 
 | userName               | password  |
 | omesh007bhat@gmail.com | Mytrip@77 |
