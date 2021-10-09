package Structure;
import java.util.*;
public class Program12 
{
	static boolean isMagic(int arr[][],int k)
	{
		int sd1=0;
		int sd2=0;
		for(int i=0;i<k;i++)
		{
			sd1=sd1+arr[i][i];
			sd2=sd2+arr[i][k-1-i];
		}
		if(sd1!=sd2)
		{
			return false;
		}
		for(int i=0;i<k;i++)
		{
			int rs=0;int cs=0;
			for(int j=0;j<k;j++)
			{
				rs=rs+arr[i][j];
				cs=cs+arr[j][i];
			}
			if(rs!=cs||cs!=sd1)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		if(isMagic(arr,n))
		{
			System.out.println("Magic");
		}
		else
		{
			System.out.println("No Magic");
		}
		
	}

}
