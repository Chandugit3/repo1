package assignment;
import java.util.*;
class Empiloyee 
{
	 int empId;
	 String empName;
	 String empDesig;
	 String empDept;
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
			if(empName.equals("null"))
			{
				System.out.println("error name");
			}
		}
		public String getEmpDesig() {
			return empDesig;
		}
		public void setEmpDesig(String empDesig) {
			
			if(empDesig.equalsIgnoreCase("Developer")||empDesig.equalsIgnoreCase("Tester")||empDesig.equalsIgnoreCase("Lead")||empDesig.equalsIgnoreCase("Manager"))
			 {
				      this.empDesig = empDesig;
			 }
			else
			{
				System.out.println("error desig");
			}
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			
		if(empDept.equalsIgnoreCase("TTH")||empDept.equalsIgnoreCase("RCM")||empDept.equalsIgnoreCase("Digital")||empDept.equalsIgnoreCase("DevOps"))
		{
			this.empDept = empDept;
		}
		else
		{
			System.out.println("Invaild dept");
		}
		
	}
}

public class Main2
{
	public static void main(String args[])
	{
		Empiloyee e=new Empiloyee();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		String empName=sc.next();
		String empDesig=sc.next();
		String empDept=sc.next();
		
		e.setEmpName(empName);
		e.setEmpDesig(empDesig);
		e.setEmpDept(empDept);
		
	}

}
