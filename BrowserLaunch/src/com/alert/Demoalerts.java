package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoalerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		WebElement ob=driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']"));
		String val=ob.getAttribute("placeholder");
		System.out.println(val);
	    ob.sendKeys("balaji");
	    System.out.println(ob.getAttribute("value"));
		ob.click();
		Thread.sleep(1000);
		WebElement ob1 = driver.findElement(By.xpath("//input[@value=\"Alert\"]"));
		ob1.click();
		Thread.sleep(1000);
		Alert al= driver.switchTo().alert();
		String text =al.getText();
		System.out.println(text);
		al.accept();
		
		
		
		
	}
}
