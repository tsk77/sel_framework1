package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class ProductDetailsPage extends AbstractMain{
	
	public void selectProduct() throws InterruptedException
	{
		driver.findElements(By.cssSelector(".details")).get(6).click();
		systemLib.waitMethod();
	}

	public void selectSizeAndQuantity() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#productVariantSize")).click();
		driver.findElement(By.cssSelector("#productVariantSize")).sendKeys("5");
		systemLib.waitMethod();
		
		driver.findElements(By.cssSelector(".ln-c-select")).get(1).click();
		driver.findElements(By.cssSelector(".ln-c-select")).get(1).sendKeys();
		systemLib.waitMethod();
	}
}
