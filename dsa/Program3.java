package dsa;

import java.util.Scanner;

public class Program3 
{
	public static boolean findElement(int a[],int key)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
	
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
		if(a[mi]==key)
		{
			return true;
			
		}
		else if(a[mi]<key)
		{
			li=mi+1;
		}
		else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
		}
	 return false;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched:");
		int key=sc.nextInt();
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println(findElement(a,key));
		
	}

}
