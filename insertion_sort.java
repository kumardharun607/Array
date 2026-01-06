import java.util.*;
class insertion_sort 
{
	public static void main(String[] args) 
	{
		int a[]={5,4,3,1,2};
		System.out.println("The original Array:"+Arrays.toString(a));
		//----------------------------------------------
		
		for (int i=0;i<a.length ;i++ )
		{
			int curr=a[i];
			int prev=i-1;
			while (prev>=0 && a[prev]>curr)
			{
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
		}
		System.out.println("The Sorting Array:"+Arrays.toString(a));
	}
}
