package com.dropdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		    
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 WebElement w1= driver.findElement(By.xpath("//a[text()='Create new account']"));
		 w1.click();
		Thread.sleep(3000) ;
		WebElement day = driver.findElement(By.id("day"));
		Select s1= new Select(day);
		 s1.selectByIndex(4);
		 Thread.sleep(4000);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		 Select s2= new Select(month);
		  s2.selectByValue("4");
		  Thread.sleep(4000);
		 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		  Select s3= new Select(year);
		  s3.selectByVisibleText("1992");
		  Thread.sleep(4000);
		 List<WebElement> list= s1.getOptions();
		 int size=list.size();
		 
		 for (int i=0;i< size;i++)
		 {
			String val= list.get(i).getText();
			System.out.println(val);
		 }
		
		
		 System.out.println("size :"+list.size());
		 
		 List<WebElement> list1= s2.getOptions();
		 int size1=list1.size();
		 for (int i=0;i< size1;i++)
		 {
			String val= list1.get(i).getText();
			System.out.println(val);
		 }
		
		
		 System.out.println("size :"+list1.size());
		 
		 List<WebElement> list2= s3.getOptions();
		 
		 int size2=list2.size();
		 for (int i=0;i< size;i++)
		 {
			String val= list2.get(i).getText();
			System.out.println(val);
		 }
		
		 System.out.println("size :"+list2.size()); 
		 
		 
		 WebElement day1 = list.get(0);
		 String dayvalue = day1.getText();
		 System.out.println("day  " + dayvalue);
		 
		WebElement firstindex = list1.get(0);
		String firstvalue= firstindex.getText();
		System.out.println("Month name is " + firstvalue);
		
		int length = s1.getOptions().size()-1;
		 
		WebElement lastindex = list2.get(length);

		String lastvalue = lastindex.getText();
		System.out.println("Year is " + lastvalue);
		
		
		int middle= (length/2);
		WebElement midelement = list.get(middle);
		String middlevalue= midelement.getText();
		System.out.println("Middle Element is :" + middlevalue);
		
		
		
	for ( int i= s2.getOptions().size()-5 ; i<s2.getOptions().size() ; i++)
	{
		WebElement value = list1.get(i);
		String v1= value.getText();
		System.out.println(v1);
		
	}
	
	}
}

