package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	public void verifyRightClick() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.contextClick(others).build().perform();
	}
	public void verifyMouseHover() {
		WebElement others = driver.findElement(By.id("others"));
		Actions action = new Actions(driver);
		action.moveToElement(others).build().perform();
	}
	public void verifyDragandDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, drop).build().perform();
	}
	public void verifyKeyboardAction() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions ha = new HandlingActions();
		ha.initializeBrowser();
		// ha.verifyrightclick();
		// ha.verifyMouseHover();
		// ha.verifyDragandDrop();
		try {
			ha.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}