package com.MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	    //WebElement e1= driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		
		Actions ac= new Actions(driver);
		
        //ac.contextClick(e1).perform();
	
		Thread.sleep(000);
		
		WebElement e2 = driver.findElement(By.xpath("//a[text()=\"Images\"]"));
		
		ac.contextClick(e2).perform();
		
		
		//WebElement e3 = driver.findElement(By.xpath("(//input[@name ='btnK'])[2]"));
		
		//ac.contextClick(e3).build().perform();
				 
		
		
	}
}
