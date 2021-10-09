package Structure;
import java.util.*;
public class Program3 
{
	
	public static String show(String s)
	{
		return s;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name: ");
		String s=sc.nextLine();
		System.out.println("Hello, "+ show(s)+"!");
	}

}
