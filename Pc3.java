import java.util.*;
public class Pc3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int i;int j;
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				if(i+j==r-1)
				{
				sum=sum+a[j][i];
				}
			}
		}
		System.out.println("sum of minor diagonal elements "+sum);
		sum=0;
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				if(i==j)
				{
				sum=sum+a[j][i];
				}
			}
		}
		System.out.println("sum of major diagonal elements "+sum);
		sum=0;
		
		for( i=0;i<a.length;i++)
		{
			sum=0;
			for( j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println("sum of "+i+1+"th column"+sum);
		}
		
		sum=0;

		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
			}
		}
		System.out.println(sum);	
	}
	

}
