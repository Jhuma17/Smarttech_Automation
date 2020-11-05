package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest3 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		

	System. setProperty("webdriver.chrome.driver", "C:\\Users\\jhuma\\eclipse-workspace\\Smarttech_Automation\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
			      
			   driver.get("https://opensource-demo.orangehrmlive.com/");
	
	           driver.manage().window().maximize();
	          
	           WebElement ele =driver.findElement(By.id("txtUsername"));
	               ele.sendKeys("Admin");
	               
	           WebElement ele1 =driver.findElement(By.id("txtPassword"));
	               ele1.sendKeys("admin123");
	
	           WebElement ele2 =driver.findElement(By.name("Submit"));
	               ele2.click();
	
	           System.out.println(driver.getTitle());
	
	         
	                System.out.println("Test Pass");
	
	
	
	
	}

}
