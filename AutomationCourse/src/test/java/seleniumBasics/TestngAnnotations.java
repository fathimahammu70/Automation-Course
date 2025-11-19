package seleniumBasics;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	@Test
	public void sampleTestCase() {
		System.out.println("Test case");
	}
	
	@BeforeClass
	public void beforeMethodSample() {
		System.out.println("Before Method");
	}
	@AfterMethod                
	public void afterMethodSample() {
		System.out.println("After Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

}

