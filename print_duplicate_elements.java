import java.util.*;
class  print_duplicate_elements
{
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		int temp[]=a.clone();
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==Integer.MIN_VALUE)
				continue;
			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[i]==a[j])
				{
					
					a[j]=Integer.MIN_VALUE;
					count++;
				}
			}
		}
		
		int res[]=new int[count];
		for (int i=0,x=0;i<a.length ;i++ )
		{
			if (a[i]==Integer.MIN_VALUE)
			{
				int dup_value=temp[i];
				res[x++]=dup_value;
			
		}
		}
		digit_frequency(res);
		
	}
	public static void digit_frequency(int res[])
	{
		
		for (int i=0;i<res.length ;i++ )
		{
			int count=1;
			if (res[i]==Integer.MIN_VALUE)
				continue;
			for (int j=i+1;j<res.length ;j++ )
			{
				if (res[i]==res[j])
				{
					
					res[j]=Integer.MIN_VALUE;
					count++;
				}
			}
			System.out.println(res[i]+"-"+count);
		}
	}
		
		
		
	

}
