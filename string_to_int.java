import java.util.*;
class string_to_int 
{
	public static void main(String[] args) 
	{
		int s=100;
		String b=s+"Dharun";                 //convert int to string
		String a=String.valueOf(s);    //convert int to string
		System.out.println(a);
		System.out.println(b);
		char c[]=b.toCharArray();       //convert string to char array
		System.out.println(c);          //to print char array no need to use Arrays.toString
		String d="";
		System.out.println(d.isEmpty()); //to check wheather the string is empty
		String e="Hi iam from tiruppur";
		String e1[]=e.split(" ");        //split string into array
		System.out.println(Arrays.toString(e1));
		String f="banana";
		             //replace the new character
		System.out.println(f.replace('a','o'));
		System.out.println(e.startsWith("Hi")); //check wheather the string will be starts with this string
	    System.out.println(e.endsWith("ur"));   //check wheather the string will be ends with this string
        System.out.println(f.indexOf('a')); 
        System.out.println(f.lastIndexOf('a')); 
		System.out.println(f.indexOf('i'));
		String f1="BaNaNa";
		System.out.println(f.equals(f1)); 
		System.out.println(f.equalsIgnoreCase(f1));
		System.out.println(b.substring(2)); 
		System.out.println(e.substring(11,18)); 

		System.out.println(f.toUpperCase());
		System.out.println(f1.toLowerCase());




		
		

	}
}
