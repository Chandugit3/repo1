package Structure;
import java.util.*;
public class Program10
{
	public static void show(int a1[][],int a2[][],int row,int col )
	{
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=a1[i][j]+a2[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a1[][]=new int[row][col];
		int a2[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a2[i][j]=sc.nextInt();
			}
		}
		show(a1,a2,row,col);	
	}			
}


