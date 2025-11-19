package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJs extends Base {

public void verfyJsExecutor() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;   //casting
		js.executeScript("arguments[0].click();", showMessageButton);
		
		js.executeScript("window.scrollBy(0,350)", ""); //scroll down
		//js.executeScript("window.scrollBy(0,-350)", ""); //scroll up
}
	public static void main(String[] args) {
		HandlingJs handlingJs=new HandlingJs();
		handlingJs.initializeBrowser();
		handlingJs.verfyJsExecutor();

	}

}