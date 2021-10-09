package Structure;


import java.util.*;

public class Program1
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of array: ");
    	int size=sc.nextInt();
    	int sum=0;
    	int[] arr=new int [size];
    	System.out.println("Enter the elements of array: ");
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	for(int i=0;i<arr.length;i++)
    	{
    		sum=sum+arr[i];
    	}
    	System.out.println("Sum of the elements of array is: "+sum);
     
    	
    }
}
