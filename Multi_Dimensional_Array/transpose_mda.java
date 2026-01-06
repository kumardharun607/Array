import java.util.*;
class  transpose_mda
{
	public static void main(String[] args) 
	{
		int a[][]={ {3,4,5},
			        {7,3,2},
			        {9,1,6}};
		
		
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}
}
