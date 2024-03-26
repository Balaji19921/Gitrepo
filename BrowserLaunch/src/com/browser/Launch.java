package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	
	public static void main(String [] args)
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement usreName = driver.findElement(By.xpath("//input[@id='email']"));
		usreName.sendKeys("balaji.gurumoorthi@gmail.com");
		
		String name = usreName.getAttribute("value");
		System.out.println(name);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	    password.sendKeys("pass123");
	    
	    String passwd = password.getAttribute("value");
	    System.out.println(passwd);
	    
	   
		WebElement buton = driver.findElement(By.xpath("//button[@name='login']"));
	    //buton.click();
		
		String btn = buton.getText();
	    System.out.println(btn);
	    
	    
	    WebElement value= driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
	    
	    String val=value.getText();
	    System.out.println(val);
	    
	    
	    WebElement cont= driver.findElement(By.xpath("//input[starts-with(@name,'e')]"));
	    
	    String val1=cont.getAttribute("placeholder");
	    System.out.println(val1);
	    
	   
	    WebElement cont1= driver.findElement(By.xpath("//input[starts-with(@name,'p')]"));
	    String val2=cont1.getAttribute("placeholder");
        System.out.println(val2);
	    
	    
	    
		//driver.close();
		
	}
}
