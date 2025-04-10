Feature:Login  page Automation for saucedemo  APP
Scenario:check login is successful with valid creds
Given user is on login page 
When Userenters valid username and password
And clicks n Login Button 
Then user is navigated to Home page
And close the browser