   package com.selenium.automation;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

   public class AmazonFunctionalTest {

	public static void main(String[] args) {


   System. setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

     WebDriver driver=new ChromeDriver();
	
	 driver.get("https://www.amazon.com/");
	 
	 driver.manage().window().maximize();
	
     WebElement ele=driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
       ele.click();
	
     WebElement ele1=driver.findElement(By.name("email"));
	      ele1.sendKeys("jhumasadia@icloud.com");
	
	 WebElement ele2=driver.findElement(By.id("continue"));
	      ele2.click();
	
	 WebElement ele3=driver.findElement(By.name("password"));
	      ele3.sendKeys("Tuktuki2712");
	      
	 WebElement ele4=driver.findElement(By.id("signInSubmit"));
	       ele4.click();
	
	 System.out.println(driver.getTitle());
	
	 WebElement ele5=driver.findElement(By.linkText("Whole Foods"));
	        ele5.click();
	
	 System.out.println("Test Pass");
	
	
	
	}

}
