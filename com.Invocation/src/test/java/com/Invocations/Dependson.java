package com.Invocations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
import dev.failsafe.internal.util.Durations;

public class Dependson {
	
	WebDriver driver = new ChromeDriver();
	
	

	
	@Test(priority=1 , groups ="Testing")
	public void Login() throws InterruptedException {
		
		
	     driver.get("https://www.irctc.co.in/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement log =  driver.findElement(By.xpath("//a[contains(text(),'LOGIN')]"));
	    log.click();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    
	   WebElement username = driver.findElement(By.xpath("//input[@formcontrolname=\"userid\"]"));
	   username.sendKeys("balajii92");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   WebElement password = driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]"));
	   password.sendKeys("Chennai@123");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    
	  	  WebElement submit = driver.findElement(By.xpath("//label[text()='Login & Booking With OTP']"));
	  	  Actions ac= new Actions(driver);
	  	  ac.moveToElement(submit).build().perform();
	  	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
	  	  
	     submit.click();
	  	  
	  	WebElement proceed = driver.findElement(By.xpath("//button[text()='Proceed']"));
	    proceed.click();
	    
	  	WebElement signin = driver.findElement(By.xpath("//button[text()=\"SIGN IN\"]"));
	  	signin.click();
	  	  
	  	  
	  	WebElement from =driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[1]"));
	  	from.sendKeys("chennai");
	  	
	  	
	  	WebElement to = driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[2]"));
	  	to.sendKeys("erode");
	  	
	}
	
	
	   @Test(priority = -1 , dependsOnMethods = "Login")
	  public void search1() {
			

		   WebElement search =  driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		   
		   search.click();
		   
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		   
		   js.executeScript("arguments[0].scrollIntoView();", search);
		   
		   WebElement train = driver.findElement(By.linkText(" YERCAUD SF EXP (22649)"));
		   WebElement clas = driver.findElement(By.linkText("Sleeper (SL)"));
		   
		  WebElement date =  driver.findElement(By.linkText("Tue, 17 Oct"));
		  WebElement book = driver.findElement(By.linkText(" Book Now "));
		
	   }
}
	  
	      
	  		
	  	
	  	
	  	
	  
	   
	  
	     
		
		
	

