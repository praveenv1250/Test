package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practicexpath {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver dr=new FirefoxDriver();
		
		
		dr.get("https://www.gmail.com");
		dr.manage().window().maximize();
		System.out.print("enter email");
		WebElement textbox=dr.findElement(By.name("identifier"));
		textbox.sendKeys("praveen");
		System.out.print("click on the  next button TC1");
		WebElement nextbtn=dr.findElement(By.xpath(".//*[@class='RveJvd snByac']"));
		nextbtn.click();
		Thread.sleep(2000);
		//.//*[@class='jibhHc']
		WebElement errormsg=dr.findElement(By.xpath(".//*[@name='identifier']//following::div[7]"));
		String Actualmsg=errormsg.getText();
		System.out.println("Verify Error message: "+Actualmsg);
		String expectedmsg="Couldn't find your Google Account";
		if(Actualmsg.equals(expectedmsg))
		{
			System.out.println("Test case1: Pass");
		}
		else
		{
			System.out.println("Test case1: fail");
		}
		
		Thread.sleep(2000);
		
		dr.navigate().back();
		Thread.sleep(2000);
		
		WebElement nextbtn2=dr.findElement(By.xpath(".//*[@class='RveJvd snByac']"));
		nextbtn2.click();
		Thread.sleep(2000);
		
		WebElement errormsg2=dr.findElement(By.xpath(".//*[@name='identifier']//following::div[7]"));
		System.out.println(errormsg2);
		String Actualmsg2=errormsg2.getText();
		String expectedmsg2="Couldn't find your Google Account22";
		
		if(Actualmsg2.equals(expectedmsg2))
		{
			System.out.println("Test case2: Pass");
		}
		else
		{
			System.out.println("Test case2: fail");
		}
		
		
		
	}

}
