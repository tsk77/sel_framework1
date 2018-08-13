package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class PaymentPage extends AbstractMain {

	public void continueToPayment() throws InterruptedException{
		driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary")).click();
		systemLib.waitMethod();
	}
}
