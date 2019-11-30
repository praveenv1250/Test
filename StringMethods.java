package learnJava2;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Selenium Automation";
       String str1="Testing";
       int len=str.length();
       System.out.println(len);
       
       char ch=str.charAt(4);
       System.out.println(ch);
       
      String str3=str.replace("Automation", "Testing");
      System.out.println(str3);
      
     int ind=str.indexOf('m');
     System.out.println(ind);
     
     boolean b=str.equals(str1);
     System.out.println(b);
     
      
       
	}

}
