Feature: Validate OrangeHRP Page

#Testcase 16
@SmokeTest
Scenario: Validating OrangeHRP application Login
Given When I am in OrangeHRP Application 
Then Login to Application 
When Dashboard page is available 
And click on Admin menu
And Close the browser

#Testcase 17
@E2E
Scenario: Validating Job Title
Given When I am in OrangeHRP Application
Then Login to Application 
When I click on Admin Link 
Then Click on Job 
And validate text – Job Title
And Close the browser

#Testcase 18
@SmokeTest@RegressionTest
Scenario: Validating Vacancies
Given When I am in OrangeHRP Application
Then Login to Application 
When I click on Recruitment 
Then Click on Vacancies 
And Close the browser

@SmokeTest
Scenario: Validating OrangeHRP application Logout
Given When I am in OrangeHRP Application
Then Login to Application 
When I click on UserProfile 
Then Click on Logout 
And Close the browser

