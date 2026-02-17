import java.util.*;
public class count_pointer {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String s="8459761203";
		String ss[]=s.split("");
		int a[]=new int[s.length()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(ss[i]);
		}
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		String ns=n+"";
		String nsa[]=ns.split("");
		int b[]=new int[nsa.length];
		for(int i=0;i<nsa.length;i++)
		{
			b[i]=Integer.parseInt(nsa[i]);
		}
		int count=0;
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			int num=b[i];
			int res=find_point(num,a);
			if(res<count || count<res)
			{
				sum+=Math.abs(count-res);
				count=res;
			}
			if(res==count)
			{
				sum+=0;
			}
		}
		System.out.println(sum);
	}
		public static int find_point(int n,int a[])
		{
			int count=0;
			
			for(int j=0;j<a.length;j++ )
			{
				count++;
				if(n==a[j])
				{
					return count;
				}
			}
			return 0;
		}
		
	

}
