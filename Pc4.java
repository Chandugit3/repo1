import java.util.*;
public class Pc4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int sum=0; int sumM=0,summ=0;
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
				sum=sum+a[i][j];
			}	
		}
		System.out.println(sum);
		int sum1=sum/r;
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[i][j];
			}	
			System.out.println("sum of "+i+"th row is "+sum);
		}
		int sum2=sum;
		if(sum1==sum2)
		{
			System.out.println("row magic");
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum=0;
			
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
			}	
			System.out.println("sum of "+i+"th column is "+sum);
		}
		int sum3=sum;
		if(sum1==sum3)
		{
			System.out.println("column magic");
		}
	
		
	}

}
