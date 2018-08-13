@now
Feature: stores

Scenario Outline: Search Store locator with Valid multiple data
 
Given I am in the homepage
When I click on  TU store Locator  link
Then I enter "<Valid data>" valid data
Then I click on find stores button
Then I should see valid results

Examples:
|Valid data|
|SL2 5FY|
|slough|

Scenario Outline: Search Store locator with Multiple invalid data

Given I am in the homepage
When I click on  TU store Locator  link
Then I enter "<InValid data>" invalid data
Then I click on find stores button
Then I should see no results found

Examples:
|Invalid data|
|hjhdshij|
|hh3*(())|
