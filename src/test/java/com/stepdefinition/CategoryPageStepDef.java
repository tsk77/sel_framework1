package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoryPageStepDef extends AbstractMain{
	

@When("^I select on Women$")
public void i_select_on_Women() throws Throwable {
   cp.clickOnWomen();
}


}
