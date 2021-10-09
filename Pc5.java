import java.util.*;
class Employee
{
	public String name;
	public double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	
   }	
}

public class Pc5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int N=sc.nextInt();
		Employee[] e=new Employee[N];
		instantiateAll(e);
		setAll(e);
		getAll(e);
	}
	public static void instantiateAll(Employee[] e)
	{
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee();
		}
	}
	
	public static void setAll(Employee[] e)
	{
		Scanner sc=new Scanner(System.in);
		String name;
		double salary;
		for(int i=0;i<e.length;i++)
		{
			name=sc.next();
			salary=sc.nextDouble();
			e[i].setName(name);
			e[i].setSalary(salary);		
		}
	
	}

	public static void getAll(Employee[] e)
	{
		System.out.println("Enter the salary");
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		for(int i=0;i<e.length;i++)
		{
			
			if(e[i].getSalary()>d)
			{
				System.out.println(e[i].getName()+"\n"+e[i].getSalary()
						+"\n   \n");
			}
			
		}
	}

}
