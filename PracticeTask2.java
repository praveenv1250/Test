package learnJava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTask2 {
	
	public String verifycheckbox(WebDriver dr) throws InterruptedException
	{
		Thread.sleep(10000);
		dr.manage().window().maximize();
        List<WebElement> checbox1=dr.findElements(By.xpath(".//input[@type='checkbox']"));
        Thread.sleep(10000);
        String isChecked=null;
        for(int i=0;i<checbox1.size();i++)
        {
        	Thread.sleep(10000);
        	if(checbox1.get(i).isSelected())
        	{
        		isChecked="Checkbox is already selected";
        	}
        	else
        	{
        		checbox1.get(i).click();
        	    isChecked="Now Checkboxes are selected";
        	}
        	
        }
        return isChecked;	
	}

	
	
	public String verifyRadiobtn(WebDriver dr)
	{
		  List<WebElement> radiobtn=dr.findElements(By.xpath(".//input[@type='radio']"));
		  String rd=null;
	        for(int j=0;j<radiobtn.size();j++)
	        {
	        	if(radiobtn.get(j).isSelected())
	        	{
	        		rd=radiobtn.get(j).getText();
	        		
	        	}
	        	
	        	else
	        	{
	        	     rd="Radion Button is not selected";
	        	}
	        }
	        
	        return rd;
	}
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
        WebDriver dr=new FirefoxDriver();

		dr.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		PracticeTask2 pt2=new PracticeTask2();
		pt2.verifycheckbox(dr);
		pt2.verifyRadiobtn(dr);
       
        
      
        
       
	}

}
