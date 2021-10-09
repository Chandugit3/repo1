package Assignment1;

import java.util.Scanner;

public class Prgm2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		

	}

}
