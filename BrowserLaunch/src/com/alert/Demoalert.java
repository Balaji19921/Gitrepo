package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoalert {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement alert= driver.findElement(By.xpath("//a[contains(text(),'Alert with OK')]"));
		String m=alert.getText();
		System.out.println(m);
		alert.click();
		Thread.sleep(1000);
		WebElement alerts= driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]"));
		String mm=alerts.getText();
		System.out.println(mm);
		alerts.click();
		Thread.sleep(1000);
		Alert obj=driver.switchTo().alert();
		obj.getText();
	    obj.accept();
		
		
		WebElement alert1= driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]"));
		String msg=alert1.getText();
		System.out.println(msg);
		alert1.click();
		Thread.sleep(1000);
		WebElement alert2=driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
		String msg1=alert2.getText();
		System.out.println(msg1);
		alert2.click();
		Thread.sleep(1000);
		Alert obj1=driver.switchTo().alert();
		String text= obj1.getText();
		System.out.println(text);
		obj1.accept();
		WebElement display2=driver.findElement(By.xpath("//p[contains(text(),'You pressed Ok')]"));
		String msg11=display2.getText();
		System.out.println(msg11);
		
		WebElement alert3 =driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		String mg=alert3.getText();
		System.out.println(mg);
		alert3.click();
		Thread.sleep(1000);
		WebElement alert4 =driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));
		String mgs=alert4.getText();
		System.out.println(mgs);
		alert4.click();
		Thread.sleep(1000);
		Alert obj2=driver.switchTo().alert();
		String text1= obj2.getText();
		System.out.println(text1);
		obj2.sendKeys("Automation Testing user");
		obj2.accept();
		WebElement display3=driver.findElement(By.xpath("//p[contains(text(),'Hello Automation Testing user How are you today')]"));
		String msg3=display3.getText();
		System.out.println(msg3);
		
		
		
	}

}
