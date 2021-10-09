package assignment;

import java.util.Scanner;
class Employee
{
	 int empId;
	 String empName;
	 String empDesig;
	 String empDept;
	
	public Employee()
	{
		System.out.println("default constructor");
	}
	public Employee(int empid,String empName,String empDesig,String empDept)
	{
		this.empId=empId;
		this.empName=empName;
		this.empDesig=empDesig;
		this.empDept=empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
}
public class Main1
{

	public static void main(String[] args)
	{
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int empId=sc.nextInt();
		String empName=sc.next();
		String empDesig=sc.next();
		String empDept=sc.next();
		Employee e=new Employee(empId,empName,empDesig,empDept);
		e.setEmpId(empId);;
		e.setEmpName(empName);
		e.setEmpDesig(empDesig);
		e.setEmpDept(empDept);
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpDesig());
		System.out.println(e.getEmpDept());
		

	}

}

