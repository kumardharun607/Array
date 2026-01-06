import java.util.*;
class max_sum_sub_array_by_using_kadanes
{
	public static void main(String[] args) 
	{
		int a[]={2,-3,7,-4,6};
		int curr_sum=0;
		int max_sum=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			
				curr_sum+=a[i];
				max_sum=Math.max(max_sum,curr_sum);
				if (curr_sum<0)
				{
					curr_sum=0;
				}
			
		}
		System.out.println("The maximum sub array element is "+max_sum);
	}
}
