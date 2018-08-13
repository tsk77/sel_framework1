Feature: Search


Scenario: Search With Valid Data

Given I am in the homepage
When I enter Valid data
And I select Search Button
Then I should see the Valid Results


Scenario: Search With invalid Product id
Given I am in the homepage
When I enter inValid Product id
And I select Search Button
Then I should see the Valid Results


Scenario: Search With valid Product id
Given I am in the homepage
When I enter Valid Product id
And I select Search Button
Then it should show product not found


Scenario: Search with specific style

Given I am in the homepage
When I enter Valid "<search>" term
And I select Search Button
Then I should see the Valid Results












