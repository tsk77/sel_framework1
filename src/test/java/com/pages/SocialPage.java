package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class SocialPage extends AbstractMain{
public void clickFb()
{
	driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(1).click();
	
}
public void clickTwitter()
{
	driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(2).click();
}
public void clickInstagram()
{
	driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(3).click();
}
public void clickGoogle()
{
	driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(4).click();
}
public void clickPinInterest()
{
	driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(5).click();  
}
}
