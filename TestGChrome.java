package learnJava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGChrome {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		dr.get("http://flipkart.com");
		dr.manage().window().maximize();
		WebElement popup=dr.findElement(By.xpath(".//*[@class='_2AkmmA _29YdH8']"));
		//.//*[@class='_2AkmmA _29YdH8']
		popup.click();
	
		WebElement sb=dr.findElement(By.xpath(".//input[@name='q']"));
		sb.sendKeys("Belts");
	    WebElement findb= dr.findElement(By.xpath(".//*[@class='vh79eN']"));
	    findb.click();
	    dr.navigate().back();
	    Thread.sleep(1000);
	    List<WebElement> list=dr.findElements(By.id("container"));
	    int i=list.size();
	    System.out.println(i);
	    String str=list.toString();
	    System.out.println(str);
	    
	    
	    dr.get("http://demo.guru99.com/test/ajax.html");
	    List<WebElement> elements = dr.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());
	    
	    int[] arr=new int[20];
	    arr[0]=10;
	    arr[1]=20;
	    arr[2]=30;
	    int i1=arr.length;
	    System.out.println(i1);
	    for(int j=0;j<elements.size();j++)
	    {
	   System.out.println(elements.get(j).getText());
	    }
	    
	    //dr.close();
	       
		
		//popup.click();
		
		
		
	}
	

}
