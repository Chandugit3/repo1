package Structure;
import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(n!=1)
		{
			if(n%2==0)
			{
				temp=temp/2;
				System.out.println(n+" is even so i take half: "+temp);
				n=temp;
			}
			else
			{
				temp=3*n+1;
				System.out.println(n+" is odd so i make 3n+1: "+temp);
				n=temp;
			}
			count++;
		}
		System.out.println("There are total "+count+" steps to reach 1");
		
	}

}
