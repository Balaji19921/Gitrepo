package com.MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e1= driver.findElement(By.id("myModal-new"));
		e1.click();
		Thread.sleep(2000);
		WebElement e2= driver.findElement(By.linkText("COURSES"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e2).perform();
		
		//WebElement e3= driver.findElement(By.xpath("//span[text()=\"Python\"]"));
		//ac.moveToElement(e3).perform();
		//ac.click();
		
		WebElement e4= driver.findElement(By.xpath("//span[text()=\"Oracle Training\"]"));
		ac.moveToElement(e4).perform();
		
		WebElement e5 = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		ac.moveToElement(e5).perform();
		e5.click();
		
		
		
		
		
	}

}