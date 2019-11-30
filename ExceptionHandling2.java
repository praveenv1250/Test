package learnJava2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandling2 {
	public static void main(String args[]) throws FileNotFoundException
	{
		try{
		File file=new File("C:\\Users\\Praveen vadde\\Desktop\\MyText.txt");
		FileInputStream fis=new FileInputStream(file);
		fis.read();
		fis.close();
		System.out.println("File Input Stream");
		}
		
		catch(Exception e)
		{
			System.out.println("In catch Block");
			System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("After print Stack trace");
		}
		System.out.println("");
		System.out.println("After Try and Catch");
		
	}

}
