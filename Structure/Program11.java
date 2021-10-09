package Structure;
import java.util.*;
public class Program11
{
	public static boolean isRowMagic(int[][] a,int rows,int col)
	{
		int sum=0;
		int temp=0;
		int res[]=new int[rows];
		for(int i=0;i<rows;i++)
		{
			sum=0;
			for(int j=0;j<col;j++)
			{
				sum=sum+a[i][j];
			}
			res[i]=sum;
		}
		for(int i=0;i<rows-1;i++)
		{
			if(res[i]!=res[i+1])
			{
				temp=1;
				break;
			}
		}
		if(temp==1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args)
	{
		int rows;
		int col;
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		rows=sc.nextInt();
		col=sc.nextInt();
		int arr[][]=new int[rows][col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		boolean res;
		res=isRowMagic(arr,rows,col);
		System.out.println(res);

	}

}
