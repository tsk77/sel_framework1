package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginRegisterStepDef extends AbstractMain{

@When("^I enter Valid Username \"([^\"]*)\" and Valid Password \"([^\"]*)\"$")
public void i_enter_Valid_Username_and_Valid_Password(String userName, String password) throws Throwable {
	loginregister.loginButton(userName,password);
}

@When("^I enter Submit Button$")
public void i_enter_Submit_Button() throws Throwable {
    loginregister.submitButton();
}


@When("^I select login link in homepage$")
public void i_select_login_link_in_homepage() throws Throwable {
   loginregister.loginLink();
   
}

@Then("^I should see my logged in to my account$")
public void i_should_see_my_logged_in_to_my_account() throws Throwable {
  
}

@When("^I enter invalid \"([^\"]*)\"  and invalid \"([^\"]*)\"$")
public void i_enter_invalid_and_invalid(String arg1, String arg2) throws Throwable {
    loginregister.invalidLoginData(arg1, arg2);
}


@Then("^I should not see the account$")
public void i_should_not_see_the_account() throws Throwable {
   
}


@When("^I click Register Button$")
public void i_click_Register_Button() throws Throwable {
   loginregister.registerButton();
   systemLib.waitMethod();
}

@When("^I enter valid email id$")
public void i_enter_valid_email_id() throws Throwable {
   loginregister.enterEmailValid();
}

@When("^I select title$")
public void i_select_title() throws Throwable {
    loginregister.selectTitle();
}

@When("^I enter FirstName$")
public void i_enter_FirstName() throws Throwable {
    loginregister.enterFirstName();
}

@When("^I enter surname$")
public void i_enter_surname() throws Throwable {
   loginregister.enterSurname();
}

@When("^I enter password$")
public void i_enter_password() throws Throwable {
    loginregister.enterPassword();
}

@When("^I enter Confirm password$")
public void i_enter_Confirm_password() throws Throwable {
   loginregister.enterConfirmPassword();
}

@When("^I enter first set of Nectar number$")
public void i_enter_first_set_of_Nectar_number() throws Throwable {
    loginregister.enterFirstNectar();
}

@When("^I enter Second set of Nectar number$")
public void i_enter_Second_set_of_Nectar_number() throws Throwable {
    loginregister.enterSecondNectar();
    systemLib.waitMethod();
}


@Then("^I select terms and conditions$")
public void i_select_terms_and_conditions() throws Throwable {
    loginregister.checkTermsandConditions();
    systemLib.waitMethod();
}

@Then("^I click on complete Registration$")
public void i_click_on_complete_Registration() throws Throwable {
    loginregister.clickCompleteRegistrationButton();
}

@Then("^I can able to create one new account$")
public void i_can_able_to_create_one_new_account() throws Throwable {
    
}


}
