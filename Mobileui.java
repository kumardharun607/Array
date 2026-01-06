
import java.util.*;
class Mobileui 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Mobile m1=Mobile.getmobileobj("Mi","128gb",25000);
		Sim sim=Sim.getsimobj("Jio","5G",700);
		boolean flag=true;
		do
		{
			System.out.println("\t\t\t****Mobile & Sim****");
			System.out.println("\n\t\t\t1.Insert sim \n\t\t\t2.Remove sim \n\t\t\t3.Check empty \n\t\t\t4.Mobile Details \n\t\t\t5.Sim details \n\t\t\t6.Exit");
			System.out.print("Enter here:");
			int opt=sc.nextInt();
			switch(opt)
			{
				case 1->{
					m1.insertsim(sim);
				}
				case 2->{
					m1.removesim();
				}
				case 3->{
					m1.isempty();
				}
				case 4->{
					System.out.println("\t\t\tXXXXXXXXX____________Mobile Details_____________XXXXXXXXXXX");
					System.out.println("Name:"+m1.getname());
					System.out.println("Storage:"+m1.getstorage());
					System.out.println("Price:"+m1.getprice());
				}
				case 5->{
					System.out.println("\t\t\tXXXXXXXXX____________Sim Details_____________XXXXXXXXXXX");
					System.out.println("Name:"+sim.getoperator_name());
					System.out.println("Storage:"+sim.slot.getband_width());
					System.out.println("Price:"+sim.slot.getprice());
				}
				default ->{
					flag=false;
				}
			}
		}
		while (flag);
		System.out.println("\t\t\tThank you");
	}
}
