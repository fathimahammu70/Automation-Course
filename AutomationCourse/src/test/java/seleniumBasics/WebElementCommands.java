package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
public void verifyWebElementCommands() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagetextbox=driver.findElement(By.id("single-input-field"));
	messagetextbox.sendKeys("Fathima");
	WebElement showMessagebutton=driver.findElement(By.id("button-one"));
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
