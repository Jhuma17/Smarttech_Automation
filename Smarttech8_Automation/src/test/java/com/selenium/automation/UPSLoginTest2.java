  package com.selenium.automation;

  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;

  public class UPSLoginTest2 {
   
	 static WebDriver driver;
	
  public static void main(String[] args) {
          //open Chrome browser
	   System. setProperty("webdriver.chrome.driver", "C:\\Users\\jhuma\\eclipse-workspace\\Smarttech_Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	      //enter the URL
	   
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
	      //manage the page
	    
	    driver.manage().window().maximize();
	      // define the test pass/fail
	    
	    System.out.println("Test Pass");
	       //click on sign up/log in button
	   
	    // driver.findElement(By.xpath("(//*[@id='ups-header']//descendant::a[8])[1]")).click(); //x path formula 1
	    
	    driver.findElement(By.xpath("(//a[@class='ups-analytics'])[6]")).click(); //x path formula 2
	    
	    //driver.findElement(By.xpath("//a[text()='Sign up / Log in']")).click(); // x path formula 3
	      
	    //click on log in button
	    
	    driver.manage().deleteAllCookies();
	   
	    driver.findElement(By.xpath("//*[@class='ups-link']")).click();
	   
	    // driver.findElement(By.xpath("//a[text()='Log in ']")).click();
	       //enter valid email/user name
	    
	    driver.findElement(By.id("email")).sendKeys("jhumarayyan@gmail.com");
	       //enter valid password
	    
	    driver.findElement(By.id("pwd")).sendKeys("Tuktuki2712");
	       //submit username & password
	    
	   driver.findElement(By.id("submitBtn")).click();
	 
	    System.out.println(driver.getTitle());
	 
       driver.findElement(By.partialLinkText("Services")).click();
  
         //driver.findElement(By.xpath("(//a[text()='Shipping'])[2]")).click();
  
  
  }
	 
	 
  }
	
 


