package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeliveryPageStepDef extends AbstractMain{

@When("^I select Homedelivery option$")
public void i_select_Homedelivery_option() throws Throwable {
    dp.homeDelivery();
}

@When("^I select continue$")
public void i_select_continue() throws Throwable {
   dp.continueToNextPage();
}

@Then("^I select select option$")
public void i_select_select_option() throws Throwable {
    dp.selectOption();
}

@Then("^I select Standard Delivery$")
public void i_select_Standard_Delivery() throws Throwable {
    dp.standardDelivery();
}

@Then("^I select continue button$")
public void i_select_continue_button() throws Throwable {
    dp.nextpage();
}
}
