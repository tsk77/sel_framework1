Feature: Login

Scenario: LogIn With Valid email id & pasword

Given I am in the homepage
When I select login link in homepage
When I enter Valid Username "testtrails2@gmail.com" and Valid Password "test@1234"
And I enter Submit Button
Then I should see my logged in to my account




Scenario Outline: Login with multiple invalid data combinations

 //Scenario: Login with Invalid email id & Password
 
Given I am in the homepage
When I select login link in homepage
When I enter invalid "<Username>"  and invalid "<Password>" 
And I enter Submit Button
Then I should not see the account

Examples:
|Username|Password|
|thahsj@gmail.com|hgggh|
|*&*(&)|*&()*()|

Scenario: Register with New Customer

Given I am in the homepage
When I select login link in homepage
When I click Register Button
When I enter valid email id 
And I select title
And I enter FirstName
And I enter surname
And I enter password
And I enter Confirm password
And I enter first set of Nectar number
And I enter Second set of Nectar number
Then I select terms and conditions
And I click on complete Registration
Then I can able to create one new account

