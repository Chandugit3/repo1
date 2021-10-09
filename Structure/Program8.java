package Structure;
import java.util.*;
public class Program8 
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the figure type: ");
    	String s=sc.nextLine();
    	if(s.equalsIgnoreCase("Triangle"))
    	{
    		double b=sc.nextDouble();
    		double h=sc.nextDouble();
    		double area=(b*h)/2;
    		System.out.println(String.format("%.2f",area));
    	}
    	else if(s.equalsIgnoreCase("Rectangle"))
    	{
    		double w=sc.nextDouble();
    		double l=sc.nextDouble();
    		double area=w*l;
    		System.out.println(String.format("%.2f",area));
    	}
    	else if(s.equalsIgnoreCase("Square"))
    	{
    		double a=sc.nextDouble();
    		double area=a*a;
    		System.out.println(String.format("%.2f",area));
    	}
    	else if(s.equalsIgnoreCase("Circle"))
    	{
    		double r=sc.nextDouble();
    		double area=3.14*(r*r);
    		System.out.println(String.format("%.2f",area));
    				
    	}
    }
}
