package com.stepdefinition;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SocialStepDef extends AbstractMain{


@When("^I cick on FB icon$")
public void i_cick_on_FB_icon() throws Throwable {
	socialPage.clickFb();
}


@When("^I cick on Twitter icon$")
public void i_cick_on_Twitter_icon() throws Throwable {
	socialPage.clickTwitter();
}



@When("^I cick on Instagram icon$")
public void i_cick_on_Instagram_icon() throws Throwable {
socialPage.clickInstagram();
}



@When("^I cick on google icon$")
public void i_cick_on_google_icon() throws Throwable {
	socialPage.clickGoogle();
}



@When("^I cick on pin interest icon$")
public void i_cick_on_pin_interest_icon() throws Throwable 
{
	socialPage.clickPinInterest(); 
}
@Then("^I shoud see FB page$")
public void i_shoud_see_FB_page() throws Throwable {
   
}
@Then("^I shoud see Twitter page$")
public void i_shoud_see_Twitter_page() throws Throwable {
    
}
@Then("^I shoud see Instagram page$")
public void i_shoud_see_Instagram_page() throws Throwable {
    
}
@Then("^I shoud see google page$")
public void i_shoud_see_google_page() throws Throwable {
    
}
@Then("^I shoud see pin interest page$")
public void i_shoud_see_pin_interest_page() throws Throwable {
    
}



}
