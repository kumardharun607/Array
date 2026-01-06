import java.util.*;
class  find_nth_largest_smallest_by_sortedarray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		
		System.out.println("Original array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting the  array:"+Arrays.toString(a));
		System.out.print("Enter the value for nth largest:");
		int largest_n=sc.nextInt();
		System.out.print("Enter the value for nth largest:");
		int smallest_n=sc.nextInt();
		System.out.println("The "+largest_n+"th largest value is:"+a[a.length-largest_n]);
		System.out.println("The "+smallest_n+"th smallest value is:"+a[smallest_n-1]);



	}
}
