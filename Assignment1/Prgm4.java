package Assignment1;
import java.util.*;
public class Prgm4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name:");
		String f=sc.next();
	
		System.out.println("Enter your middle name: ");
		String m=sc.next();
	
		System.out.println("Enter your last name: ");
		String l=sc.next();
	
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Password generating...");
		System.out.print(f.charAt(0)+""+m.charAt(0)+""+l.charAt(0)+""+age);
		

	}

}
