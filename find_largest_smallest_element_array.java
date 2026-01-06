import java.util.*;
class find_largest_smallest_element_array
{
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		
		System.out.println(Arrays.toString(a));
		
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("The largest value is :"+largest);
		int smallest=Integer.MAX_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The smallest value is :"+smallest);
	}
	
}
