package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    static WebDriver driver;
	
	  public void loginTest(){
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); //(.) means in path inside the project
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoopla.com/");//..1st requirement
		
		driver.manage().window().maximize(); //..2  requirement
		//driver.navigate().to("https://www.zoopla.com/"); //..3  requirement
		    
		System.out.println("Test pass");
		
		driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();//..4 requirement 
		
		//driver.quit();
	    driver.findElement(By.xpath("(//a[text() ='Sign in'])[1]")).click();//text method
		
		//driver.findElement(By.xpath("(//*[@class='css-fa8dvy e11d441i1'])[4]")).click();// grouping method
	   
	     driver.findElement(By.id("signin_email")).sendKeys("jhumarayyan@gmail.com");//id locator
	   
	     driver.findElement(By.id("signin_password")).sendKeys("Tuktuki2712");
	 
	      driver.findElement(By.id("signin_submit")).click();
	    
       //driver.findElement(By.xpath("(//*[@id='ups-header']//descendant::a[8])[1]")).click();//descendant method

         driver.findElement(By.xpath("//*[@data-is-logged-in='false']/a")).click();//(/following::ul) following node as parent to child
	      
         driver.findElement(By.xpath("//*[@data-is-logged-in='false']/child::a")).click();// following node as parent to child
	     
         driver.findElement(By.xpath("//*[@data-is-logged-in='false']//parent::ul")).click();//presiding node as child to parent
        
         //*[@start-with='iPhone']   /* start-with  method

        //*[@end-with='iPhone']     /* end-with method

        //*[contains(@id,'ups-headerWrap')]    /* contains method

        //*[contains(text(),'United States - English')]  /* contains-text method
	  
        WebElement ele = driver.findElement(By.xpath("//*[@name='signin_password']"));  // new method
		 
          ele.sendKeys("SAYEDawan2008@"); // new method
		 
		   ele.submit();   // new method
	  
	  
	   
	  
	  
	  }
	
	    
	       public static void main(String[] args) {
	
	        LoginTest obj= new LoginTest();
	         obj.loginTest();
	 }
 }