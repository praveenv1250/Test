package learnJava2;

public class PracticeStaticMethod {

	public static void main(String[] args) {
		
		PracticeStaticMethod psm=new PracticeStaticMethod();
		psm.goMethod1();
		// TODO Auto-generated method stub

	}
	
	public void goMethod1()
	{
		System.out.println("Inside goMethod1");
		goMethod2();
		
	}
	
	public static void goMethod2()
	{
		System.out.println("Inside goMethod2");
		//goMethod3();
		
	}
	
	public void goMethod3()
	{
		System.out.println("Inside goMethod3");
		
		
	}
	
	

}
