package learnJava2;

public class Employee {
	
	String empname;
	String empID;
	String empDesg;
	String empSalary;
	
	 Employee(String empname,String empID,String empDesg,String empSalary)
	{
		this.empname=empname;
		this.empID=empID;
		this.empDesg=empDesg;
		this.empSalary=empSalary;
		
	}
	
	public static void main(String[] args) {
		Employee cp=new Employee("Praveen","ID001","SE","8 lakhs");
		
		System.out.println("Emp details............");
		System.out.println(cp.empID);
		System.out.println(cp.empname);
		System.out.println(cp.empDesg);
		System.out.println(cp.empSalary);
		System.out.println("Emp1 details............");
		
		Employee cp2=new Employee("Praveen","ID001","SE","6 lakhs");
		System.out.println(cp2.empID);
		System.out.println(cp2.empname);
		System.out.println(cp2.empDesg);
		System.out.println(cp2.empSalary);
		
		
	}

}
