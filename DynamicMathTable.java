package learnJava2;

//import java.util.Scanner;

public class DynamicMathTable {

	public static void table(int x)
	{
		for(int i=1;i<=10;i++)
		{
			int n=x*i;
			System.out.println(x +"*"+i+" = "+n );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int number=sc.nextInt();
		int num=(int)(Math.random()*20);
          //table(number);
		table(num);
	}

}
