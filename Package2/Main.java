package Package2;

import java.util.Scanner;

class Customer
{
	private long id;
	private String name;
	private char gender;
	private String email;
	private String contactNumber;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		System.out.print("Customer id:");
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.print("Customer name:");
		return name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		System.out.print("Gender:");
		return gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		System.out.print("email:");
		return email;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getContactNumber() {
		System.out.print("contact number: ");
		return contactNumber;
	}
	
	
}
public class Main
{

	public static void main(String[] args)
	{
		Customer c1=new Customer();
		Customer c2=new Customer();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer1 details: ");
		
		System.out.println("ID:");
		int id=sc.nextInt();
		c1.setId(id);
		
		System.out.println("Name:");
		String name=sc.next();
		c1.setName(name);
		
		System.out.println("Gender:");
		char gender=sc.next().charAt(0);
		c1.setGender(gender);
	
		
		System.out.println("email:");
		String email=sc.next();
		c1.setEmail(email);
		
		System.out.println("contact number:");
		String contactNumber=sc.next();
		c1.setContactNumber(contactNumber);
		
		System.out.println("Enter the customer2 details: ");
		
		System.out.println("ID:");
		int id2=sc.nextInt();
		c2.setId(id2);
		
		System.out.println("Name:");
		String name2=sc.next();
		c2.setName(name2);
		
		System.out.println("Gender:");
		char gender2=sc.next().charAt(0);
		c2.setGender(gender2);
	
		
		System.out.println("email:");
		String email2=sc.next();
		c2.setEmail(email2);
		
		System.out.println("contact number:");
		String contactNumber2=sc.next();
		c2.setContactNumber(contactNumber2);
		
		if(email.equals(email2)&&(contactNumber.equals(contactNumber2)))
		{
			System.out.println("Customer1 and Customer2 are same");
		}
		else
		{
			System.out.println("Customer1 and Customer2 are different");
		}
		

	}

}
