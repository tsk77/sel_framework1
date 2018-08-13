package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class ProductListingsPage extends AbstractMain {
public void clickOnHeels() throws InterruptedException
	
	{
		driver.findElements(By.cssSelector(".ln-o-bare-link")).get(22).click();
		systemLib.waitMethod();
	}
}
