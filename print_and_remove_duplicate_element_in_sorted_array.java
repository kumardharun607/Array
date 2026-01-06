import java.util.*;
class  print_and_remove_duplicate_element_in_sorted_array
{
	public static void main(String[] args) 
	{
		int res[]={6,3,7,9,8,8,8,3,4,0};
		System.out.println("The Original Array:"+Arrays.toString(res));
		Arrays.sort(res);
		System.out.println("The Sorted Array:"+Arrays.toString(res));
		int count=0;
		for (int i=0;i<res.length-1 ;i++ )
		{
			
			if (res[i]==res[i+1])
			{
				count++;
				res[i]=Integer.MIN_VALUE;
			}
		}
			
		
		int a[]=new int[res.length-count];
		for (int i=0,x=0;i<res.length ;i++ )
		{
			if (res[i]==Integer.MIN_VALUE)
			
				continue;
			
			a[x++]=res[i];
    
		}
		System.out.println("Remove duplicate element Array:"+Arrays.toString(a));
		
	}
		
	
}

