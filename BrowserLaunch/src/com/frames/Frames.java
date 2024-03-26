package com.frames;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLFrameSetElement;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("a077aa5e"));
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(element);
		
		Thread.sleep(4000);
		
		WebElement element1 = driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
		element1.click();
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder=\"Enter Email\"]"));
		
		String val = element2.getAttribute("placeholder");
		System.out.println(val);
		
		element2.sendKeys("balaji.gurumoorthi@gmail.com");
		
		Thread.sleep(4000);
		
		 WebElement element3 = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
		  element3.click();
		  
		  Alert al = driver.switchTo().alert();
		  
		  String alert = al.getText(); System.out.println(alert);
		  
		  al.accept();
		 
		
		 List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		 int length = frame.size();
//		 for(int i=0; i<length; i++)
//		 {
//			 String msg =frame.get(i).getText();
//			 System.out.println(msg);
//		
//		 }
//		
		
		System.out.println(length);
		
				 
		
		
		
		
	}
}
