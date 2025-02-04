package com.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.w3schools.com");
		driver.manage().window().maximize();
		
		//selenium 3# - driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement e1 = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		e1.sendKeys("selenium");
		e1.click();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("JAVAggg")));
		driver.findElement(By.linkText("JAVA")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		WebElement e2 =driver.findElement(By.linkText("JAVASCRIPT"));
		e2.click();
		wait.until(ExpectedConditions.titleContains("selenium"));
		driver.close();
	
		
		
	}
}
