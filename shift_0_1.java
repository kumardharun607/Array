import java.util.*;
class  shift_0_1
{
	public static void main(String[] args) 
	{
		int a[]={0,1,0,1,1,0,0,1};
		System.out.println("Original array:"+Arrays.toString(a));
		int l=0;
		int r=a.length-1;
		while (l<r)
		{
			if (a[l]==0 && a[r]==1)
			{
				int temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			if (a[l]==1)
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		System.out.println("After shifting 0's and 1's array:"+Arrays.toString(a));
	}
}
