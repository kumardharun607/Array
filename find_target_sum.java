import java.util.*;
class find_target_sum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []args)
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		System.out.println("Original array:"+Arrays.toString(a));
		System.out.print("Enter yor target sum:");
		int n=sc.nextInt();
		
		Arrays.sort(a);
		find_target_sum(a,n);
	}
	public static void find_target_sum(int a[],int n)
	{
		int l=0;
		int r=a.length-1;
		while (l<r)
		{
			if (a[l]+a[r]==n)
			{
				System.out.println("("+a[l]+","+a[r]+")");
				l++;
				r--;
			}
			else if(a[l]+a[r]>n)
			{
				r--;
				
			}
			else
			{
				l++;
			}
		}
	}
		
		
}