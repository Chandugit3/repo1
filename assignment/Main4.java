package assignment;
import java.util.*;

class Customer
{
	int custId;
	String custName;
	String custAddress;
	String accType;
	double custBalance;
	public Customer()
	{
		int custId=0;
		String custName=null;
		String custAddress=null;
		String accType=null;
		double custBalance=0.0;
		
	}
	
	public Customer(int custId,String custName,String custAddress)
	{
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		System.out.println(custId);
		System.out.println(custName);
		System.out.println(custAddress);
		System.out.println();
	}
	public Customer(int custId,String custName)
	{
		this.custId=custId;
		this.custName=custName;
		System.out.println(custId);
		System.out.println(custName);
		System.out.println();
	}
	public Customer(int custId,String custName,String custAddress,String accType,double custBalance)
	{
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		this.accType=accType;
		this.custBalance=custBalance;
		System.out.println(custId);
		System.out.println(custName);
		System.out.println(custAddress);
		System.out.println(accType);
		System.out.println(custBalance);
		System.out.println();
	}
	

}
public class Main4
{

	public static void main(String[] args)
	{
		Customer customer1=new Customer(1001,"Kumar","Banglore");
		Customer customer2=new Customer(1002,"John");
		Customer customer3=new Customer(1003,"Raja","Hyderabad","Savings",10000.0);
		
		

	}

}
