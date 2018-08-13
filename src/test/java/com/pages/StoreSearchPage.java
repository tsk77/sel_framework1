package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;



public class StoreSearchPage extends AbstractMain{
public void storeLink()
{
	driver.findElement(By.cssSelector("#top_menu > div > ul.nav > li:nth-child(2) > a")).click();
}
public void storeValid(String validData)
{
	driver.findElement(By.cssSelector("#tuStoreFinderForm > div.ln-c-form-group.ln-u-push-bottom > div > input")).click();
	driver.findElement(By.cssSelector("#tuStoreFinderForm > div.ln-c-form-group.ln-u-push-bottom > div > input")).sendKeys(validData);
}
public void storeInvalid(String invalidData)
{
	driver.findElement(By.cssSelector("#tuStoreFinderForm > div.ln-c-form-group.ln-u-push-bottom > div > input")).click();
	driver.findElement(By.cssSelector("#tuStoreFinderForm > div.ln-c-form-group.ln-u-push-bottom > div > input")).sendKeys(invalidData);
	
}
public void findStoreButton()
{
	driver.findElement(By.cssSelector("#tuStoreFinderForm > button")).click();
}
}
