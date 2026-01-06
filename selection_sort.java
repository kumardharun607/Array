import java.util.*;
class selection_sort 
{
	public static void main(String[] args) 
	{
		int a[]={8,3,4,12,18,17,1,-3,-6,2};
		System.out.println("The original Array:"+Arrays.toString(a));
		
		//--------------------------------------------------
		int s=0;
		for (int i=0;i<a.length-1 ;i++ )
		{
			s=i;
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[j]<a[s])
				{
					s=j;
				}
			}
			int temp=a[i];
			a[i]=a[s];
			a[s]=temp;
		}
		System.out.println("The Sorting  Array:"+Arrays.toString(a));
	}
}
