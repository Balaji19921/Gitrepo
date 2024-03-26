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

import multiScreenShot.MultiScreenShot;

public class Screenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
 	
		
		String timestamp= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		//System.out.println(timestamp );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot) driver;
		WebElement e1=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		e1.sendKeys("balaji.gurumoorthi@gmail.com");
		Thread.sleep(3000);
        File fs= ts.getScreenshotAs(OutputType.FILE);
		String loc= "\\Users\\HP\\eclipse-workspace\\BrowserLaunch\\screenshots_" + timestamp + "user.png"  ;
		File destfile = new File(loc);
		FileUtils.copyFile(fs,destfile);
		Thread.sleep(3000);
	
//		WebElement e2 =driver.findElement(By.xpath("//input[@type=\"password\"]"));
//		e2.sendKeys("chennai");
//		Thread.sleep(3000);
//		File fs1= ts.getScreenshotAs(OutputType.FILE);
//		System.out.println(fs1);
//		String loc1= "\\Users\\HP\\eclipse-workspace\\BrowserLaunch\\screenshots\\password.png";
//		File destfile1 = new File(loc1);
//		FileUtils.copyFile(fs1, destfile1);
//		Thread.sleep(3000);
//		
//		WebElement e3=driver.findElement(By.xpath("//button[@name=\"login\"]"));
//		e3.click();
//		Thread.sleep(3000);
//		File fs2= ts.getScreenshotAs(OutputType.FILE);
//		System.out.println(fs2);
//		String loc2= "\\Users\\HP\\eclipse-workspace\\BrowserLaunch\\screenshots\\click.png";
//		File destfile2 = new File(loc2);
//		FileUtils.copyFile(fs2, destfile2);
//		
	
		
		}

				
	

	}

	


