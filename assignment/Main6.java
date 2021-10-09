package assignment;
import java.util.*;

class Students
{
	int id;
	String name;
	String branch;
	String score;
	
	public void show(int id,String name,String branch,String score)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.score=score;
	}
	
}

public class Main6 
{
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Students[] s=new Students[n];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Students();
		}
		for(int i=0;i<s.length;i++)
		{
			int id=sc.nextInt();
			String name=sc.next();
			String branch=sc.next();
			String score=sc.next();
		}
		
	}

}
