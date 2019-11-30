package learnJava2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindow {
	
	public void Handlewindow(WebDriver dr, String wname)
	{
		Set<String> ids=dr.getWindowHandles();
		String wb=dr.getWindowHandle();
	String str=dr.getWindowHandle();
	String str2=dr.getTitle();
	System.out.println(str2);
	System.out.println(str);
		System.out.println(wb);
		for(String id:ids)
		{
			
			dr.switchTo().window(id);
			if(dr.getTitle().equals(wname))
			{
				//dr.manage().window().maximize();
				
				dr.close();
				
			}
			
		}
		
		//dr.switchTo().window(str2);
	}
	
public static void main(String args[]) throws Exception
{
	WebDriver dr=new FirefoxDriver();
	dr.get("https://www.naukri.com");
	//dr.switchTo().window("LnT").close();
	
	HandlingWindow hw=new HandlingWindow();
	hw.Handlewindow(dr, "Tech Mahindra");
	Thread.sleep(1000);
	hw.Handlewindow(dr,"Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
}

}
