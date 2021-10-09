import java.util.*;
public class Pc2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;	
		}
		
	}
}
