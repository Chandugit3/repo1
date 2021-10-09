
import java.util.*;
public class Pc6
{
	
	
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
       System.out.println();
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int[][] a1=new int[n1][n2];
       int[][] a2=new int[n1][n2];
       System.out.println("Elements of 1st maatrix");
       for(int i=0;i<n1;i++)
       {
    	   for(int j=0;j<n2;j++)
    	   {
    		   a1[i][j]=sc.nextInt();
    	   }
       }
       
       System.out.println("Elements of 2nd maatrix");
       for(int i=0;i<n1;i++)
       {
    	   for(int j=0;j<n2;j++)
    	   {
    		   a2[i][j]=sc.nextInt();
    	   }
       }
		
    int[][] a3=new int[n1][n2];
    for(int i=0;i<n1;i++)
    {
    	for(int j=0;j<n2;j++)
    	{
    		a3[i][j]=a1[i][j]+a2[i][j];
    	}
    }
    for(int i=0;i<n1;i++)
    {
    	for(int j=0;j<n2;j++)
    	{
    		System.out.print(a3[i][j]+ " ");
    	}
    }
    
    
	}
}
