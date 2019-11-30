package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.apsrtconline.in/oprs-web/");
		WebElement FrmDate=dr.findElement(By.id("txtJourneyDate"));
		FrmDate.click();
		

	}

}
