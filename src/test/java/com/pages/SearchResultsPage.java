package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.cucumberrunner.AbstractMain;

public class SearchResultsPage extends AbstractMain {
	
public void searchInvalidProductId()
{
	driver.findElement(By.id("search")).sendKeys("132856898");
}

public void searchvalidProductId()
{
	driver.findElement(By.id("search")).sendKeys("133606372");
}
	public void searchSpecificStyle()
	{
		driver.findElement(By.id("search")).sendKeys("black polo tshirts");
	}
}
