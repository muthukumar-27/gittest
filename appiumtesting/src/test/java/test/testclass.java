package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class testclass extends baseclass {
	
	
	@Test
	public void testone()
	{
		ExtentTest test=extent.createTest("Testone","testcase for search");
		
		
		test.generateLog(Status.INFO, "Test one started");
		d.get("http://www.google.com");
		test.generateLog(Status.PASS, "HIT GOOGLE.COM");
		d.findElement(By.name("q")).sendKeys("hello google");
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	  @Test
	  public void testtwo() {
	    d.get("https://opensource-demo.orangehrmlive.com/");
	    d.findElement(By.id("txtUsername")).click();
	    d.findElement(By.id("txtUsername")).clear();
	    d.findElement(By.id("txtUsername")).sendKeys("Admin");
	    d.findElement(By.id("txtPassword")).click();
	    d.findElement(By.id("txtPassword")).clear();
	    d.findElement(By.id("txtPassword")).sendKeys("admin123");
	    d.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
	   
	    d.findElement(By.id("welcome")).click();
	    d.findElement(By.linkText("Logout")).click();
	  }
}
