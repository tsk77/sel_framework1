package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.When;

public class ProductLisitingPageStepDef extends AbstractMain {



@When("^I select Heels$")
public void i_select_Heels() throws Throwable {
	productlistingspage.clickOnHeels();
}

}
