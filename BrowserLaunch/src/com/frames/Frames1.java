package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1=  driver.findElement(By.xpath("//iframe[@id ='courses-iframe']"));
		Thread.sleep(4000);
		driver.switchTo().frame(e1);
	    WebElement e2 =driver.findElement(By.xpath("//a[text()='Register']"));
	    e2.click();
	    driver.switchTo().defaultContent();
	    
	    
	    
		
	}
}
