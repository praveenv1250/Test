package encapsulation;

public class Base extends WebDriver{
	//String browserName
	public WebDriver getBrowserInstance(String browser)
	{
		if(browser.equals("firefox"))
		{
			return new FirefoxDriver();
		}
		else if(browser.equals("InternetExplorer"))
		{
		 return new InternetExplorer();
		 }
		
		else if(browser.equals("Chrome"))
		{
		 return new ChromeDriver();
		 }
		else 
		{
			return new FirefoxDriver();	
		}
	}
	

}
