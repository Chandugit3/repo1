package Assignment1;
import java.util.*;
public class Prgm7 
{
	public static String reverse(String s)
	{
		char c[]=s.toCharArray();
		int size=c.length;
        char[] a=new char[size];
		
		int i=0;
		while(i!=size)
		{
		    a[i]=c[size-1-i];
			i++;
		}
		String string=new String(a);
		return string;		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}

}
