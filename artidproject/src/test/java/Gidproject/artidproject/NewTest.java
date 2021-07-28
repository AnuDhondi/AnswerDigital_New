package Gidproject.artidproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  
  
		WebDriver bo;
		
		  @Test(enabled=true,priority=2,groups="Login")
		  public void testcase1_1() {
			  //Valid Username and invalid password
			  bo.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
			  bo.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
			  bo.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
			  bo.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
			  Assert.assertEquals(bo.findElement(By.xpath("//div[@id='flash']")).getText(), "Your password is invalid!\n"
			  		+ "×");
		  }
		  
		  @Test(enabled=true,priority=2,groups="Login")
		 public void testcase1_2(){
			 //Invalid Usename and Valid password
			  
			  bo.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
			  bo.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith1");
			  bo.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
			  bo.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
			  Assert.assertEquals(bo.findElement(By.xpath("//div[@id='flash']")).getText(), "Your username is invalid!\n"
				  		+ "×");
		  }
		  
		  @Test(enabled=true,priority=2,groups="Login")
		  public void testcase1_3(){
			  //Valid Username and Valid Password
			  
			  bo.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
			  bo.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
			  bo.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
			  bo.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
			  bo.findElement(By.xpath("//body/div[2]/div[1]/div[1]/a[1]")).click();
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



