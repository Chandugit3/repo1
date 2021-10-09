package Structure;
import java.util.*;
public class Program6
{
	
	public static boolean IsPrime(int num)
	{
		int temp=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
				
			}
			else
			{
				temp++;
			}
		}
		if(temp>0)
		{
			return true;
		}
		return false;
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		System.out.println(IsPrime(num));

	}

}
