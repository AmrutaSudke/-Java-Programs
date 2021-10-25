import java.util.Scanner;

class ReverseofaString
{
	public static void main(String[] arg)
	{
	ReverseofaString rev=new ReverseofaString();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  str=sc.nextLine();	
	System.out.println("Reverse of a String  is : "+rev.reverse(str));
	}
static String reverse(String s)
	{
	String rev="";
	for(int j=s.length();j>0;--j)
	{
	rev=rev+(s.charAt(j-1)); 
	}
	return rev;
	}
}

// OUTPUT:
// PS E:\Felix-It\java> javac  ReverseofaString.java
// PS E:\Felix-It\java> java  ReverseofaString      
// Enter a string : Amruta
// Reverse of a String  is : aturmA
// PS E:\Felix-It\java> 