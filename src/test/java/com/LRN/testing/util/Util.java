package com.LRN.testing.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	WebDriver driver = null;
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	public void mouseOver(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	
	public void mouseOverAndClick(String pXpath, String click) {
		mouseOver(pXpath);
		click(click);
	}
	
	public void click(String click) {
		driver.findElement(By.xpath(click)).click();
	}
	
	public void wait(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	public void mAm(String pXpath,String cXpath) {
		mouseOver(pXpath);
		mouseOver(cXpath);
	}
	public void mAmAc(String xpath1,String xpath2,String xpath3){
		mouseOver(xpath1);
		mouseOver(xpath2);
		click(xpath3);
		
	}
	public void switchTab(int index) {
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(index));		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
