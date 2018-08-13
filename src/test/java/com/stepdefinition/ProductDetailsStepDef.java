package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.When;

public class ProductDetailsStepDef extends AbstractMain{
	
@When("^I select the product$")
public void i_select_the_product() throws Throwable {
	productPage.selectProduct();
	}

@When("^I selct size and quantity$")
public void i_selct_size_and_quantity() throws Throwable {
 productPage.selectSizeAndQuantity();
}
}
