package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {
	public static void main(String args[])
	{
		
		WebDriver dr=new ChromeDriver();
				
		dr.get("https://www.EBAY.com");
		dr.manage().window().maximize();
		WebElement searchtxtbox=dr.findElement(By.id("gh-ac"));
		searchtxtbox.sendKeys("Dell laptop");
		WebElement searchbtn=dr.findElement(By.id("gh-btn"));
		searchbtn.click();
		dr.navigate().back();
		//dr.close();
		
		try{
			dr.quit();
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		
			System.out.print("exception:  ");
			//System.out.println(e.getMessage());
		}
		
		

		
	}


