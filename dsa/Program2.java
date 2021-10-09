package dsa;

import java.util.Scanner;

public class Program2
{
	Scanner sc=new Scanner(System.in);
	
	public static boolean show(int a[],int srch)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
	
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==srch)
			{
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched:");
		int srch=sc.nextInt();
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println(show(a,srch));

	}

}
