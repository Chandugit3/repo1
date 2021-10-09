package Assignment1;
import java.util.*;

public class Prgm6
{
	public static void main(String[] args)
	{
		System.out.println("Enter usn:");
		String usn;
		Scanner sc=new Scanner(System.in);
		usn=sc.next();
		if(usn.length()==10)
		{
			if(usn.charAt(0)=='1' || usn.charAt(0)=='2')
			{
				if(Character.isUpperCase(usn.charAt(1)) && Character.isUpperCase(usn.charAt(2)))
				{
					if(Character.isDigit(usn.charAt(3)) && Character.isDigit(usn.charAt(4)) && 
						Character.isDigit(usn.charAt(7)) && Character.isDigit(usn.charAt(8)) &&
						Character.isDigit(usn.charAt(9)))
					{
						if(usn.charAt(5)=='C' ||usn.charAt(5)=='I' ||usn.charAt(5)=='E'||usn.charAt(5)=='M')
						{
							
							if(usn.charAt(6)=='S' ||usn.charAt(6)=='C' ||usn.charAt(6)=='E')
							{
								System.out.println("Success");
							}
						}
					}
				}
			}
		}
		else
		{
			System.out.print("Failure");
		}
	}

}




	
	