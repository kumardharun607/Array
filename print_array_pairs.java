import java.util.*;
class print_array_pairs 
{
	public static void main(String[] args) 
	{
		int a[]={2,-3,7,-4,6};
		
		
		for (int i=0;i<a.length ;i++ )
		{
			
			for (int j=i+1;j<a.length ;j++ )
			{
				
				System.out.print("("+a[i]+","+a[j]+")\t");
			}
			System.out.println();
		}
		
	}
}
