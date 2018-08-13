Feature: End to End Checking out with Registered Customers with Standard delivery

Scenario: 1.End to End Checking out with Registered Customers with Standard delivery

Given I am in the homepage
When I select login link in homepage
When I enter Valid Username "testtrails2@gmail.com" and Valid Password "test@1234"
And I enter Submit Button
Then I should see my logged in to my account
When I select on Women
When I select Heels
When I select the product
And I selct size and quantity
Then I select Add to Basket button
Then I should see Product added to the basket
When I Select View Basket &Checkout Option button
And I select Proceed to checkout option
And I select Homedelivery option
And I select continue
Then I select select option
And I select Standard Delivery 
And I select continue button
And I select to continue to Payment option
And I select terms and conditions 

