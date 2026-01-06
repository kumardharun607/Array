import java.util.*;
class  counting_sort
{
	public static void main(String[] args) 
	{
		int a[]={7,3,4,1,7,6,3,2,1,8,4,1};
		System.out.println("The Original Array:"+Arrays.toString(a));
		//------------------------------------------------
		int largest=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>largest)
			{
				largest=a[i];
			}
		}
		int res[]=new int[largest+1];
		System.out.println("The largest value is:"+largest);
		
		for (int i=0;i<a.length ;i++ )
		{
			res[a[i]]++;
		}
		System.out.println("The RES array:"+Arrays.toString(res));
		
		for (int i=0,x=0;i<res.length ;i++ )
		{
			while (res[i]>0)
			{
				a[x++]=i;
				res[i]--;
				
			}
		}
		System.out.println("The Sorting  array:"+Arrays.toString(a));
	}
}
