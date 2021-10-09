package assignment5;
import java.util.*;

class Employee
{
	int empId;
	String empName;
	String empDesig;
	String empDept;
	
	public Employee(int empId,String empName,String empDesig,String empDept)
	{
		this.empId=empId;
		this.empName=empName;
		this.empDesig=empDesig;
		this.empDept=empDept;
		
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpDesig(String empDesig)
	{
		this.empDesig=empDesig;
	}
	public String getEmpDesig()
	{
		return empDesig;
	}
	public void setEmpDept(String empDept)
	{
		this.empDept=empDept;
	}
	public String getEmpDept()
	{
		return empDept;
	}
}
public class Program1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("");
     Employee e=new Employee(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextLine());
     
	}

}
