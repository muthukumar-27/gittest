package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class test1 {

	public static void main(String arg[]) throws IOException
	{
		
		AppiumDriver<MobileElement> d;
	
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability("deviceName", "Lenovo K8 Plus");
		ds.setCapability("udid", "HGAE6Q83");
		ds.setCapability("platformName", "Android");
		ds.setCapability("platformVersion", "8.0.0");
		ds.setCapability("appPackage", "com.google.android.calculator");
		ds.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		
		
		
		d=new AppiumDriver<MobileElement>(url,ds);
		
		System.out.println("Test Started....");
		
		MobileElement m1=d.findElement(By.id("com.google.android.calculator:id/digit_5"));
		MobileElement m2=d.findElement(By.id("com.google.android.calculator:id/op_mul"));
		MobileElement m4=d.findElement(By.id("com.google.android.calculator:id/digit_9"));
		MobileElement m3=d.findElementByAccessibilityId("equals");
		
		m1.click();
		m2.click();
		m4.click();
		m3.click();
		
		MobileElement m5=d.findElement(By.id("com.google.android.calculator:id/result"));
		
		System.out.println("Result"+":"+m5.getText());
		
		
		
	}
	
	
	
	
	
}
