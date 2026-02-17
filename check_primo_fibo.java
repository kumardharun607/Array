import java.util.*;
public class check_primo_fibo {

     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a starting number:");
		int a=sc.nextInt();
		System.out.print("Enter a Ending number:");
		int b=sc.nextInt();
		ArrayList al=check_fibo(a,b);
		for(int i=a;i<=b;i++)
		{
			if(check_prime(i) && al.contains(i))
			{
				System.out.println("Number : "+i);
			}
		}
		
		
	}
	public static boolean check_prime(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static ArrayList check_fibo(int a,int b)
	{
		ArrayList al=new ArrayList();
		boolean flag=true;
		int n1=0;
		int n2=1;
		int n3=0;
		while(flag)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			if(n3>=a && n3<=b)
			{
				al.add(n3);
			}
			if(n3>b)
			{
				flag=false;
			}
			
			
		}
		return al;
	}
}
