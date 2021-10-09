package Package1;
import java.util.*;
public class Customer 
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
		
		return email;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getContactNumber() {
		
		return contactNumber;
	}
	public static void main(String[] args)
	{
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer details: ");
		
		System.out.println("ID:");
		int id=sc.nextInt();
		c.setId(id);
		
		System.out.println("Name:");
		String name=sc.next();
		c.setName(name);
		
		System.out.println("Gender:");
		char gender=sc.next().charAt(0);
		c.setGender(gender);
	
		
		System.out.println("email:");
		String email=sc.next();
		c.setEmail(email);
		
		System.out.println("contact number:");
		String contactNumber=sc.next();
		c.setContactNumber(contactNumber);
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getGender());
		System.out.println("Customer contact details:"+c.getContactNumber()+","+c.getEmail());
		
	}

}
