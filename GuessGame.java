package learnJava2;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        GuessGame g=new GuessGame();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10: ");
        int inputnum=(int)(Math.random()*10);
		System.out.print(inputnum);
        int num=sc.nextInt();
        sc.close();
		
		if(num==inputnum)
		System.out.println("Well done ur guess is correct :)");
		else
			g.looser();
	}
	public void looser()
	{
		int looseNum=(int)(Math.random()*7);
		if(looseNum==0)
		System.out.println("u r so stupid");
		else if (looseNum==1)
			System.out.println("u r so nice");
		else if (looseNum==2)
			System.out.println("u r so Crazy");
		else if (looseNum==3)
			System.out.println("u r so clever");
		else if (looseNum==4)
			System.out.println("u r so Beautiful");
		else if (looseNum==5)
			System.out.println("u r so Dynamic");
		else
			System.out.println("U r Looser :{");
		
		
	}

}
