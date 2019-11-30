package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameExample {
	
	public void frames(WebDriver dr) throws InterruptedException
	{
		dr.manage().window().maximize();
		dr.get("https://paytm.com");
		String title=dr.getWindowHandle();
		WebElement link=dr.findElement(By.xpath(".//*[@class='_3ac-']"));
		link.click();
		Thread.sleep(10000);
		WebElement fr=dr.findElement(By.tagName("iframe"));
		dr.switchTo().frame(fr);
		Thread.sleep(10000);
		WebElement lgin=dr.findElement(By.xpath(".//*[@class='qrcode-footer-text']/span"));
		lgin.click();
		Thread.sleep(10000);
		//dr.switchTo().frame(fr);
		dr.switchTo().window(title);
		WebElement c=dr.findElement(By.xpath(".//*[@class='_3i6R']"));
	    c.click();
		//dr.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr=new FirefoxDriver();
		
		FrameExample fe=new FrameExample();
		fe.frames(dr);
		
		
		

	}

}
