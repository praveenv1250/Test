package learnJava2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ffprofile {
	public static void main(String[] args) {
		//ProfilesIni ini=new ProfilesIni();
		//FirefoxProfile fp=ini.getProfile("praveen");
		//WebDriver dr=new FirefoxDriver(fp);
		//dr.manage().window().maximize();
		//dr.get("https://www.google.com");
		//System.setProperty("webdriver.ie.webdriver", "D://Learning Java_Selenium//BrowserDrivers//IEDriverServer_x64_2.53.1//IEDriverServer.exe");
        
		//WebDriver dr=new InternetExplorerDriver();
		//dr=new InternetExplorerDriver();
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
		WebElement textbox=dr.findElement(By.name("q"));
		textbox.sendKeys("vinayaka");
		
		WebElement textbox1=dr.findElement(By.name("q"));
		textbox1.click();
		WebElement searchbutton=dr.findElement(By.name("btnK"));
		searchbutton.click();
		
		
		//dr.quit();
		
		
	}

}
