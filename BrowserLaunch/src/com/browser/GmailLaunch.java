package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLaunch {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
	    driver.manage().window().maximize();
	   
	    WebElement username= driver.findElement(By.xpath("//input[@type='email']"));
	    username.sendKeys("balaji.gurumoorthi@gmail.com")	;
	    
	    WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
	    next.click();
	   // WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    
	   // password.sendKeys("12345");
	    
         //WebElement next1= driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
        // next1.click();
	    
	    
	    	
	    
	    
	}

}
