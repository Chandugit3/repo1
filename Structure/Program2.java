package Structure;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array1: ");
		int size1=sc.nextInt();
		double[] a1=new double[size1];
		System.out.println("Enter the elements of array1: ");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextDouble();
		}
		System.out.println("Enter the size of array2: ");
		int size2=sc.nextInt();
		double[] a2=new double[size2];
		System.out.println("Enter the elements of array2: ");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextDouble();
		}
		
		int[] a3={};
		if(size1>size2)
		{
			a3=new int[size1];
		}
		else
		{
			a3=new int[size2];
		}
		
		for(int i=0;i<a3.length;i++)
		{
				if(i<size1&&i<size2)
				{
				   a3[i]=(int)(a1[i]+a2[i]);
			    }
				else if(i>=size1)
				{
					a3[i]=(int)a2[i];
				}
				else if(i>=size2)
				{
					a3[i]=(int)a1[i];
				}	
		}
		for(int i=0;i<a3.length;i++)
		{
			System.out.print(a3[i]+" ");
		}
	}
}
