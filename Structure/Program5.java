package Structure;
import java.util.*;
public class Program5
{
	public static int show(int a)
	{
		int rem=0;
		int rev=0;
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev;
	}
   
    	public static void main(String args[])
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the number: ");
    		int a=sc.nextInt();
    		System.out.println(show(a));
    	}
    
}
