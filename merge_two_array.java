import java.util.*;
class  merge_two_array
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		int b[]={0, 3, 3, 4, 6, 7, 8, 8, 8, 9};
		int res[]=new int[a.length+b.length];
		System.out.println("Array A:"+Arrays.toString(a));
		
		System.out.println("Array B:"+Arrays.toString(b));

		for (int i=0,x=0,y=0;i<res.length ;i++ )
		{
			if (x<a.length)
			{ 
				res[i]=a[x++];
			}
			else if(y<b.length)
			{
				res[i]=b[y++];
			}
		}
		System.out.println("Merging two array:"+Arrays.toString(res));
		



	}
}
