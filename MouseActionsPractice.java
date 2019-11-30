import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr=new FirefoxDriver();
		dr.get("https://in.ebay.com");
		Thread.sleep(1000);
		Actions act=new Actions(dr);
		//Mouse Hover
		WebElement mo=dr.findElement(By.linkText("Electronics"));
		Thread.sleep(1000);
		System.out.println("Print");
		act.moveToElement(mo).perform();
		WebElement deals=dr.findElement(By.linkText("Deals"));
		act.moveToElement(deals).perform();
		//act.moveToElement(deals, xOffset, yOffset)
		
		
		
		
	}
	
}