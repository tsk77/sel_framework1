package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class CategoryPage extends AbstractMain{

	public void clickOnWomen() throws InterruptedException
	{
		systemLib.waitMethod();
		driver.findElement(By.linkText("Women")).click();
		
	}
	
}
