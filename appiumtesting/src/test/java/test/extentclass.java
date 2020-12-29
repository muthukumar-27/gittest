package test;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentclass {

	ExtentReports extent;
	ExtentSparkReporter spark;
	@BeforeSuite
	public void setup()
	{
		extent = new ExtentReports();
       spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);
	}
	@Test
	public void testin()
	{
		System.out.println("Testign started");
	}
	
	@AfterSuite
	public void teardown()
	{
	extent.flush();	
	}
	
	
}
