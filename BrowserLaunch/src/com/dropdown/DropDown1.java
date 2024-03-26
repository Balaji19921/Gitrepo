package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select s= new Select(e1);
		s.selectByValue("option2");
		Thread.sleep(4000);
		s.selectByValue("option3");
		Thread.sleep(4000);
		s.selectByIndex(1);
		Thread.sleep(4000);
		s.selectByVisibleText("Option1");
		
		List<WebElement> list= s.getOptions();
		int size=list.size();
		for(int i=0;i<size;i++)
		{
			String msg = list.get(i).getText();
			System.out.println(msg);
			
		}
			
		}
		
		
	}
	
	