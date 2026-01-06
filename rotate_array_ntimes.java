import java.util.*;
class  rotate_array_ntimes
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		
		System.out.println("Array A:"+Arrays.toString(a));
		
		System.out.println("Enter the value for rotae the array:");
		int n=sc.nextInt();

		for (int i=1;i<=n ;i++ )
		{
			int first=a[0];
			for (int j=1;j<a.length ;j++ )
			{
				a[j-1]=a[j];
				
			}
			a[a.length-1]=first;
		}
		
		System.out.println("after rotating Array A:"+Arrays.toString(a));
		



	}
}
