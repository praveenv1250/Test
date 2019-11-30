package encapsulation;

public class TestCase1 extends Base {
String browsername="firefox";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCase1 cd=new TestCase1();
		cd.initBrowser();
		
	}
	public void initBrowser()
	{
		WebDriver dr= getBrowserInstance(browsername);
		dr.getTitle();
		dr.sendKeys();
		dr.click();
	}
		

	

}
