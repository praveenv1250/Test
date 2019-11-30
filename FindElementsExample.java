package learnJava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("http://amazon.com");
        dr.manage().window().maximize();
        List<WebElement> list=dr.findElements(By.tagName("a"));
        int s=list.size();
        System.out.println("List Of links count: "+s);
        int count=0;
        for(int l=0;l<list.size();l++)
        {
        	if(!list.get(l).getText().equals(""))
        	{
        		System.out.println(list.get(l).getText());
        		count++;
        	}
        }
        
        System.out.println("Count of visible links availabe on the page: "+count);
        dr.findElement(By.linkText("linkText"));
		
	}

}
