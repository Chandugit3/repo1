package Structure;
import java.util.*;
public class Program4
{
	
	public static int getMax(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
		   return a;
		}
		else if(b>a&&b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("The maximal of three numbers is:");
		System.out.print(getMax(a,b,c));	
	}
}
