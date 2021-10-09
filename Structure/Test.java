package Structure;

import java.util.*;
import java.io.*;



public class Test{   
   public static void main(String args[]) 
   {
	   int temp;
	   int arr[]= {3,5,2,1,7,4,3,2,1,5,7,5};
	   for(int i=0;i<arr.length;i++)
	   {
		   
		   for(int j=0;j<arr.length-1-i;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				 
			   }
			   
		   }
		   
		 
	   }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]);
	 }
	
   }
}

 