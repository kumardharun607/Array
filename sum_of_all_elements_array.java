import java.util.*;
class  sum_of_all_elements_array
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		
		System.out.println("Array A:"+Arrays.toString(a));
		
		int sum=0;
			for (int j=0;j<a.length ;j++ )
			{
				sum+=a[j];
				
			}
			
		
		System.out.println("The sum of all elements in the array is "+sum);
		



	}
}
