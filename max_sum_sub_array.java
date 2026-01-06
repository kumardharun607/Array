import java.util.*;
class max_sum_sub_array 
{
	public static void main(String[] args) 
	{
		int a[]={2,-3,7,-4,6};
		
		int max_sum=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			int curr_sum=0;
			for (int j=i;j<a.length ;j++ )
			{
				curr_sum+=a[j];
				max_sum=Math.max(max_sum,curr_sum);
			}
		}
		System.out.println("The maximum sub array element is "+max_sum);
	}
}
