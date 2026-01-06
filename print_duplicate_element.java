import java.util.*;
class  digit_frequency_element
{
	public static void main(String[] args) 
	{
		int res[]={6,3,7,9,8,8,8,3,4,0};
		System.out.println("The Array:"+Arrays.toString(res));
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
