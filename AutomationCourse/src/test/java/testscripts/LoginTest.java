package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase {
 @Test
public void verifyWhetherUserIsAbleToLoginWithValidcredentials() {
	WebElement userName = driver.findElement(By.id("user-name"));
	userName.sendKeys("standard_user");
	
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("secret_sauce");
	
	WebElement loginButton = driver.findElement(By.id("login-button"));
	loginButton.click();
 }
 @Test
 public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() {
	 WebElement userName = driver.findElement(By.id("user-name"));
	 userName.sendKeys("locked_out_user");
	 
	 WebElement passWord = driver.findElement(By.id("password"));
	 passWord.sendKeys("secret_sause123");
	 
	 WebElement loginButton = driver.findElement(By.id("login-button"));
	 loginButton.click();
 }
 @Test
 public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() {
	 WebElement userName = driver.findElement(By.id("user-name"));
	 userName.sendKeys("locked_out_user123");
	 
	 WebElement passWord = driver.findElement(By.id("password"));
	 passWord.sendKeys("secret_sause");
	 
	 WebElement loginButton = driver.findElement(By.id("login-button"));
	 loginButton.click();
 }
 @Test
	public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndInvalidPassword() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("error_user1223");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("secret_sause1233");
		 
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	}
}
