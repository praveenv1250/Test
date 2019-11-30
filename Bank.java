package encapsulation;

public class Bank {
	
	private long AccNo=63784;
	private int pinNo=1234;
	public int AvalBalance=10000;
	
	public void withdraw(long AcN,int Apin,int Amount)
	{
		if (AccNo==AcN && pinNo==Apin)
		{
			System.out.println("Valid Account and PinNo....");
			AvalBalance=AvalBalance-Amount;
			System.out.println("Available Balance :"+AvalBalance);
			
			if(Amount>=AvalBalance)
			{
				System.out.println("No sufficient balance to withdraw...");
			}
			else
			{
				System.out.println("Amount withdrawn"+Amount);
			}
			}
		
		else
		{
			System.out.println("Inavlid Credentials..");
		}
	
		}

	

	public void updatepin(long Ano,int oldpin,int newpin)
	{
		if (AccNo==Ano && oldpin==pinNo)
		{
			pinNo=newpin;
			System.out.println("pin changed Successfully......");
		}
		
		else 
		{
			System.out.println("Invalid pin Number .....");	
		}
	}
	
	public int depositCash(long Acno,int pin,int dAmount)
	{
		System.out.println("Actual pin"+pinNo);
		System.out.println("Passed pin"+pin);
		
		if (AccNo==Acno)  
		{
			if(pin==pinNo)
		 System.out.println("Valid AccountNo: Deposit amount"+dAmount);
		 AvalBalance=AvalBalance+dAmount;
		}
		
		else 
		{

			System.out.println("Inavlid Accountnumber Or  pin no");
		}

		
		return AvalBalance;
		}
	
}

