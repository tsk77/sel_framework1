package com.stepdefinition;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketPageStepDef extends AbstractMain{


@Then("^I select Add to Basket button$")
public void i_select_Add_to_Basket_button() throws Throwable {
	bp.addToBasket();
}

@Then("^I should see Product added to the basket$")
public void i_should_see_Product_added_to_the_basket() throws Throwable {
	bp.productAddedToBasket();
}

@When("^I Select View Basket &Checkout Option button$")
public void i_Select_View_Basket_Checkout_Option_button() throws Throwable {
bp.viewBasketCheckout();	
}

@When("^I select Proceed to checkout option$")
public void i_select_Proceed_to_checkout_option() throws Throwable {
	bp.proceedToCheckout();
}

}
