package Structure;
import java.util.*;
public class Program7 
{
	public static void show(int num1,int num2)
	{
	
		for(int i=num1;i<=num2;i++)
		{
			int temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					temp++;
				}	
			}
			if(temp==0)
			{
				System.out.print(i+",") ;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		show(num1,num2);
		
	}

}
