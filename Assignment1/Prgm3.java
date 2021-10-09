package Assignment1;
import java.util.*;
public class Prgm3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name:");
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(a[i]>='A' && a[i]<'Z')
			{
				System.out.print(a[i]+ " ");
			}
		}
		
	}

}
