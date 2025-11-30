package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {
public void verifyWebElementCommands() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagetextbox=driver.findElement(By.id("single-input-field"));
	messagetextbox.sendKeys("Fathima");
	WebElement showMessagebutton=driver.findElement(By.id("button-one"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(showMessagebutton));
	
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
	.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.elementToBeClickable(showMessagebutton));
	
	showMessagebutton.click();
	System.out.println(showMessagebutton.isDisplayed());
	System.out.println(showMessagebutton.isEnabled());
	
	WebElement text=driver.findElement(By.id("message-one"));
	System.out.println(text.getText());
	System.out.println(text.getTagName());
	messagetextbox.clear();
	System.out.println(showMessagebutton.getCssValue("background-color"));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebElementCommands webElementCommands = new WebElementCommands();
webElementCommands .initializeBrowser();
webElementCommands.verifyWebElementCommands();
	}

}
