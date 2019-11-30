package learnJava2;

public class MethodPractice {
	
	int a=100;
	String str="selenium";
	char ch='A';
	double d=100.25;
	
	public int add()
	{
		int b=20,c=30;
		int total=b+c;
		return total;
		
	}
	
	public int sub(int x,int y)
	{
		int result=x-y;
		return result;
	}
	
	public void square(int s)
	{
		int sq=s*s;
		System.out.println(sq);
	}
	public void display()
	{
		System.out.println(a);
		//int total;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		MethodPractice mp=new MethodPractice();
		System.out.println("--------------Instance Variables-------------------------------");
		System.out.println("Instance variable: "+mp.a);
		System.out.println("Instance variable: "+mp.ch);
		System.out.println("Instance variable: "+mp.str);
		System.out.println("Instance variable: "+mp.d);
		System.out.println("---------------------------------------------------------------");
		mp.add();
		int op=mp.sub(200, 100);
		System.out.println("subtraction result: "+op);
		System.out.println("Square of a number :");
		mp.square(8);
		System.out.println();
		
		
		
		
		
		
	}

}
