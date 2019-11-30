package learnJava2;

public class FirstProgram {
	static int i=100;
	char a='v';
	String name="praveen";
	double d=100.55;
	float f2=20.34f;
	
	public void sum()
	{
		double sum=d+10;
		System.out.println(sum);
	}
	public int square()
	{
		int sq=20;
		int res=sq*sq;
		System.out.println(res);
		return res;
		
	}
	
	public int sub(int y)
	{
		int x=100;
		int res2=x-y;
		System.out.println("Inside the sub method: "+res2);
		return res2;
	}
	
	public static void main(String[] args)
	{
		System.out.println("praveen");
		//i=i++;
		 i=300;
		 
		System.out.println(i);
		FirstProgram fp=new FirstProgram();
		fp.sum();
		int newres=fp.square()+1;
		System.out.println("Print Square and add value 1: "+newres);
		fp.sub(57);
		
	}
}
