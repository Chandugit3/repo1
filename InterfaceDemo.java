import java.util.*;

public class InterfaceDemo
{

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int asciiValue=s.charAt(i);
			System.out.println(s.charAt(i)+"="+asciiValue);
		}
	    
	}

}
