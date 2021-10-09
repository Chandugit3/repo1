package assignment;
import java.util.*;

class Student
{
	int studentId;
	String studentName;
	float marks;
	boolean secondChance;
	public Student(int studentId,String studentName,boolean secondChance)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.secondChance=secondChance;
		
	}
	public void identifyMarks(float marks)
	{
		this.marks=marks;
		System.out.println(marks);
	}
	public void identifyMarks(float marks1,float marks2)
	{
		if(marks1>marks2)
		{
			this.marks=marks1;
		}
		else 
		{
			this.marks=marks2;
		}
		System.out.println(marks);
			
	}
	
	
}
public class Main5
{
	
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int studentId=sc.nextInt();
		String studentName=sc.next();
		float marks1=sc.nextFloat();
		float marks2=sc.nextFloat();
		boolean secondChance=sc.nextBoolean();
		Student s=new Student(studentId,studentName,secondChance);
		if(secondChance=true)
		{
			s.identifyMarks(marks1,marks2);
		}
		else
		{
			s.identifyMarks(marks1);
		}
		
	}
	

}
