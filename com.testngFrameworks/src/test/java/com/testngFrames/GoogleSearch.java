package com.testngFrames;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleSearch {

	@Test
	public void meth() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	Actions ac= new Actions(driver);
	
	driver.get("https://google.com");
	
    driver.manage().window().maximize();
   
    WebElement search= driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
    
    search.sendKeys("Selenium");
    
    search.sendKeys(Keys.ENTER);
    
    Thread.sleep(4000);
    
    WebElement sel= driver.findElement(By.xpath("//h3[text()='Selenium']"));
    
    sel.click();
	}
}
