package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class DeliveryPage extends AbstractMain{
	
	public void homeDelivery ()
	{
		driver.findElements(By.cssSelector(".ln-c-form-option.ln-c-form-option--radio")).get(1).click();
	}
	public void continueToNextPage(){
	driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary")).click();
	}
	public void selectOption()
	{
		driver.findElement(By.cssSelector(".customer-options--cta")).click();
	}
	public void standardDelivery()
	{
		driver.findElement(By.cssSelector(".ln-c-form-option.ln-c-form-option--radio")).click();
	}
	public void nextpage()
	{
		driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary")).click();
	}
}
