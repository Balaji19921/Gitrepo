package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("abcd");
		
		
		WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
				
		sub.click();
		
		
		Alert al = driver.switchTo().alert();
		
		//String alertmessage = driver.switchTo().alert().getText();
	
		//System.out.println(alertmessage);
		String alertmessage=  al.getText();
		
		System.out.println(alertmessage);
		
		al.accept();
		al.accept();
		
		
	}
}
