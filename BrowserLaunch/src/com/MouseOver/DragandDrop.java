package com.MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
	    WebElement e2= driver.findElement(By.xpath("//li[@class=\"placeholder\"]"));
	    
	    Actions ac= new Actions(driver);
	    
	    ac.dragAndDrop(e1, e2).perform();
	    
	    Thread.sleep(3000);
	    
	    WebElement e3= driver.findElement(By.xpath("//a[text()=\" 5000 \"]"));
	    
	    WebElement e4 = driver.findElement(By.xpath("//ol[@id=\"amt8\"]"));
	    
	    ac.dragAndDrop(e3, e4).perform();
	    
	    WebElement e5 = driver.findElement(By.xpath("//ol[@id=\"amt8\"]"));
	    
	    WebElement e6= driver.findElement(By.xpath("//a[text()=\" 5000 \"]"));
	    
	    ac.dragAndDrop(e5, e6).perform();
	    
	    
	    
	}

}
