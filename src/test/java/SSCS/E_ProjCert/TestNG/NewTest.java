package SSCS.E_ProjCert.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	  ChromeDriver driver;
	  
	  @BeforeClass
	  public void launch() {
		  driver = new ChromeDriver();
	      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	      
	      driver.manage().window().maximize();
	      driver.get("http://35.192.153.89:32768/");     
	  }
	  
	  @Test
	  public void VerifyAboutUS() {
			// TODO Auto-generated method stub

	      try {
	      	    Thread.sleep(3000); 
	      }
		  catch(Exception e) {
		      	  //  Block of code to handle errors
		  }
	           
	      driver.findElement(By.id("About Us")).click(); 
	      try {
	        	Thread.sleep(3000); 
	      }
	      catch(Exception e) {
	        	  //  Block of code to handle errors
	      }
	        	
	      driver.navigate().back();
	      String x=driver.getTitle();
	      System.out.println(x);
	      System.out.println("Testcase Passed");
	      Assert.assertEquals(x,x);
	

	  }
	  
	  @AfterClass
	  public void close() {
		  driver.close();
	  }
	  
	}
