package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;

public class PaymentPageStepDef extends AbstractMain {

@Then("^I select to continue to Payment option$")
public void i_select_to_continue_to_Payment_option() throws Throwable {
    pp.continueToPayment();
}


}
