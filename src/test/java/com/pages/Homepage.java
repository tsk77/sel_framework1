package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberrunner.AbstractMain;

import org.junit.Assert;

public class Homepage extends AbstractMain{
	
	public void setHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/shivakumarthalla/Documents/Automation/driver/chromedriver");
		 driver=new ChromeDriver();
		driver.get ("https://tuclothing.sainsburys.co.uk/");
		Assert.assertEquals("Womens, Mens, Kids & Baby Fashion | Tu clothing", driver.getTitle());
		
	}
	public void enterSearchDetails()
	{
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("dresses");
	}
	public void searchButton()
	{
		driver.findElement(By.className("searchButton")).click(); 
	}

}
