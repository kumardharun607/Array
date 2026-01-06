import java.util.*;
class  check_duplivate_element_present_or_not
{
	public static void main(String[] args) 
	{
		int a[]={6,3,7,9,8,8,8,3,4,0};
		
		/*
		
		step1:check array length
		      if length=2
			  if(a.length==2)
		      {
				  if(a[0]==a[1])
		          {
					  return true;
	              }
	          }
			*/
		Arrays.sort(a);
		if (check_duplicate(a))
		{
			System.out.println("Yes Duplicate Found......");
		}
		else
		{
			System.out.println("Sorry Duplicate Not Found......");
		}
		
	}
	public static boolean check_duplicate(int a[])
	{
		if(a.length==2)
		 {
				  if(a[0]==a[1])
		          {
					  return true;
	              }
	     }
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==a[i+1])
		    {
				return true;
		     }
		}
		return false;
	}
}
