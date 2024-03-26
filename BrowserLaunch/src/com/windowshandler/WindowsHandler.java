package com.windowshandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.xpath("//input[@type=\"text\"]"));
		e1.sendKeys("TV",Keys.ENTER);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("//span[text()='MI 80 cm (32 inches) A Series HD Ready Smart Google TV L32M8-5AIN (Black)']"));
		e2.click();
		String w1= driver.getWindowHandle();
		System.out.println(w1.toString());
		String s=driver.switchTo().window(w1).getTitle();
		System.out.println(s);
		Set<String> w2 = driver.getWindowHandles();
		System.out.println(w2.toString());
	    //String s1= driver.switchTo().window(w2).getTitle();
		//w2.toString();
		
		for(String eachWindowId:w2) {
			if(w1!=eachWindowId)
			{
				driver.switchTo().window(eachWindowId);
			}
		}
		
		WebElement buy = driver.findElement(By.xpath("//input[@title=\"Buy Now\"]"));
		buy.click();
		
			
	}

}
