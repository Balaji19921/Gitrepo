package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('src').value='Chennai';");
		js.executeScript("document.getElementById('dest').value='Erode';");
		WebElement e = driver.findElement(By.xpath("//div[text()=\"Outstation\"]"));
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-250)");

		js.executeScript("arguments[0].scrollIntoView();", e);
		
		Thread.sleep(3000);

		WebElement e1 = driver.findElement(By.xpath("//img[@alt=\"PrimoBanner\"]"));

		js.executeScript("arguments[0].scrollIntoView();", e1);

		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", e1);

		Thread.sleep(3000);
		WebElement e2 =driver.findElement(By.xpath("//button[text()=\"SEARCH BUSES\"]"));
		js.executeScript("arguments[0].scrollIntoView();", e2);
		
		String s= (String) js.executeScript("return document.title;");
		System.out.println(s);
		String s1=(String) js.executeScript("return document.getElementById('src').value='Chennai';");
		System.out.println(s1);
		String s2= (String) js.executeScript("return document.getElementById('dest').value='Erode';");
		System.out.println(s2);
		String s3= (String) js.executeScript("return document.documentElement.innerText;");
		System.out.println(s3);
		js.executeScript("location.reload()");
}
}



//
//Examples of JavascriptExecutor in Selenium 
//Example 1. JavascriptExecutor in Selenium to refresh the browser window
//
//JavascriptExecutor js = (JavascriptExecutor) driver;
//
//js.executeScript(“location.reload()”);
//
//
//Example 2. JavascriptExecutor in Selenium to send text
//
//JavascriptExecutor js = (JavascriptExecutor) driver;
//
//js.executeScript(“document.getElementByID(‘element id ’).value = ‘xyz’;”);
//
//Example 3. Generate Alert Pop Window
//
//JavascriptExecutor js = (JavascriptExecutor)driver;
//
//Js.executeScript(“alert(‘hello world’);”);
//
//Example 4. Get InnerText of a Webpage
//
//JavascriptExecutor js = (JavascriptExecutor)driver;
//
//string sText =  js.executeScript(“return document.documentElement.innerText;”).toString();
//
//Example 5. Get Title of a WebPage
//
//JavascriptExecutor js = (JavascriptExecutor)driver;
//
//string sText =  js.executeScript(“return document.title;”).toString();
//
//Example 6. Scroll Page
//
//JavascriptExecutor js = (JavascriptExecutor)driver;
//
// //Vertical scroll – down by 150  pixels
//
// js.executeScript(“window.scrollBy(0,150)”);
//