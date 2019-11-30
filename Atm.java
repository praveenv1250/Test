package encapsulation;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.updatepin(63784, 1234, 1250);
		b.withdraw(63784, 1250, 10);
		b.depositCash(63784, 1250, 100);
		int a=b.AvalBalance;
		System.out.println("Total Available Balance :"+ a);

	}

}
