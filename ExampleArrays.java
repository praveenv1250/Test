package encapsulation;

public class ExampleArrays {

	public static void main(String[] args) {
		
		ExampleArrays er=new ExampleArrays();
		er.cal();

	}
	
	public void cal()
	{
		int[] arr={2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			//int temp=arr[i];
			//System.out.println(arr[i]);
			for(int j=0;j<arr.length;j++)
			{
				int temp=arr[i]+arr[j];
				if(temp==9)
				{
					System.out.println(""+arr[i]+ " + "+arr[j]+"(Sum of two numbers is 9)");
				}
			}
		}
	}

}
