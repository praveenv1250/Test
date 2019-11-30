package learnJava2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExceptions {
	public static void main(String[] args) {
		
		WebDriver dr=new ChromeDriver();
		System.out.println("In try block1: chrome browser launch");
		
		try{
			dr.get("jhgdfhj");
		}
		
		catch(WebDriverException e)
		{
			System.out.println(e.getMessage());
		}
		/*catch(IllegalStateException ie)
		 * 
		{
			System.out.println(ie.getMessage());
		}*/
		
		
	
		
	}

}
