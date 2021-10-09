package Structure;
import java.util.*;
public class Program9 
{
	public static void show(int a1[],int a2[],int s1,int s2)
	{
		int a=0,b=0,c=0;
		while(a<s1&&b<s2)
		{
			if(a1[a]<a2[b])
			{
				System.out.print(a1[a]+" ");
				a++;
				c++;
			}
			else if(a2[b]<a1[a])
			{
				System.out.print(a2[b]+" ");
			}
			else
			{
				a++;b++;
			}
		}
		while(a<s1)
		{
			System.out.print(a1[a]+" ");a++;c++;
		}
		while(b<s2) {
			System.out.print(a2[b]+" ");b++;c++;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int[] a=new int[s1];
		int[] b=new int[s2];
		for(int i=0;i<s1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<s1;i++)
		{
			b[i]=sc.nextInt();
		}
		show(a,b,s1,s2);
	}

}
