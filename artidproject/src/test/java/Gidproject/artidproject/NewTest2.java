package Gidproject.artidproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver bo;
  @Test
  public void f() throws InterruptedException {
	  bo.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();	
		Thread.sleep(1000);
		bo.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.SPACE);	
		Thread.sleep(1000);
		bo.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ESCAPE);	
		Thread.sleep(1000);
		bo.findElement(By.xpath("//input[@id='target']")).sendKeys("1");	
		Thread.sleep(1000);
		bo.findElement(By.xpath("//input[@id='target']")).sendKeys("A");	
		Thread.sleep(1000);
	  }
	  
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Annu\\Desktop\\Selenium\\Browser drivers\\chromedriver.exe");
		     bo=new ChromeDriver();
			bo.get("http://the-internet.herokuapp.com");
	  }

	  @AfterMethod
	  public void afterMethod() {
		 bo.close();

	}
  }

