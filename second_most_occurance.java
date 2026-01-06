import java.util.*;
class  second_most_occurance
{
	public static void main(String[] args) 
	{
		int a[]={6,3,7,8,8,8,3,3,4,0,0,0,0};/*{7,3,4,1,7,6,3,2,1,8,4,1};*/
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
		int temp[]=res.clone();
		
		
		int largest_occ=Integer.MIN_VALUE;
		for (int i=1;i<= 2;i++ )
		{
			largest_occ=find_largest(res);
			replace_largest(res,largest_occ);
		}
		for (int i=0;i<temp.length ;i++ )
		{
			if (temp[i]==largest_occ)
			{
				System.out.println(i);
			}
		}
		
		
	}
		public static int find_largest(int a1[])
	{
		
		int largest_n=Integer.MIN_VALUE;
		for (int i=0;i<a1.length ;i++ )
		{
			if (a1[i]>largest_n)
			{
				largest_n=a1[i];
			}
		}
		return largest_n;
		
	}
	public static void replace_largest(int a1[],int largest_n)
	{
		for (int i=0;i<a1.length ;i++ )
		{
			if (a1[i]==largest_n)
			{
				a1[i]=Integer.MIN_VALUE;
				break; // only replace one occurrence
			}
		}
	}
		
	
}
