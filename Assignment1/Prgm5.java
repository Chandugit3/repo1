package Assignment1;
import java.util.*;
public class Prgm5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name 1");
		System.out.println("Enter your first name:");
		String f1=sc.next();
	
		System.out.println("Enter your middle name: ");
		String m1=sc.next();
	
		System.out.println("Enter your last name: ");
		String l1=sc.next();
	    System.out.println("Name2");
		System.out.println("Enter your first name:");
		String f2=sc.next();
	
		System.out.println("Enter your middle name: ");
		String m2=sc.next();
	
		System.out.println("Enter your last name: ");
		String l2=sc.next();
		
		System.out.println(f1+" "+m1+" "+l2);
		System.out.println(f2+" "+m2+" "+l1);
		

	}

}
