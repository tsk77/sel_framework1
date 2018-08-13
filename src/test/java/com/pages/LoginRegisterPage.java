package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumberrunner.AbstractMain;



public class LoginRegisterPage  extends AbstractMain{
	
	public void loginButton(String userName , String password) throws InterruptedException
	{
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.className("cookieClose")).click();
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys(userName);
		driver.findElement(By.id("j_password")).sendKeys(password);
		systemLib.waitMethod();
	}

	public void submitButton()
	{
		driver.findElement(By.className("loginButtonMain")).click();
		Assert.assertEquals("Please check the fields below and try again",driver.findElement(By.cssSelector(".ln-u-h4.ln-u-flush-bottom")).getText());
	}
	
	public void loginLink()
	{
		driver.findElement(By.linkText("Tu Log In / Register")).click();
	}
	public void invalidLoginData(String userName,String password)
	{
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.className("cookieClose")).click();
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys(userName);
		driver.findElement(By.id("j_password")).sendKeys(password);
	}
	public void registerButton()
	{
		driver.findElement(By.xpath("//div[@id='login-register-form']/div[2]/div/div[2]/button")).click();
	}
	public void enterEmailValid()
	{
		driver.findElement(By.id("register_email")).clear();
		driver.findElement(By.id("register_email")).sendKeys("thalla.rekha+19@gmail.com");
	}
	
	public void selectTitle()
	{
		Select title = new Select (driver.findElement(By.id("register_title")));
		title.selectByIndex(2);
	}
	
	public void enterFirstName()
	{
		driver.findElement(By.id("register_firstName")).clear();
		driver.findElement(By.id("register_firstName")).sendKeys("Rekha");
	}
	public void enterSurname()
	{
		driver.findElement(By.id("register_lastName")).clear();
		driver.findElement(By.id("register_lastName")).sendKeys("Thalla");
	}
	public void enterPassword()
	{
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("test@123");
	}
	public void enterConfirmPassword()
	{
	driver.findElement(By.id("register_checkPwd")).clear();
	driver.findElement(By.id("register_checkPwd")).sendKeys("test@123");
	}
	
	public void enterFirstNectar()
	{
		driver.findElement(By.id("regNectarPointsOne")).clear();
		driver.findElement(By.id("regNectarPointsOne")).sendKeys("67869798");
	}
	
	public void enterSecondNectar()
	{
		driver.findElement(By.id("regNectarPointsTwo")).clear();
		driver.findElement(By.id("regNectarPointsTwo")).sendKeys("123");
	}
	
	
	public void checkTermsandConditions()
	{
		driver.findElement(By.cssSelector("div.ln-c-form-option.ln-c-form-option--checkbox > label.ln-c-form-option__label")).click();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.cssSelector("label.ln-c-form-option__label:nth-child(3)"));
		JavascriptExecutor executor  = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	public void clickCompleteRegistrationButton()
	{	
	driver.findElement(By.cssSelector("#tuRegisterForm > div.checkoutRegisterContinueButton > button")).click();
	Assert.assertEquals("logged_in",driver.findElement(By.cssSelector(".logged_in")).getText());
	}
	
	
}

