package dsa;
import java.util.*;
public class Program5
{
	public static void main()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		 int n=sc.nextInt();
		 int[] a=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			int temp,j;
			for(int i=1;i<a.length;i++)
			{
				temp=a[i];
				j=i;
				while(j>0 && a[j-1]>temp)
				{
					a[j]=a[j-1];
					j=j-1;
				}
				a[j]=temp;
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			
	}

}
