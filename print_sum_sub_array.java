import java.util.*;
class print_sum_sub_array 
{
	public static void main(String[] args) 
	{
		int a[]={2,-3,7,-4,6};
		
		
		for (int i=0;i<a.length ;i++ )
		{
			
			for (int j=i;j<a.length ;j++ )
			{
				for (int k=i;k<=j ;k++ )
				{
					System.out.print(a[k]+" ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
