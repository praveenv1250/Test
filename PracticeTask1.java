package learnJava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeTask1 {
	
	public String verifyDropdown(WebDriver dr,String val)
	{
		     dr.manage().window().maximize();
	         WebElement drpdown=dr.findElement(By.id("gh-cat"));
	         Select s=new Select(drpdown);
	         String result1 = null;
	         List<WebElement> list=s.getOptions();       
	       
	         for(int j=0;j<list.size();j++)
	         { 
	        	 
	        	 if(list.get(j).getText().equals(val))
	        	 {
	        		result1="Element found";
                    break;
	          
	          	}
	          	
	        	 else
	        	 {
	        		
	        		 result1="Element not found";
	        	 }
	       }
			return result1;
	}
	
	public static void main(String[] args) 
	{
		WebDriver dr=new FirefoxDriver();
		dr.get("https://in.ebay.com/");
        PracticeTask1 pt=new PracticeTask1();
        String val=pt.verifyDropdown(dr,"Music");
        System.out.println(val);
       String val1=pt.verifyDropdown(dr,"Art");
       System.out.println(val1);
       System.out.println(val1);
         
	}

}
