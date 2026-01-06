import java.util.*;
class  jagged_array
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[][]=new int[4][];
		a[0]=new int[2];
		a[1]=new int[5];
		a[2]=new int[3];
		a[3]=new int[5];

		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print("Enter the value for a["+i+"]a["+j+"] :");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println();

		System.out.println("Printing the array elements...............................");
		System.out.println();
		
		System.out.println("\t\t\t****************************************");
		System.out.println("\t\t\tPrint the array T2B L2R");
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\t\t\t****************************************");
		
	}
}
