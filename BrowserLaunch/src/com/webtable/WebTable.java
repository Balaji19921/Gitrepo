package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_table_responsive.asp");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("mainLeaderboard"));
	    List<WebElement> l1= driver.findElements(By.tagName("tr"));
	    //System.out.println(l1.get(2).getText());
	    for(WebElement data: l1)
	    {
	    	String name = data.getText();
	    	System.out.println(name);
	    }
	    int length= l1.size();
	    System.out.println(length);
	    
	    WebElement w1= l1.get(1);
	    System.out.println(w1.getText());
	    
	    WebElement w2= l1.get(2);
	    System.out.println(w2.getText());
	    
	    
	    WebElement w3=l1.get(3);
	    System.out.println(w3.getText());
	    
 List<WebElement> l2 = w1.findElements(By.tagName("td"));
	   
	    
	    for (WebElement datas : l2)
	    {
	    	String names= datas.getText();
	    	System.out.println(names);
	    	
	    	
	    }
	    
List<WebElement> l3 = w2.findElements(By.tagName("td"));
	   
	    
	    for (WebElement datas1 : l3)
	    {
	    	String names1= datas1.getText();
	    	System.out.println(names1);
	    	
	    	
	    }
	    
	    
List<WebElement> l4 = w3.findElements(By.tagName("td"));
	   
	    
	    for (WebElement datas2 : l4)
	    {
	    	String names2= datas2.getText();
	    	System.out.println(names2);
	    	
	    	
	    }
	    
	       
	    
	   
	}

}
