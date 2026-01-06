/*import java.util.*;
class  Add_only_integer_in_array
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		char a[]={'D','3','H','9','A','8','R','3','U','0','N'};
		
		System.out.println("Array A:"+Arrays.toString(a));
		
		int sum=0;
			for (int j=0;j<a.length ;j++ )
			{
				if (a[j]>='0' && a[j]<='9')
				{
					sum+=a[j]-48;
				}
				
				
			}
			
		
		System.out.println("The sum of all elements in the array is "+sum);
		



	}
}
*/class Test {
    static int x=10;
	static{
		System.out.println("Test MLI");
	}
	static int y=printx();
	static int printx()
	{
		System.out.println("Value of Test (y):"+y);
		return 10;
	}
	
}
class Test1{
	static int y=20;
	
	public static void main(String[]args)
	{
		System.out.println("Main method start");
		System.out.println("Value of x="+Test.x);
		System.out.println("Value of y="+y);
		System.out.println("Value of x="+Test.x);
		System.out.println("Main method end");
	}
	static 
	{
		System.out.println("value of Y="+y);
		System.out.println("Test1 MLI");
	}
		


}
