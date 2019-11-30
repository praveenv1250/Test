package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.quackit.com/javascript/javascript_alert_box.cfm/");
		WebElement fr=dr.findElement(By.name("result1"));
		dr.switchTo().frame(fr);
		dr.findElement(By.xpath(".//*[@value='Click me']")).click();
		String str=dr.switchTo().alert().getText();
		System.out.println(str);
		dr.switchTo().alert().accept();

	}

}
