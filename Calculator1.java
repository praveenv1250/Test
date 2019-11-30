package learnJava2;

public class Calculator1 {
	
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public int sub(int d,int e)
	{
		int sub1=d-e;
		System.out.println(sub1);
		return sub1;
	}
	
	public int mul(int f,int g)
	{
		int mul1=f*g;
		System.out.println(mul1);
		return mul1;
	}
	
	public int div(int h,int i)
	{
		//int div1=h/i;
		//System.out.println(div1);
		return h/i;
	}
	
	public static void main(String args[])
	{
		Calculator1 c1=new Calculator1();
		c1.add(10, 20);
		c1.sub(80, 50);
		c1.mul(12, 5);
	int result=c1.div(100, 20);
	System.out.println("Result of Division:"+result);
	
	int num=(int)(Math.random()*20);
	System.out.println("Random Number: "+num);
	
	if(num>10)
      System.out.println(" Random Number " +num+ " is greater than 10");
	else
		System.out.println("Random Number " +num+ " is less than 10");
	}

}
