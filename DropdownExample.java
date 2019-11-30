package learnJava2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver dr=new FirefoxDriver();
          dr.get("https://in.ebay.com/");
          dr.manage().window().maximize();
          Thread.sleep(10000);
          WebElement dropdown=dr.findElement(By.id("gh-cat"));
          Select s=new Select(dropdown);
         // s.selectByValue("550");
         // s.selectByVisibleText("Stamps");
          //s.selectByIndex(4);
          WebElement defaultvalue=s.getFirstSelectedOption();
          System.out.println(defaultvalue);
          List<WebElement> list=s.getOptions();
          
          for(int i=0;i<list.size();i++)
          {
        	  System.out.println(list.get(i).getText());
          }
          
          dr.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
          Thread.sleep(1000);
          WebElement checbox1=dr.findElement(By.name("permission"));
          Thread.sleep(10000);
          boolean b=checbox1.isSelected();
          if(b==true)
          {
        	  System.out.println("Checkbox is already selected.....");
             // checbox1.click();
          }
          else
          {
        	  System.out.println("Checkbox is not selected now checking...");
              checbox1.click();

          }
          
         // dr.quit();
		
	}

}
