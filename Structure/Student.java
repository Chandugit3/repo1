package Structure;
import java.util.*;
public class Student 
{
	String name;
	int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public static void main(String args[])
	{
		System.out.println();
		Student[] s=new Student[5];
		setAll(s);
		getAll(s);
		
	}
	public static void setAll(Student s[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int marks;
		for(int i=0;i<s.length;i++)
		{
			name=sc.next();
			marks=sc.nextInt();
			s[i].setName(name);
			s[i].setMarks(marks);
		}
	}
	public static void getAll(Student s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println("name:"+s[i].getName()+"\n"
					          + "marks:"+s[i].getMarks()+
					          "\n**\n"
					           
					                                   );
		}
	}

}
