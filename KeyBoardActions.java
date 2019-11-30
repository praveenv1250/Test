package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr=new FirefoxDriver();
		dr.get("https://ebay.com");
		Thread.sleep(10000);
		Actions act=new Actions(dr);
		act.keyDown(Keys.LEFT_CONTROL).sendKeys(Keys.F5).keyUp(Keys.LEFT_CONTROL).perform();
		Thread.sleep(10000);
		WebElement ae=dr.findElement(By.id("gh-ac"));
		ae.sendKeys("Hello");
		Thread.sleep(1000);
	
		act.keyDown(Keys.LEFT_CONTROL).sendKeys(Keys.chord("a")).keyUp(Keys.LEFT_CONTROL).perform();
		//act.dragAndDrop(source, target)

	}

}
