package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class StoreResultsPage extends AbstractMain{
	
	public void noStoreResultsFound()
	{
		Assert.assertEquals("Sorry, no results found for your search. Please check your spelling and make sure you are searching for a town name or postcode.", driver.findElement(By.cssSelector(".ln-u-h4.ln-u-flush-bottom")).getText());
	}

	public void storeResultsFound()
	{
		Assert.assertEquals("Your nearest stores", driver.findElement(By.cssSelector("#header1")).getText());
	}
}
