package Assignment1;
import java.util.*;
public class Prgm1
{
	public static void main(String args[])
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
		String temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length-1-i;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
