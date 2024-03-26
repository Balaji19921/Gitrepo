package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot) driver;
		WebElement username=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		username.sendKeys("balaji.gurumoorthi@gmail.com");
	    takeScreenShots(driver,"username");
		
	    WebElement password =driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("chennai");
        takeScreenShots(driver, "password");
	
	}
	
	public static void takeScreenShots(WebDriver driver,String screenshot) throws IOException, InterruptedException
	{
		String timestamp= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		 File fs= ts.getScreenshotAs(OutputType.FILE);
			String loc= "\\Users\\HP\\eclipse-workspace\\BrowserLaunch\\screenshots_" + timestamp + ".png"  ;
			File destfile = new File(loc);
			FileUtils.copyFile(fs,destfile);
			Thread.sleep(3000);
		
		
	{
	}
	
	

	}

}
