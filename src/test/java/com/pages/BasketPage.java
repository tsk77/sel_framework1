package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class BasketPage extends AbstractMain {
	
	public void addToBasket() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#AddToCart")).click();
		systemLib.waitMethod();
	}
	
	public void productAddedToBasket() throws InterruptedException
	{
		driver.findElement(By.cssSelector("span.icon")).click();
		systemLib.waitMethod();
	}
public void viewBasketCheckout() throws InterruptedException{
	driver.findElement(By.cssSelector(".links > a:nth-child(1)")).click();
	systemLib.waitMethod();
}
public void proceedToCheckout() throws InterruptedException
{
	driver.findElement(By.cssSelector("#basketButtonTop")).click();
	systemLib.waitMethod();
}
}
